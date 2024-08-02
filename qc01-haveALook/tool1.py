# -*- coding: utf-8 -*-

from PIL import Image
from pathlib import Path

qr_file = Path("challenge.jpg")

qr_img = Image.open(str(qr_file.absolute()), "r")

print()

