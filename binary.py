n=int(input("enter the no :"))
temp=0
s=""
rem=0
while(n>0):
      temp=int(n/2)
      rem=n%2
      s=s+str(rem)
      n=temp
print("binary representation of the no    "+str(n)+"   is ::::  "+s[: :-1])
#forfind consecutive no of 1's in binary representation....s
length=0
count=0
one="1"
for i in range(len(s)):
      #to check the one 
    if(s[i]==one):
        count+=1
        #to update the length..
        if(count>length):
              length=count
    else:
           count=0
print("max time one occur :"+str(length))       
        
    
    
      
