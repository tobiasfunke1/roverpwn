from itertools import permutations
import struct

from tabulate import tabulate
from tqdm import tqdm
import zlib

content = open("Screenshot_20230808-pixel6pro.png", "rb").read()

chunks = []
last_offset = 0
for i in range(len(content)):
    if content[i:i + 4] in (b"IHDR", b"sRGB", b"sBIT", b"IDAT", b"IEND"):
        offset = i - 4
        if last_offset != offset:
            chunks.append(
                {"type": b"raw", "offset": last_offset, "data": content[last_offset:offset], "chksum": b""})

        typ = content[i:i + 4]
        data_len = int.from_bytes(content[offset:offset + 4], 'big')
        data = content[offset + 8:offset + 8 + data_len]
        chksum = content[offset + 8 + data_len:offset + 8 + data_len + 4]
        chunks.append({"type": typ, "offset": offset, "data": data, "chksum": chksum})

        last_offset = offset + 8 + data_len + 4

headers = ["type", "offset", "offset", "len", "data", "chksum"]
table_data = [[i, c['type'], c['offset'], hex(c['offset']), len(c['data']), c['data'][:30].hex(), c['chksum'].hex()] for i, c
              in enumerate(chunks)]
print(tabulate(table_data, headers=headers))

print("ihdr:")
ihdrs = [c["data"] for c in filter(lambda c: c['type'] == b"IHDR", chunks)]
for ihdr in ihdrs:
    width, height, bit_depth, colour_type, compression_method, filter_method, interlace_method = struct.unpack(">IIBBBBB", ihdr)
    print("\twidth", width)
    print("\theight", height)
    print("\tbit_depth", bit_depth)
    print("\tcolour_type", colour_type)
    print("\tcompression_method", compression_method)
    print("\tfilter_method", filter_method)
    print("\tinterlace_method", interlace_method)
    print()

# idats = [c["data"] for c in filter(lambda c: c['type'] == b"IDAT", chunks)]
# for i in range(1, len(idats)):
#    for j, p in tqdm(enumerate(permutations(idats, i)), desc=f"{i}/{len(idats)}"):
#        try:
#            tmp = b''.join(p)
#            zlib.decompress(tmp)
#            print(i, j, tmp)
#        except Exception as e:
#            #print(e)
#            pass

#idats = [c["data"] for c in filter(lambda c: c['type'] == b"IDAT", chunks)]
#tmp = b''.join(idats[:9] + idats[11:])

#with open("zlib2.bin", "wb") as f:
#    f.write(b''.join(idats[11:]))

#decompressor = zlib.decompressobj()
#decompressor.decompress(tmp)

idats = [c["data"] for c in filter(lambda c: c['type'] == b"IDAT", chunks)]
raws = [c["data"] for c in filter(lambda c: c['type'] == b"raw", chunks)]
zlib_data = b''.join(idats)

zlib_data0 = b''.join(idats[:10])
zlib_data1 = b''.join([raws[1][:-4], *idats[10:]])
streams0 = zlib_data0.split(b"\x78\x9c")
streams1 = zlib_data1.split(b"\x78\x9c")

print()
#decompressor = zlib.decompressobj()
#tmp = decompressor.decompress(zlib_data)

#with open("png.raw", "wb") as f:
#    f.write(tmp)





with open("screenshot.png", "wb") as f:
    for i, c in enumerate(chunks):
        #if i in [14, 15]:
        #    continue

        if c["type"] == b"raw":
            f.write(c["data"])
        elif c["type"] == b"IHDR":
            width, height, bit_depth, colour_type, compression_method, filter_method, interlace_method = struct.unpack(">IIBBBBB", c['data'])
            tmp = struct.pack(">IIBBBBB", width, 3120, bit_depth, colour_type, compression_method, filter_method, interlace_method)

            h_len = len(tmp).to_bytes(4, "big")
            f.write(h_len)
            f.write(c["type"])
            f.write(tmp)
            f.write(zlib.crc32(c["type"]+tmp).to_bytes(4, "big"))
        else:
            f.write(len(c['data']).to_bytes(4, "big"))
            f.write(c["type"])
            f.write(c["data"])
            f.write(c["chksum"])
