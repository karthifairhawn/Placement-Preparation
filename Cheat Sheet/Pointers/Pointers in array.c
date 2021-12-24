#include <stdio.h>

int main()
{
    int a[] = {1,2,3,4,5,6};
    
    int *ptr = a;
    
    for(int i=0;i<6;i++){
        printf("%d",*ptr);
        ptr++;
    }
    printf("\n\n");
    
    ptr =a;
    
    while(ptr<=&a[5]){
       printf("%d",*ptr);
        ptr++; 
    }
    
    return 0;
}
