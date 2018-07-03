#include<stdio.h>
#include<stdlib.h>
int main(void)
{
    int n,rev=0,rem,rev1=0;
    int *ptr,*ptr1,*add,*add1;
    int count=0,i=0,temp=0;
    //user inserting the code
    printf("enter the no :\n");
    scanf("%d",&n);
    temp=n;
    while(n>0)
    {
        n/=10;
        count++;

    }
    n=temp;
    //--------------------------------array for reverse no -------------------------------------------------
    ptr=(int*)malloc(count*sizeof(int));
    add=ptr;
    //----------------------------------array for no without reverse-----------------------------------------
    ptr1=(int*)malloc(count*sizeof(int));
    add1=ptr1;
    //----------------------------------inserting reverse no into array--------------------------------------
    while(n>0)
    {
        rem=n%10;
        ptr[i]=rem;
        rev=rev*10+rem;
        i++;
        n/=10;
    }
    //--------------------------------------inserting into actual no into dynamic array -----------------------------
    i=0;
    while(rev>0)
    {
        rem=rev%10;

        ptr1[i]=rem;
        rev1=rev1*10+rem;
        i++;
        rev/=10;
    }
    //---------------------------------------matching part ---------------------------------------------
    ptr=add;
    ptr1=add1;
    printf("\n");
    for(i=0;i<count;i++)
    {
        if(ptr[i]==ptr1[i])
        {

            printf("%d  ",ptr[i]);
        }

    }
    return 0;

}
