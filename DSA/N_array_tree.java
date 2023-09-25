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

    static Node insert(int data){
        Node rootNode=new Node(data);
        return rootNode;
    }

    static void add(Node currentNode){
        Scanner in=new Scanner(System.in);
        boolean run=true;
        while (run) {
            System.out.println("Do you like to add child to node "+currentNode.data);
            System.out.println("Enter (1) to add else Enter (2)");
            int d=in.nextInt();
            if(d==1){
                    System.out.println("Enter child node value");
                    currentNode.children.add(new Node(in.nextInt()));
                }
            else{
                    if(!currentNode.children.isEmpty()){
                        for (int i = 0; i < currentNode.children.size(); i++) {
                            add(currentNode.children.get(i));
                        }
                        
                    }
                    run=false;
                    
                }
        }
        
    }

    static void traverse(Node currentNode){
      boolean run=true;
      while (run) {
         if (currentNode.children.isEmpty()) {
                        run=false;
                        break;
                    }
                    else{
                        for (int i = 0; i < currentNode.children.size(); i++) {
                            System.out.print(currentNode.children.get(i).data +" ");
                        }
                        for (int i = 0; i < currentNode.children.size(); i++) {
                            traverse(currentNode.children.get(i));
                        }
                        run=false;
                        break;
                    }
      }
    }

    static void height(Node currentNode,int h){
        h++;
        if (!currentNode.children.isEmpty()) {
            currentNode=currentNode.children.get(0);
            height(currentNode, h);
        }
        else{
            System.out.println(h);
        }
    }

    static void dfs_postorder_traverse(Node currentNode){
        boolean run=true;
        while (run) {
            if (currentNode.children.isEmpty()) {
                run=false;
                break;
            }
            else{
                for (int i = 0; i < currentNode.children.size(); i++) {
                    dfs_postorder_traverse(currentNode.children.get(i));
                    System.out.print(currentNode.children.get(i).data +" ");
                }
                // System.out.print(currentNode.data +" ");
                run=false;
                break;
            }

        }
    }

    static void dfs_preorder_traverse(Node currentNode){
        boolean run=true;
        while (run) {
            if (currentNode.children.isEmpty()) {
                run=false;
                break;
            }
            else{
                for (int i = 0; i < currentNode.children.size(); i++) {
                    System.out.print(currentNode.children.get(i).data +" ");
                    dfs_preorder_traverse(currentNode.children.get(i));
                }
                run=false;
                break;
            }
        }
    }
        
                
    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);
        System.out.println("Enter the root node value to create");
        Node rootNode=new Node(userinput.nextInt());
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) BFS traverse");
            System.out.println("(3) height");
            System.out.println("(4) DFS pre-order traverse");
            System.out.println("(5) DFS post-order traverse");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
                switch (n){
                case 0: {
                    run=false;
                    break;
                }
                case 1:{
                    add(rootNode);
                    System.out.println("BFS traverse tree");
                    System.out.print(rootNode.data +" ");
                    traverse(rootNode);
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("BFS traverse tree");
                    System.out.print(rootNode.data +" ");
                    traverse(rootNode);
                    System.out.println();
                    break;
                }
                case 3:{
                    height(rootNode, 0);
                    break;
                }
                case 4 :{
                    System.out.println("DFS Pre order traverse tree");
                    System.out.print(rootNode.data +" ");
                    dfs_preorder_traverse(rootNode);
                    System.out.println();
                    break;
                }
                case 5:{
                    System.out.println("DFS Post order traverse tree");
                    dfs_postorder_traverse(rootNode);
                    System.out.print(rootNode.data +" ");
                    System.out.println();
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
                    
                   
                
         

