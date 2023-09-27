import java.util.ArrayList;
import java.util.Scanner;

public class ugraph {
    static class Node {
        int data;
        ArrayList<Node> nextnodes;

        Node(int data){
            this.data=data;
            nextnodes=new ArrayList<>();
        }
    }

    static void add(Node currentNode,Node insertNode){
        currentNode.nextnodes.add(insertNode);
        insertNode.nextnodes.add(currentNode);
    }

    static boolean traversewithnext(Node originNode,ArrayList<Node> t){
        if(!t.contains(originNode)){
            System.out.print(originNode.data +"=[ ");
            for (Node i:originNode.nextnodes) {
                System.out.print(i.data+" ");
            }
            System.out.print("] ");
            t.add(originNode);
        }
        else{
            return false;
        }
        for (int i = 0; i < originNode.nextnodes.size(); i++) {
            traversewithnext(originNode.nextnodes.get(i),t);
        }
        return true;
    }

    static boolean traverse(Node originNode,ArrayList<Node> t){
        if(!t.contains(originNode)){
            System.out.print(originNode.data +" ");
            t.add(originNode);
        }
        else{
            return false;
        }
        for (int i = 0; i < originNode.nextnodes.size(); i++) {
            traverse(originNode.nextnodes.get(i),t);
        }
        return true;
    }

    static Node find(Node currentNode,int data,ArrayList<Node> t){
        boolean f=false;
       if(!t.contains(currentNode)){
        if (currentNode.data==data) {
            f=true;
            return currentNode;
        }
        for (int i = 0; i < currentNode.nextnodes.size(); i++) {
            find(currentNode.nextnodes.get(i), data, t);
            break;
        }
       }
       if (f)
        return currentNode;
        else
        return null;
       
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter the root node value to create");
        Node rootNode=new Node(userinput.nextInt());
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform :");
            System.out.println("(1) add");
            System.out.println("(2) Show nodes with next nodes");
            System.out.println("(3) traverse");
            System.out.println("(4) find");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
            switch (n) {
            case 0: {
                run=false;
                break;
            }
            case 1: {
                ArrayList<Node> t = new ArrayList<>();
                System.out.println("Enter node value to insert");
                Node insertNode=new Node(userinput.nextInt());
                System.out.println("Enter Origin node value");
                Node tempNode=find(rootNode, userinput.nextInt(),t);
                t.clear();
                if(tempNode!=null){
                    add(tempNode, insertNode);
                    traversewithnext(tempNode, t);
                }
                
                else
                System.out.println("Invalid origin node");
                break;
            }
            case 2:{
                ArrayList<Node> t=new ArrayList<>();
                traversewithnext(rootNode, t);
                System.out.println();
                break;
            }
            case 3:{
                ArrayList<Node> tarr=new ArrayList<>();
                System.out.println("Enter origin node to traverse");
                ArrayList<Node> t=new ArrayList<>();
                Node t1=find(rootNode, userinput.nextInt(),t);
                if(t1!=null)
                traverse(t1,tarr);
                else
                System.out.println("Origin node not found in graph");
                System.out.println();
                break;
            }
            case 4:{
                ArrayList<Node> t1=new ArrayList<>();
                Node t=find(rootNode, userinput.nextInt(),t1);
                if(t!=null)
                System.out.println(t.data + " is present in the graph");
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
