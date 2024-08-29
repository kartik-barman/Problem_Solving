#include <stdio.h>
#define SIZE 6

int main() {
    int arr[SIZE];
    int value, i, sum = 0, product = 1;
    
    // Insert elements using a for loop
    for (i = 0; i < SIZE; i++) {
        printf("Enter a value: ");
        scanf("%d", &value);
        arr[i] = value;
    }
    
    // Total even number sum and odd number product of array elements
    for (i = 0; i < SIZE; i++) {
        if (arr[i] % 2 == 0) {
            sum += arr[i];
        }
         else {
            product *= arr[i];
        }
    }
    
    printf("Total sum of even numbers in the array: %d\n", sum);
    printf("Total product of odd numbers in the array: %d\n", product);
    
    return 0;
}
