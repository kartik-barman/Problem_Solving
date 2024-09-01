#include <stdio.h>

int main ()
{
    int num, count = 0;
    printf("Enter a integar : ");
    scanf("%d", &num);

    while (num != 0)
    {
        num /= 10;
        count++;
    }
    
    printf("Total count : %d", count);
    return 0;
}