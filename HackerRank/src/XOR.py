__author__ = 'sid'
# """
# Given two integers: L and R,
#
# find the maximal values of A xor B given, L <= A <= B <= R
#
# Input Format
# The input contains two lines, L is present in the first line.
# R in the second line.
#
# Constraints
# 1 <= L <= R <= 103
#
# Output Format
# The maximal value as mentioned in the problem statement.
# """

import sys, math


def maxXor(l, r):
    highest = 0
    for i in range(l, r + 1):
        for j in range(l, r + 1):
            xor = i ^ j
            if xor > highest: highest = xor
    return highest


_l = int(raw_input())

_r = int(raw_input())
if (1 <= _l) and (_l <= _r) and (_r <= math.pow(10, 3)):
    res = maxXor(_l, _r)
    print(res)
else:
    sys.exit(0)