__author__ = 'changejava'
import gc


class Fruit:
    def __init__(self, name, color):
        self.__name = name
        self.__color = color

    def getColor(self):
        return self.__color;

    def setColor(self, color):
        self.__color = color


if __name__ == '__main__':
    fruit = Fruit('zhangsan','red')
    print gc.get_referents(fruit)
    del fruit
    print gc.collect()
