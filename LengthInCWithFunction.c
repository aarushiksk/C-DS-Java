#include <stdio.h>

int main() {
    // Write C code here
    char str[100];
    int len=0;
    printf("Enter :");
    scanf("%s",&str);
    for(int i=0;str[i]!='\0';i++){
        len++;
    }
    printf("%d",len);

    return 0;
}
