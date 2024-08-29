#include <stdio.h>
#define SIZE 5

int main ()
{
    int arr[SIZE];
    int value , i, sum = 0;
    
    //Insert element using for loop

    for ( i = 0; i < SIZE; i++)
    {
        printf("Enter a value : ");
        scanf("%d", &value);
        arr[i] = value;
    }
    
    // total sum of array element
    
    for ( i = 0; i < SIZE; i++)
    {
        sum += arr[i];
    }
    
    printf("Total sum of array element : %d", sum);
    
    return 0;
}