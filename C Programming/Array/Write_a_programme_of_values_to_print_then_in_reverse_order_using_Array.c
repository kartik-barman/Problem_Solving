#include <stdio.h>
#define SIZE 6
int main ()
{
    int arr[SIZE] = { 10, 20, 30, 40, 50, 60};
    int i;

    printf("Print All element using for loop : \n");

    for ( i = 0; i < SIZE; i++)
    {
        printf("%d\n", arr[i]);
    }
    
    printf("Print all element reverse order : \n");
    for ( i = SIZE - 1; i >= 0; i--)
    {
        printf("%d\n", arr[i]);
    }
    
    

    return 0;
}