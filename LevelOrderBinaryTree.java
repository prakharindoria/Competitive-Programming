/*
Given a pointer to the root of a binary tree, you need to print the level order traversal of this tree. In level-order traversal, nodes are visited level by level from left to right. Complete the function  and print the values in a single line separated by a space.

For example:

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
For the above tree, the level order traversal is .

Input Format

You are given a function,

void levelOrder(Node * root) {

}
Constraints

 Nodes in the tree  

Output Format

Print the values in a single line separated by a space.

Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
Sample Output

1 2 5 3 6 4

Explanation

We need to print the nodes level by level. We process each level from left to right.
Level Order Traversal: 
*/



import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    
    
    //BFS Tarversal
    //3 Methods: 1)printTree 2)Height 3)printLevel
    
	public static void levelOrder(Node root) {
        int h=height(root);
        int i;
        for(i=1;i<=h;i++){
            
            printCurrentLevel(root,i);
            
        }
    }
    
    public static int height(Node root){
        int res=0;
        if(root==null)return res;
        int l=height(root.left);
        int r=height(root.right);
        return (int)(Math.max(l,r)+1);
    }
    
    
    public static void printCurrentLevel(Node root,int level) {
        if(root==null)return;
        
        else if(level==1)System.out.print(root.data+" ");
        
        else{
            printCurrentLevel(root.left,level-1);
            printCurrentLevel(root.right,level-1);

        }
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        levelOrder(root);
    }	
}
