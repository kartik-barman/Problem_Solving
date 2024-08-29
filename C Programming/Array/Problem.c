#include <stdio.h>
#define size 5
int main ()
{
    int arr[size];
    int value, i, sum, product = 1;
    for (i = 0; i < size; i++)
    {
        printf("Enter a value : ");
        scanf("%d", &value);
        arr[i] = value;
    }

    for ( i = 0; i < size; i++)
    {
        if (arr[i]%5 == 0)
        {
            sum += arr[i];
        }
        else if (arr[i]%3 == 0)
        {
            product *= arr[i];
        }
        else
        {
            printf("5 and 3 not disiviable by number : %d\n", arr[i]);
        }
        
        
    }

    printf("5 disiviable number total sum = %d\n", sum);
    printf("3 disiviable number total product = %d\n", product);
    
    return 0;
}