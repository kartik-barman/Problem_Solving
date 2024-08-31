#include <stdio.h>

int main ()
{
    int start, end, i;
    printf("Enter a starting number : ");
    scanf("%d", &start);
    printf("Enter a ending number  : ");
    scanf("%d", &end);

    for ( i = start; i > end; i = i - 2)
    {
        printf("%d\n", i);
    }
    
    return 0;
}