import java.util.ArrayList;
import java.util.Arrays;
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

     public static void reorderList(Node head) {
        // leetcode reorder list
        ArrayList<Node> list=new ArrayList<>();
        Node current=head;
        boolean logic=true;
        while(current.next!=null){
            list.add(current.next);
            current=current.next;
        }
        current=head;
        while(list.size()>0){
            if(logic){
                current.next=list.get(list.size()-1);
                list.remove(list.size()-1);
                logic=false;
                current=current.next;
                if(list.size()==0){
                    current.next=null;
                }
            }
            else{
                current.next=list.get(0);
                list.remove(list.get(0));
                logic=true;
                current=current.next;
                if(list.size()==0){
                    current.next=null;
                }
            }
        }
        
    }

    public static Node mergeklist(Node[] lists){
        // 23. Merge k Sorted Lists
        // https://leetcode.com/problems/merge-k-sorted-lists/description/

        ArrayList<Node> arr=new ArrayList<>(Arrays.asList(lists));
        Node head=arr.get(0);
        Node s=null;
        boolean start=true;
       while(arr.size()>0){
           int i=1;
           boolean c=false;
           while(i<arr.size()){
               if(head.data>=arr.get(i).data){
                   head=arr.get(i);
                   c=true;
                   if(arr.get(i).next!=null){
                       arr.set(i,arr.get(i).next);
                   }
                   else{
                       arr.remove(arr.get(i));
                   }
               }  
               i++;
           }
           if(start){
               s=head;
               start=false;
           }
           if(c)
           head.next=arr.get(0);
           else if(arr.get(0).next!=null){
               head.next=arr.get(0).next;
               arr.set(0,arr.get(0).next);
           }
           else if(arr.get(0).next==null){
               arr.remove(arr.get(0));
               if(!arr.isEmpty())
               head.next=arr.get(0);  
           }
           }
           return s;
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
                    break;
                }
                else
                prevNode.next=currentNode;
                break;
            }
                prevNode=currentNode;
                currentNode=currentNode.next;
                count++; 
                if(currentNode==null && (count+1) <= position){
                    System.out.println("Please enter valid position");
                    break;
                }   
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
        Node prevNode=null;
        boolean removed=false;
        boolean run=true;

        while(run){
            if(removNode.data==data){
                if(removNode.next!=null){
                    if(prevNode!=null){
                        prevNode.next=removNode.next;
                        removed=true;
                        break;
                    }
                    else{
                        // if(removNode.next!=null)
                        list.head=removNode.next;
                        // else list.head=null;
                        removed=true;
                        break;
                    }    
                }
                else{
                    if(prevNode!=null){
                        prevNode.next=null;
                    }
                    else list.head=null;
                    removed=true;
                    break;
                }
            }
            if(removNode.next!=null){
                prevNode=removNode;
                removNode=removNode.next;
            }
            
            else run=false;
        }
        if(!removed){
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
    public static void swap(linkedlist list ,int position1,int position2){
        Node nodeP1=list.head;
        Node nodeP2=list.head;
        Node prevP1=null;
        Node prevP2=null;
        for(int i=0;i<position1;i++){
            if(nodeP1.next!=null){
            prevP1=nodeP1;
            nodeP1=nodeP1.next;
            }
            else{
                System.out.println("index Position 1 is greater than linked list size "+(i+1));
                break;
            }
        }
        for(int i=0;i<position2;i++){
            if(nodeP2.next!=null){
                prevP2=nodeP2;
                nodeP2=nodeP2.next;
            }
            else{
                System.out.println("index Position 2 is greater than linked list size "+ (i+1));
                break;
            }
        }

         Node tempNode1= new Node(position2);
         Node tempNode2=new Node(position2);
         tempNode1.next=nodeP2.next;
        //  if(nodeP1.next!=nodeP2)
         tempNode2.next=nodeP1.next;
        //  else if(nodeP2.next!=null){
        //     tempNode2.next=nodeP2;
        //  }
        // nodeP1.next=nodeP2.next;
        // nodeP2.next=tempNode.next;
        if(prevP1!=null){
            prevP1.next=nodeP2;
            nodeP2.next=tempNode2.next;
        }
        else list.head=nodeP2;
        if(prevP2!=null){
            prevP2.next=nodeP1;
            nodeP1.next=tempNode1.next;
        } 
        else list.head=nodeP1;
        
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
                           " (7) swap two elements \n" + 
                           " (8) reorder list \n" +
                           " (9) Merge K lists \n" +
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

            case 7 :{
                System.out.println("Enter postion 1");
                int p1=userinput.nextInt();
                System.out.println("Enter postion 2");
                int p2=userinput.nextInt();
                swap(l, p1, p2);
                traverse(l);
                System.out.println();
                break;
            }

            case 8 :{
                reorderList(l.head);
                traverse(l);
                System.out.println();
                break;
            }

            case 9:{
                System.out.println("Enter number of linked lists");
                int n1=userinput.nextInt();
                Node[] lists = new Node[n1];
                for (int i = 0; i < lists.length; i++) {
                    System.out.println("Enter head node value for linkedlist "+i);
                    Node tempNode=new Node(userinput.nextInt());
                    lists[i]=tempNode;
                    boolean execute=true;
                    while(execute){
                        System.out.println("Enter (1) to add next node else Enter (2) ");
                        int n2=userinput.nextInt();
                        if (n2==1) {
                            System.out.println("Enter next node value");
                            Node nextNode=new Node(userinput.nextInt());
                            tempNode.next=nextNode;
                            tempNode=tempNode.next;
                        }
                        else{
                            execute=false;
                        }
                    }
                }
                Node curNode=mergeklist(lists);
                System.out.println("Your singly sorted Linkedlist :");
                while(curNode!=null){
                System.out.print(curNode.data +" ");
                curNode=curNode.next;
        }
        System.out.println();
        break;
            }
        
            default:{
                System.out.println("Give proper input");
                break;
            }
        }
    }
        userinput.close();

    }

    
}