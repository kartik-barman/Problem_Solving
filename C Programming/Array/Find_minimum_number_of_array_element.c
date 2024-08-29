#include <stdio.h>
#define size 6

int main ()
{
    int arr[size];
    int value, i, minValue;
    for (i = 0; i < size; i++)
    {
        printf("Enter a value : ");
        scanf("%d", &value);
        arr[i] = value;
    }
    
    minValue = arr[0];

    for ( i = 0; arr[i]<=minValue; i++)
    {
        minValue = arr[i];
    }
    
        printf("Min number of array element : %d", minValue);
    

    return 0;
}