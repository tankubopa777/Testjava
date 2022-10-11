# listnumber = [1,2,3,4,5]
# listnewnumber = []
# for i in listnumber:
#     number = 1 
#     for q in listnumber:
#         if q != i:
#             number *= q    
#     listnewnumber.append(number)
# print(listnewnumber)

# n = int(input())
# q = 1
# # Write an answer using print
# # To debug: print("Debug messages...", file=sys.stderr, flush=True)
# print(1)
# while(q != n):
#     if (q+2) > n :
#         break
#     else :
#         q += 2
#         print(q)

# word = ""
# n = int(input())
# for i in range(n):
#     k = int(input())
#     if k > 0 :
#         word += "Foo "
#         if k % 2 == 0 :
#             word += "& Baz"
#         elif k % 2 == 1 :
#             word += "& Quz"
#     elif k < 0 :
#         word += "Quz "
#         if k % 2 == 0 :
#             word += "& Baz"
#         elif k % 2 == 1 :
#             word += "& Quz"
# print(word)
    

# n = int(input())
# word = ""
# # Write an answer using print
# # To debug: print("Debug messages...", file=sys.stderr, flush=True)

# for i in str(n) :
#     if int(i) % 2 == 0 :
#         word += "#"
#     else :
#         word += "*"
# print(word)


# import sys
# import math

# # Auto-generated code below aims at helping you parse
# # the standard input according to the problem statement.

# t = 'Sunday Monday Tuesday Wednesday Thursday Friday Saturday'.split()

# d = input()
# n = int(input())

# print(t[(t.index(d)+n)%7])

# n = int(input())
# water = input()
# for i in range(n-1):
#     print(f'{" "*(i+1)}{water}')



# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)

# n = int(input())
# x16 = str(hex(n))
# x2 = str(bin(n))
# x8 = str(oct(n))
    

    
# print(f"{x16[1:]}{x2[1:]}{x8[1:]}")

# n = int(input())
# t = input().split()
# q = []
# q2 = []
# q1 = 0
# while (q1<n):
#     q1 += 1
#     q.append(q1)
# for i in t:
#     q2.append(int(i))
# for i in q :
#     if i not in q2 :
#         print(f"{i} is absent")
#     else :
#         print(f"{i} is here")

# n = int(input())
# p1 = 0
# p2 = 0 
# l1 = []
# l2 = []
# x = input().split()
# y = input().split()

# for i in x :
#     l1.append(i)
# for q in y :
#     l2.append(q)

# for i in range(len(l1)):
#     if l1[i] == "ROCK" and l2[i] == "SCISSORS":
#         p1 += 1 
#     elif l1[i] == "SCISSORS" and l2[i] == "PAPER":
#         p1 += 1
#     elif l1[i] == "PAPER" and l2[i] == "ROCK":
#         p1 += 1 
#     elif l2[i] == "PAPER" and l1[i] == "ROCK":
#         p2 += 1 
#     elif l2[i] == "SCISSORS" and l1[i] == "PAPER":
#         p2 += 1
#     elif l2[i] == "ROCK" and l1[i] == "SCISSORS":
#         p2 += 1 
# print(f"{p1}-{p2}")


# l1 = []
# n = int(input())
# x1 = input().split()
# for i in x1 :
#     l1.append(str(bin(i)))
# print(l1)

# n = hex(int(input()))[2:]
# s = sum(i.isalpha() for i in n)
# t = sum(i.isdigit() for i in n)
# count = int(input())

# for i in input().split():
#     if int(i) % 2 == 1 :
#         print(f"[x] {i}")
#     else :
#         print(f"[ ] {i}")

# res = []
# num = []
# n = int(input())
# for i in range(n):
#     a, b, c = [int(j) for j in input().split()]
#     res.append((a*b)+1)
#     num.append(f"{a} {b} {c}")

# maxx = num.index(max(res))
# loww = num.index(min(res))
# for q in num :
#     if q != maxx and q != loww :
#         print(maxx)
#         print(q)
#         print(loww) 

import sys
import math
from datetime import datetime

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

n = input()
stime = input()

# Write an answer using print
# To debug: print("Debug messages...", file=sys.stderr, flush=True)
sttime = stime.strftime("%H:%M")
n = n.strftime("%M")
print(f"{sttime}")
