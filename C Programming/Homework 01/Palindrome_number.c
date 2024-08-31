#include <stdio.h>

int reverse(int num){
    int reversed = 0, remaider;

    while (num!=0)
    {
        remaider = num % 10;
        reversed = reversed * 10 + remaider;
        num /= 10;
    }

    return reversed;
    
};
int main ()
{
    int num;
    printf("Enter a number is Check Palindrome or not : ");
    scanf("%d", &num);
    int  reverseNumber = reverse(num);
    
    if (num == reverseNumber)
    {
        printf("%d is palindrome number", reverseNumber);
    }
    else
    {
        printf("%d is not a palindrome number", reverseNumber);
        
    }
    
    
    return 0;
}