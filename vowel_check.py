s=input("enter the string")
count=0
for letter in s:
    if(letter=='i'or letter=="o"or letter=="a"or letter=="e" or letter=="u"):
        count+=1
print("Number of vowel"+str(count))
