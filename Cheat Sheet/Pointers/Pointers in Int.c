// Pointers in int variable
#include <stdio.h>

int main()
{
    int a = 10;
    int b = 12;
    
    int *add_a = &a;
    int *add_b = &b;
    
    printf("%d\n",a);
    printf("Address of a %d\n\n",add_a);
    
    printf("B = %d\n",b);
    printf("Address of b %d\n\n",add_b);
    
    printf("Increasing a pointer value by 1\n");
    add_a++;
    printf("Now, Address stored in add_a %d\n\n",add_a);
    printf("Value stored in add_a %d\n\n",*add_a);
    
    
    
    return 0;
}
