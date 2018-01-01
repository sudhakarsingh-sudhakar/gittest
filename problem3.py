#Problem 3
#15/15 points (graded)
#Assume s is a string of lower case characters.
#Write a program that prints the longest substring of s in which the letters occur in alphabetical order.
#For example, if s = 'azcbobobegghakl', then your program should print
#Longest substring in alphabetical order is: beggh
#In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print
#Longest substring in alphabetical order is: abc
#Note: This problem may be challenging. We encourage you to work smart.
#If you've spent more than a few hours on this problem, we suggest that you move on to a different part of the course.
#If you have time, come back to this problem after you've had a break and cleared your head.
#code Editor
length=0
st=s[0]
lar=s[0]
for i in range(len(s)-1):
    if(s[i+1]>=s[i]):
        st +=s[i+1]
#check the length is max or not...cv
        if len(st)>length:
            length=len(st)
            lar=st
#if upper if not statisfy...
    else:
        st=s[i+1]
#print the result
print("largest no is :"+lar)
