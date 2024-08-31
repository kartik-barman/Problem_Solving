#include <stdio.h>

int main ()
{
    int marks ;

    while (marks !=0)
    {
      
    printf("Enter your marks : ");
    scanf("%d", &marks);

    if (90<= marks && marks <=100)
    {
        printf("A+\n");
    }
    else if (80<marks && marks <=90)
    {
        printf("A\n");
    }
    else if (70< marks && marks <=80)
    {
        printf("B\n");
    }
    else if (60< marks && marks <=70)
    {
        printf("C\n");
    }
    else if (50<= marks && marks <=60)
    {
        printf("D\n");
    }
    else if (marks <=50)
    {
       printf("F\n");
    }  
    }
   
    
    

    return 0;
}