import java.util.ArrayList;
import java.util.Scanner;

public class leetcode_143 {

//  * Definition for singly-linked list.
Node head=null;
  public static class Node {
      int data;
      Node next;

      Node(int data) { 
        this.data = data; 
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

public static leetcode_143 add(leetcode_143 list,int data){
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

public static void traverse(leetcode_143 list){
    Node curNode=list.head;
    System.out.println("Your Linkedlist :");
    while(curNode!=null){
        System.out.print(curNode.data +" ");
        curNode=curNode.next;
    }
    System.out.println();
}

    public static void main(String[] args) {
        leetcode_143 l = new leetcode_143();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) traverse");
            System.out.println("(3) reorder list");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
            switch (n) {
                case 1:{
                    int data=userinput.nextInt();
                    add(l,data);
                    traverse(l);
                    break;
                }
                case 3 :{
                    reorderList(l.head);
                    traverse(l);
                    System.out.println();
                    break;
                }
                case 0: {
                    run=false;
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

