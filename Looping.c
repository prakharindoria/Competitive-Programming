/*
Objective

In this challenge, you will learn the usage of the for loop, which is a programming language statement which allows code to be repeatedly executed.

The syntax for this is

for ( <expression_1> ; <expression_2> ; <expression_3> )
    <statement>
expression_1 is used for intializing variables which are generally used for controlling the terminating flag for the loop.
expression_2 is used to check for the terminating condition. If this evaluates to false, then the loop is terminated.
expression_3 is generally used to update the flags/variables.
A sample loop will be

for(int i = 0; i < 10; i++) {
    ...
}
Task

For each integer  in the interval  (given as input) :

If , then print the English representation of it in lowercase. That is "one" for , "two" for , and so on.
Else if  and it is an even number, then print "even".
Else if  and it is an odd number, then print "odd".
Input Format

The first line contains an integer, .
The seond line contains an integer, .

Constraints


Output Format

Print the appropriate english representation,even, or odd, based on the conditions described in the 'task' section.

Note: 

Sample Input

8
11
Sample Output

eight
nine
even
odd
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>



int main() 
{
    int a, b,i;
    scanf("%d\n%d", &a, &b);
    for(i=a;i<=b;i++){
        if(i<=9){
        switch(i){
        case 1:printf("one\n");break;
        case 2:printf("two\n");break;
        case 3:printf("three\n");break;
        case 4:printf("four\n");break;
        case 5:printf("five\n");break;
        case 6:printf("six\n");break;
        case 7:printf("seven\n");break;
        case 8:printf("eight\n");break;
        case 9:printf("nine\n");break;
        }
        }
        else if(i>9 && i%2==0)
        printf("even\n");
        else if(i>9 && i%2!=0)
        printf("odd\n");
   }
    
    return 0;
}


