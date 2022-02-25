#include <stdio.h>
 
const int MAX = 4;
 
int main () {

    int a = 10;
    
    int *ptr = &a;
    
    int **pptr = &ptr;
    
    printf("The value of a : %d\n",a);
    
    printf("The value of ptr : %x\n",ptr);
    printf("The value of ptr pointing to : %d\n",*ptr);
    
    printf("The value of pptr: %x\n",pptr);
    printf("The value of pptr pointing to: %d\n",**pptr);
       
   return 0;
}