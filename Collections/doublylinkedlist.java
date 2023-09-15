import java.util.Scanner;

public class doublylinkedlist {
    Node head;

    static class Node{
        Node prev;
        Node next;
        int data;
        Node(int data){
            this.data=data;
            prev=null;
            next=null;
        }
    }

    public static doublylinkedlist add(doublylinkedlist list,int data){
        Node new_node=new Node(data);
        Node prevNode=null;
        if(list.head==null){
            list.head=new_node;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                prevNode=last;
                last=last.next;
                last.prev=prevNode;
            }
            last.next=new_node;
            
        }
        return list;
    }

    public static doublylinkedlist insert(doublylinkedlist list, int data, int position){
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
                    if(position==0){
                            insertNode.next=currentNode;
                            list.head=insertNode;
                            break;
                    }
                    else{
                        prevNode.next=insertNode;
                        insertNode.prev=prevNode;
                        insertNode.next=currentNode;
                        break;
                    }
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

    public static doublylinkedlist remove(doublylinkedlist list,int data){
        Node removNode=list.head;
        Node prevNode=null;
        boolean removed=false;
        boolean run=true;
        while(run){
            if(removNode.data==data){
                if(removNode.next!=null){
                    if(prevNode!=null){
                        prevNode.next=removNode.next;
                        removNode.next.prev=prevNode;
                        removed=true;
                        break;
                    }
                    else{
                        list.head=removNode.next;
                        removNode.next.prev=null;
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

    public static doublylinkedlist replace(doublylinkedlist list, int data, int newdata){
        Node replaceNode=new Node(newdata);
        Node prevNode=null;
        Node currentNode=list.head;
        while(currentNode!=null){
            if(currentNode.data==data){
                if(prevNode!=null)
                prevNode.next=replaceNode;
                else{
                    list.head=replaceNode;
                    break;
                }
                replaceNode.prev=prevNode;
                if(currentNode.next!=null){
                replaceNode.next=currentNode.next;
                currentNode.next.prev=replaceNode;
                break;
                }

            }
            if(currentNode.next!=null){
            prevNode=currentNode;
            currentNode=currentNode.next;
            } else{
                System.out.println("Please enter a valid number");
                break;
            }
        }
        return list;
    }

    public static doublylinkedlist reverse(doublylinkedlist list){
        Node nextNode=null;
        Node reverseNode=list.head;
        Node currentNode=list.head;
        // boolean run=true;
        while (true) {
            if(reverseNode.next==null){
                list.head=reverseNode;
                reverseNode.next=currentNode;
                reverseNode.prev=reverseNode.prev;
                break;
            }
            else{
                currentNode=reverseNode;
                nextNode=reverseNode.next;
                reverseNode.next=reverseNode.prev;
                reverseNode.prev=nextNode;
                reverseNode=nextNode;
        }
    }
        return list;
    }

    public static void swap(doublylinkedlist list,int position1,int position2){
        Node nodeP1=list.head;
        Node nodeP2=list.head;
        Node prevP1=null;
        Node prevP2=null;
        boolean execute=true;
        for(int i=0;i<position1;i++){
            if(nodeP1.next!=null){
            prevP1=nodeP1;
            nodeP1=nodeP1.next;
            }
            else{
                System.out.println("index Position 1 is greater than linked list size "+(i+1));
                execute=false;
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
                execute=false;
                break;
            }
        }

        if(execute){
            Node tempNode= new Node(position2);
            tempNode.next=nodeP1.next;
            nodeP1.next=nodeP2.next;
            nodeP2.next=tempNode.next;
            tempNode.prev=nodeP1.prev;
            nodeP1.prev=nodeP2.prev;
            nodeP2.prev=tempNode.prev;
            if(prevP1!=null) prevP1.next=nodeP2;
            else list.head=nodeP2;
            if(prevP2!=null) prevP2.next=nodeP1;  
            else list.head=nodeP1;
        }
    }

    public static void traverse(doublylinkedlist list){
        Node traversNode=list.head;
        if(list.head==null){
            System.out.println("List is empty");
            System.out.println();
        }
        else{
            System.out.println("Your doublylinkedlist: ");
            do{
                System.out.print(traversNode.data + " ");
                traversNode=traversNode.next;
            }while(traversNode!=null);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        doublylinkedlist dl= new doublylinkedlist();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){
        System.out.println("Enter a number to perform :");
        System.out.println("(1) add");
        System.out.println("(2) add at position");
        System.out.println("(3) remove");
        System.out.println("(4) reverse");
        System.out.println("(5) swap");
        System.out.println("(6) replace");
        System.out.println("(7) traverse");
        System.out.println("(0) exit");
        int n=userinput.nextInt();
        switch (n) {
            case 1:{
                System.out.println("Enter a number to add");
                int d=userinput.nextInt();
                add(dl, d);
                traverse(dl);
                break;
            }
            case 2:{
                System.out.println("Enter a position to insert at");
                int p=userinput.nextInt();
                System.out.println("Enter a number to insert");
                int e=userinput.nextInt();
                insert(dl, e, p);
                traverse(dl);
                break;
            }
            case 3:{
                System.out.println("Enter an element value to remove from linked list");
                int e=userinput.nextInt();
                remove(dl, e);
                traverse(dl);
                break;
            }
            case 4:{
                reverse(dl);
                traverse(dl);
                break;
            }
            case 5 :{
                System.out.println("Enter postion 1");
                int p1=userinput.nextInt();
                System.out.println("Enter postion 2");
                int p2=userinput.nextInt();
                swap(dl, p1, p2);
                traverse(dl);
                break;
            }
            case 6:{
                System.out.println("Enter a number to be replaced");
                int data=userinput.nextInt();
                System.out.println("Enter a number to be replaced with");
                int newdata=userinput.nextInt();
                replace(dl, data, newdata);
                traverse(dl);
                break;
            }
            case 7:{
                traverse(dl);
                break;
            }
            case 0: {
                run=false;
                break;
            }
        
            default:{
                System.out.println("Enter a valid number");
                break;
            }       
        }
    }
    userinput.close();
    }
}
