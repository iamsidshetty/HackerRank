__author__ = 'sid'

import sys

def stringReverse(String):
    print String[::-1]

def strRev(string):
    for i in range(len(string)-1, -1, -1):
        sys.stdout.write(string[i])

if __name__ == "__main__":
    string = raw_input('Enter the string:')
    stringReverse(string)
    strRev(string)

