__author__ = 'changejava'
import time
import random
import os

time.sleep(5 * random.random())

l = os.listdir('c:/')
for item in l:
    print(item)
l = filter(lambda x: x.endswith('.html'), os.listdir('c:/'))
for item in l:
    print(item)

l = filter(lambda y: y.endswith('.html'), os.listdir('c:/'))
for item in l:
    print(item)