#include <stdio.h>
#define size 6

int main ()
{
    int arr[size];
    int value, i, maxValue;
    for (i = 0; i < size; i++)
    {
        printf("Enter a value : ");
        scanf("%d", &value);
        arr[i] = value;
    }
    
    maxValue = arr[0];

    for ( i = 0; arr[i]>=maxValue; i++)
    {
        maxValue = arr[i];
    }
    
        printf("Max number of array element : %d", maxValue);
    

    return 0;
}