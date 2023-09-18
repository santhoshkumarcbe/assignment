import java.util.Scanner;

public class circularlinkedlist extends linkedlist {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static circularlinkedlist add(circularlinkedlist list, int data){
        Node new_Node=new Node(data);
        Node last=list.head;
        if(list.head==null){
            list.head=new_Node;
            new_Node.next=list.head;
        }
        else{
            while(last.next!=list.head){
                last=last.next;
            }
            last.next=new_Node;
            new_Node.next=list.head;
        }
        return list;
    }

    public static circularlinkedlist remove(circularlinkedlist list, int data){
        Node removNode=list.head;
        Node prevNode=null;
        while(true){
        if(removNode.data==data){
           if(prevNode==null){
            list.head=null;
            break;
           }
           else{
            prevNode.next=removNode.next;
            break;
           }
           }
        prevNode=removNode;
        removNode=removNode.next;
        if(list.head==removNode)
        System.out.println("Please enter a valid number");
        } 
            return list;   
        }

    public static circularlinkedlist reverse(circularlinkedlist list){
        Node currNode=list.head;
        Node prevNode=null;
        Node nextNode=null;
        do{
        if(currNode!=null){
        nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
        }
        else{
            System.out.println("List is empty");
            break;
        }
        }while(currNode!=list.head);
        list.head=prevNode;
        return list;
    }

    public static void traverse(circularlinkedlist list){
        Node curNode=list.head;
        System.out.println("Your Circularlinkedlist :");
        do{
            if (curNode!=null) {
                System.out.print(curNode.data + " ");
                curNode=curNode.next;
            }
            else{
                System.out.println("List is empty ");
                break;
            }

        } while(curNode.data!=list.head.data);
        System.out.println();
    }

    public static void main(String[] args) {
        circularlinkedlist cl=new circularlinkedlist();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) remove");
            System.out.println("(3) traverse");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
            switch (n) {
                case 0: {
                    run=false;
                    break;
                }
                case 1: {
                    System.out.println("Enter a number to insert");
                    int e=userinput.nextInt();
                    add(cl, e);
                    traverse(cl);
                    break;
                }
                case 2 :{
                    System.out.println("Enter an element value to remove from circular linkedlist");
                    int e=userinput.nextInt();
                    remove(cl, e);
                    traverse(cl);
                    break;
                }
    
                case 3 :{
                    traverse(cl);
                    break;
                }
                default:{
                    System.out.println("Please enter a valid number");
                }
        }
    }
    userinput.close();
}
}

