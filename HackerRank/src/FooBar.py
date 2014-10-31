__author__ = 'sid'

def FooBar():
    for i in range(1,75,1):
        if i % 35 == 0: print "FooBar"
        if i % 5 == 0: print "Foo"
        if i % 7 == 0: print "Bar"
        else:
            print i

if __name__ == "__main__":
    FooBar()

