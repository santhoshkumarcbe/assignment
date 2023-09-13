import java.util.Scanner;

public class linkedlist {
    Node head;

    static class Node{
        int data;
        Node next;


        Node(int n){
            data=n;
            next=null;
        }
    }

    public static linkedlist add(linkedlist list,int data){
        Node new_node=new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }

    public static linkedlist insert (linkedlist list,int data,int position){
        Node insertNode=new Node(data);
        Node currentNode=list.head;
        Node prevNode=null;
        int count=0;
        boolean insert=false;
        if(currentNode==null){
            if(position==0){
                list.head=insertNode;
            }
            else
            System.out.println("Please enter a valid position");
        }

        else{
        while(true){
            if(position==count){
                Node tempNode=currentNode;
                currentNode=insertNode;
                insertNode.next=tempNode;
                if(position==0){
                    list.head=insertNode;
                }
                else
                prevNode.next=currentNode;
                insert=true;
                break;
            }
                prevNode=currentNode;
                currentNode=currentNode.next;
                count++;
            
        }
        if(!insert){
            System.out.println("Please enter valid position");
        }
    }
        return list;
    }

    public static linkedlist reverse(linkedlist list){
        Node currNode=list.head;
        Node prevNode=null;
        Node nextNode=null;
        while(currNode!=null){
        nextNode=currNode.next;
        currNode.next=prevNode;
        prevNode=currNode;
        currNode=nextNode;
        }
        list.head=prevNode;
        return list;
    }

    public static linkedlist removeHeadnode(linkedlist list){
        Node removNode=list.head;
        list.head=removNode.next;
        return list;  
    }

    public static linkedlist remove(linkedlist list,int data){
        Node removNode=list.head;
        int check=0;
        do{
            if(removNode.data==data){
                removNode.data=removNode.next.data;
                removNode.next=removNode.next.next;
                check++;
            }
            removNode=removNode.next;
        }
        while(removNode.next!=null);

        if(check==0){
            System.out.println(data + " is not present in linkedlist ");
            }
        return list;  
    }

    public static void findelement(linkedlist list, int data){
        Node findNode=list.head;
        int position=0;
        boolean find=false;
        while(true){
            if(findNode.data==data){
                System.out.println(data+ " is present at position "+position );
                find=true;
                break;
            }
            if(findNode.next!=null){
            findNode=findNode.next;
            position++;
            }
            else break;
        }
        
        if(!find){
            System.out.println(data + " is not present in the list");
        }
    }

    public static void traverse(linkedlist list){
        Node curNode=list.head;
        System.out.println("Your Linkedlist :");
        while(curNode!=null){
            System.out.print(curNode.data +" ");
            curNode=curNode.next;
        }
    }

    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){
        System.out.println("Enter a number to perform : \n (1) add \n (2) remove \n (3) remove Head node in the list \n (4) traverse \n (5) Insert at position ");
        System.out.println(" (6) Find an element \n" + //
                           " (0) exit ");
        int n=userinput.nextInt();
        switch (n) {
            case 0: {
                run=false;
                break;
            }
            case 1: {
                System.out.println("Enter a number to insert");
                int e=userinput.nextInt();
                add(l, e);
                traverse(l);
                System.out.println();
                break;
            }

            case 2 :{
                System.out.println("Enter an element value to remove from linked list");
                int e=userinput.nextInt();
                remove(l, e);
                traverse(l);
                System.out.println();
                break;
            }

            case 3 :{
                removeHeadnode(l);
                traverse(l);
                System.out.println();
                break;
            }

            case 4 :{
                traverse(l);
                System.out.println();
                break;
            }

            case 5 :{
                System.out.println("Enter a position to insert at");
                int p=userinput.nextInt();
                System.out.println("Enter a number to insert");
                int e=userinput.nextInt();
                insert(l, e, p);
                traverse(l);
                System.out.println();
                break;
            }

            case 6 :{
                System.out.println("Enter an element to find");
                int d=userinput.nextInt();
                findelement(l, d);
                traverse(l);
                System.out.println();
                break;
            }
        
            default:
                System.out.println("Give proper input");
                break;
        }
    }
        userinput.close();

    }

    
}