import java.util.Scanner;

public class doublycircularlinkedlist {
    Node head;
    static class Node{
        Node next,prev;
        int data;
        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }

        public static doublycircularlinkedlist add(doublycircularlinkedlist list,int data){
            Node new_Node=new Node(data);
            Node currentNode=list.head;
            if(currentNode==null){
                list.head=new_Node;
                new_Node.next=new_Node;
                new_Node.prev=new_Node;
            }
            else{
                while(currentNode.next!=list.head){
                    currentNode=currentNode.next;
                }
                currentNode.next=new_Node;
                new_Node.prev=currentNode;
                new_Node.next=list.head;
                if(list.head.next==list.head){
                    list.head.next=new_Node;
                }
            }
            return list;
        }

        public static void traverse(doublycircularlinkedlist list){
            Node traversNode=list.head;
            if(traversNode==null){
                System.out.println("List is empty ");
            }
            else{
                System.out.println("Your doublycircularlinkedlist");
                do{
                    System.out.print(traversNode.data + " ");
                    traversNode=traversNode.next;
                }while(traversNode!=list.head);
            }
            System.out.println();
        }

        public static doublycircularlinkedlist remove(doublycircularlinkedlist list, int data){
            Node removNode=list.head;
            Node prevNode=null;  
        while(true){
        if(removNode.data==data){
           if(prevNode==null){
           if(removNode.next!=removNode){
                // Node temp=new Node(data);
                removNode.prev.next=removNode.next;
                removNode.next.prev=removNode.prev;
                list.head=removNode.next;
                break;
            }
            else{
                list.head=null;
            }
           }
           else{
            prevNode.next=removNode.next;
            removNode=removNode.next;
            removNode.prev=prevNode;
            break;
           }
           }
           prevNode=removNode;
           removNode=removNode.next;
           if(list.head==removNode)
           System.out.println("Please enter a valid number");
           break;
           } 
           return list;
        }

        public static void main(String[] args) {
            doublycircularlinkedlist dcl=new doublycircularlinkedlist();
            Scanner userinput = new Scanner(System.in);
            boolean run=true;
            while(run){
                System.out.println("Enter a number to perform");
                System.out.println("(1) add");
                System.out.println("(2) remove");
                System.out.println("(3) traverse");
                System.out.println("(0) exit");
                int n=userinput.nextInt();
                switch (n){
                case 0: {
                    run=false;
                    break;
                }
                case 1: {
                    System.out.println("Enter a number to insert");
                    int e=userinput.nextInt();
                    add(dcl, e);
                    traverse(dcl);
                    break;
                }
                case 2:{
                    System.out.println("Enter an element value to remove from doublycircular linked list");
                    int e=userinput.nextInt();
                    remove(dcl, e);
                    traverse(dcl);
                    break;
                }
                case 3:{
                    traverse(dcl);
                    break;
                }
                default:{
                    System.out.println("Please enter a valid number");
                    break;
                }
            }
        }
        userinput.close();
    }
}


