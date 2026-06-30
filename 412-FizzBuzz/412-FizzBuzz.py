# Last updated: 30/06/2026, 21:56:56
1class Solution(object):
2    def fizzBuzz(self, n):
3        answer=[]
4        for i in range(1,n+1):
5            if i%3==0 and i%5==0:
6               answer.append ("FizzBuzz")
7            elif i%3==0:
8                answer.append("Fizz")
9            elif i%5==0:
10               answer.append ("Buzz")
11            else:
12                answer.append(str(i))
13        return answer
14        