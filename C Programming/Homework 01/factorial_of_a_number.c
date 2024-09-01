#include <stdio.h>

int main ()
{
    int i, num, factorial = 1;
    printf("Enter a number : ");
    scanf("%d", &num);
    for ( i = 1; i <= num; i++)
    {
        factorial *= i;
    }
    

    printf("Factorial number is : %d", factorial);
    return 0;
}