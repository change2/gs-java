__author__ = 'changejava'
file = 'C:/tmp/2.txt'
# read file once completed
# print('run read file once completed')
# f = open(file, 'r', -1, 'utf-8')
# lines = f.readlines()
# f.close()
# for line in lines:
# print(line)
# f = open('D:/work/shclearing/oracle/guitai.sql')
# line = f.readline()
# while line:
# print(line)
# line = f.readline()
# f.close()
def hello():
    print('hello world')


def open1(f, encode):
    return open(f, 'r', -1, encode)


def close(f):
    f.close()
    return


def add(a, b):
    return a + b


f = open1(file, 'utf-8')

for line in iter(f):
    print(line),
close(f)
hello()

result = add(1, 2)
print(result)

a = int(1)
b = int(2)
if a > b:
    print(a, ">", b)
else:
    print(a, "<", b)
age = 30
if age <= 18:
    print(age, "小于18岁未成年")
elif age >= 30 & age <= 50:
    print(age, "成年")
else:
    print(age, "unkown age")

map(lambda x: int(x), ['1', '2', '3'])
print(map)

dict([(1, 2), (3, 4), (5, 6)])

print(dict)

a = ['a', 1, 'b', 2, 'c', 3]
# new_list = old_list[start:stop:step]
print(a[::2])
print(a[0::2])
print(a[1::3])

wFile = 'C:/tmp/one.txt'


def w1(f, mode):
    return open(f, mode)


def r1(f, mode):
    return open(f, mode)


# w = w1(wFile, 'w')
# w.write("line one\nline two\nline three\n")
# w.close()

wp = w1(wFile, 'a')
wp.write("\nappend one\nappend two")
wp.close()
rFile = 'C:/tmp/2.txt'

rf = r1(rFile, 'r')
wf = w1(wFile, 'a')
for line in iter(rf):
    wf.write(line)
rf.close()
wf.close()