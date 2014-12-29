__author__ = 'changejava'
dir(__builtins__)
a = ['a', 'string', 'array']
s = 'a string'
# method 1
import os
import sys

# method 3, don't use - there's an extra comma at the end too!
result = ''
for s in a:
    result += s + ', '

print(result)
txt = 'C:/tmp/2.txt'
path_isfile = os.path.isfile('%s' % txt)
print(path_isfile)
print(isinstance(a, list))
print(isinstance(s, str))
print(isinstance(s, list))

for arg in sys.argv:
    print(arg)


# read file
f = open(txt, 'r', -1, "utf-8")
lines = f.readlines()
f.close()
for line in lines:
    print (line),

sys.exit(1)
