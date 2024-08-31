/*Write a program to find the largest and smallest among three entered numbers 
and also display whether the identified largest/smallest number is even or odd.*/



#include <stdio.h>

char * checkEvenOdd (int number){
    return (number%2 == 0) ? "Even Number" : "Odd Number";
}

int main ()
{
    int num1, num2, num3;
    printf("Enter first number : ");
    scanf("%d", &num1);
    printf("Enter second number : ");
    scanf("%d", &num2);
    printf("Enter third number : ");
    scanf("%d", &num3);

    //variable = (condition) ? expressionTrue : expressionFalse;
    
    int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);
    int smallest = (num1 < num2 && num1 < num3) ? num1 : (num2 < num3 ? num2 : num3);

    printf("%d is largest number and %s\n", largest, checkEvenOdd(largest));
    printf("%d is Smallest number and %s\n", smallest, checkEvenOdd(smallest));

    return 0;
}