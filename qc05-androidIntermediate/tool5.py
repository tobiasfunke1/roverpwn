# -*- coding: utf-8 -*-

hex_solution = b"\x50\x55\x54\x7e\x4a\x71\x7f\x54\x6d\x5d\x79\x5f\x74\x72\x5b\x7e\x7f\x7f\x8f"
offsets = list(range(0, len(hex_solution)))

solution = bytes([b - o for b, o in zip(list(hex_solution), offsets)])
print(solution)
