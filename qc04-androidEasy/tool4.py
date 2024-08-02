# -*- coding: utf-8 -*-

smily_solution = "🐌🦗🦎🦈😿🦍😸😽😿🐍😻🦗😾😻🦎😻🙈🐍🦑😾😻😸🎛😻🐍🧸"
translation = {
    'a': "😸",
    'b': "🐱",
    'c': "😹",
    'd': "😺",
    'e': "😻",
    'f': "😼",
    'g': "😽",
    'h': "😾",
    'i': "😿",
    'j': "🙀",
    'k': "🐆",
    'l': "🐅",
    'm': "🦍",
    'n': "🐍",
    'o': "🦑",
    'p': "🐌",
    'q': "🐊",
    'r': "🦎",
    's': "🙈",
    't': "🦗",
    'u': "🎮",
    'v': "🎛",
    'w': "℡",
    'x': "💿",
    'y': "🖪",
    'z': "🎥",
    '{': "🦈",
    '}': "🧸",
}
inv_translation = {v: k for k, v in translation.items()}

solution = "".join([inv_translation[c] for c in smily_solution])
print(solution)
