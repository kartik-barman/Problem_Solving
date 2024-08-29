#include <stdio.h>

int main ()
{
    int arr[] = {10, 6, 9, 14, 17, 3};
    int size = sizeof(arr)/sizeof(int);
    int i;
    for ( i = 0; i < size; i++)
    {
        if (arr[i]%2 == 0)
        {
            printf("%d\n", arr[i]);
        }
        
    }
    
    return 0;
}