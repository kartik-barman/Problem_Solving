#include <stdio.h>

int main ()
{
    int i, num, flag = 0;

    printf("Enter a number : ");
    scanf("%d", &num);      

    if (num<=1)
    {
        printf("%d is not a prime number\n", num);
    }
    else
    {
        for(  i = 2; i < num/2; i++)
        {
           if (num % i == 0)
           {
                flag = 1;
                break;
           }
           
        }
        
    }
    
    if (flag == 0)
    {
        printf("%d is prime number\n", num);
    }
    else
    {
        printf("%d is not a prime number\n", num);
    }
    
    
    return 0;
}