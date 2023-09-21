import java.util.ArrayList;
import java.util.Scanner;

public class N_array_tree{
    Node root;
    int n;
    ArrayList<Node> traverse = new ArrayList<>();
    N_array_tree(int n){
        this.n=n;
        root=null;
    }
    public static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data=data;
             children=new ArrayList<>();
        }
    }

    static N_array_tree add(N_array_tree t,int data){
        Node parentNode=t.root;
        Node newNode=new Node(data);
        Node currentNode=t.root;
        int breadth=0;
        if(currentNode==null){
            t.root=newNode;
            t.traverse.add(newNode);
            // return ;
        }
        else{
            while(true){
                if(currentNode.children.size()<t.n){
                    currentNode.children.add(newNode);
                    t.traverse.add(newNode);
                    break;
                }
                else if(currentNode.children.size()==t.n){
                    currentNode=parentNode.children.get(breadth);
                    breadth++;
                }
                
                if(breadth==t.n+1){
                    // if(s<n){
                    // breadth=0;
                    // currentNode=parentNode.children.get(s).children.get(breadth);
                    // s++;
                    // }
                    // else
                    System.out.println("Tree size limit reached max");
                    break;
                }
            }
            
        }
        return t;




        
    }

    static void traverse(N_array_tree t){
        System.out.println("Your tree");
        for (Node traversNode : t.traverse) {
            System.out.print(traversNode.data+ " ");
        }
        System.out.println();
    }
        // int b=0;
        // int r=0;
        // System.out.println("Your Tree");
        // if(t.root==null){
        //     System.out.println("Tree is empty");
        // }
        // else if(parentNode.children.size()==0){
        //     System.out.println(parentNode.data);
        // }
        // else{
        //     int i=0;
        //     while (true) { 
        //         while(i<parentNode.children.size()){
        //         System.out.print(traverseNode.data + " ");
        //         traverseNode=parentNode.children.get(i);
        //         i++;
        //         }
        //         if(b<parentNode.children.size()){
        //             parentNode=parentNode.children.get(b);
        //             b++;
        //             i=0;
        //         }
        //         else{
        //             break;
        //         }
                
                // if(b<t.n && traverseNode!=parentNode && parentNode.children.size()!=0){
                //     traverseNode=parentNode.children.get(b);
                //     b++;
                // }
                
                // else if(b==t.n){
                //     b=0;
                //     parentNode=parentNode.children.get(r);
                //     r++;
                //     traverseNode=parentNode.children.get(b);
                //     b++;
                // }

                // else if(parentNode.children.size()-1 ==b) break;
                
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);
        System.out.println("Enter the maximum N_array");
        int n1=userinput.nextInt();
        N_array_tree t= new N_array_tree(n1);
        
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
                    
                   
                
         

