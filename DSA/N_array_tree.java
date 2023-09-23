import java.util.ArrayList;
import java.util.Scanner;

public class N_array_tree{
  
    public static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data=data;
             children=new ArrayList<>();
        }
    }

    static void add(N_array_tree t,int data){

    }

    static void traverse(N_array_tree t){
      
    }
        
                
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);
        System.out.println("Enter the maximum N_array");
        int n1=userinput.nextInt();
        
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) traverse");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
                switch (n){
                case 0: {
                    run=false;
                    break;
                }
                case 1:{
                    System.out.println("Enter a number to insert");
                    int e=userinput.nextInt();
                    add(t,e);
                    traverse(t);
                    break;
                }
                default :{
                    System.out.println("Please enter a valid input");
                    break;
                }
    }
}
userinput.close();
}
}




































































// import java.util.ArrayList;

// public class dfs_tree {
//     static Node root;
//     static int n;
//     class Node{
//         int data;
//         ArrayList<Node> children;

//         Node(int data){
//             this.data=data;
//             children=new ArrayList<>();
//         }
//     }

//         public static dfs_tree insert(dfs_tree dfs, int data){
//             Node insertNode=new Node(data);
//             if(dfs_tree.root==null){
//                 dfs_tree.root=insertNode;
//             }
            
//         }

//         public static boolean add(Node c,Node insert,int n){
//             int i=0;
//             Node current=c;
//             boolean added=false;
//             if(current==null){
//                 current=insert;
//                 added=true;
//             }
//             else{
//                 while(i<n){
//                     if(current.children.size()<n){
//                         added=add(current.children.get(i), insert, n);

//                     }
                
//                 if(added) break;
//                 i++;
//             }
//             if(!added){

//             }
            
//         }
//             // Node new_Node=new Node(data);
//             // Node currentNode=root;
//             // Node parentNode=null;
//             // ArrayList<Node> prevparentNode=new ArrayList<>();
//             // boolean run=true;
//             // int c=0;
//             // int pc=0;
//             // while(run){
//             // if(root==null)
//             // root=new_Node;
//             // else{
//             //     if(currentNode.children.size()<n){
//             //         currentNode.children.add(new_Node);
//             //         break;
//             //     }
//             //     else if(parentNode==null){
//             //             parentNode=currentNode;
//             //             currentNode=currentNode.children.get(0);
//             //             c++;
//             //         }
//             //     else{
//             //         if(c<n){
//             //             currentNode=parentNode.children.get(c);
//             //             c++;
//             //         }
//             //         else if(prevparentNode.size()==0){
//             //             c=0;
//             //             prevparentNode.add(parentNode);
//             //             parentNode=parentNode.children.get(0);
//             //             currentNode=parentNode.children.get(0);
//             //             c++;
//             //             pc++;
//             //         }
//             //         else{
//             //             if(pc<n){
//             //                 c=0;
//             //                 parentNode=prevparentNode.get(prevparentNode.size()-1).children.get(pc);
//             //                 currentNode=parentNode.children.get(0);
//             //                 c++;
//             //                 pc++;
//             //             }
//             //             else{
//             //                 prevparentNode.add(prevparentNode.get(prevparentNode.size()-1).children.get(0));
//             //             }
//             //         }
//                 }
                    
                   
                
         

