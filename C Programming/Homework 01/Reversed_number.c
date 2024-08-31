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
    int number;
    printf("Enter a number : ");
    scanf("%d", &number);

    int reversedNumber = reverse(number);

    printf("Reversed number is : %d", reversedNumber);
  
    return 0;
}