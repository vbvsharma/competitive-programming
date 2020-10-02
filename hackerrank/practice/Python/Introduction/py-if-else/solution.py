#!/bin/python3

N = int(input())

if N % 2 == 1:
    print("Weird")
elif (2 <= N and N <= 5) or 20 < N:
    print("Not Weird")
else:
    print("Weird")
