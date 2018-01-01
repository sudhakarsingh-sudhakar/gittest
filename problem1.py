'''
Problem 1
10.0/10.0 points (graded)
Assume s is a string of lower case characters.
Write a program that counts up the number of vowels contained in the string s. Valid vowels are: 'a', 'e', 'i', 'o', and 'u'.
For example, if s = 'azcbobobegghakl', your program should print:
Number of vowels: 5
Code Editor
# Paste your code into this box 
''' 
count=0
for letter in s:
    if(letter=='i'or letter=="o"or letter=="a"or letter=="e" or letter=="u"):
        count+=1
print("Number of vowel"+str(count))
