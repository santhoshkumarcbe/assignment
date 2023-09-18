
import java.util.ArrayList;
import java.util.Scanner;
public class queue {
    public static ArrayList<Integer> queue=new ArrayList<Integer>();
    static int size = -1;

    public static queue push(queue q,int data){
        size++;
        queue.add(data);
        int i=0;
        int t=data;
        while(i<=size){
            int t1=queue.get(i);
            queue.set(i,t);
            t=t1;
            i++;
        }
        
        return q;
}
    

    public static queue pop(queue q){
        if(isEmpty(q))
        System.out.println("Queue is Empty");
        else{
        queue.remove(size);
        size--;
        }
        return q;
    }

    public static void peek(queue q){
        System.out.println("Peek value of the queue is " +queue.get(size));
    }

    public static boolean isEmpty(queue q){
        if(size== -1) return true;
        else return false;
    }

    public static void traverse(queue q){
        System.out.print("Your Queue: ");
        if(size== -1){
            System.out.print("is empty");
        }
        for(int data :queue){
            System.out.print(data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        queue q=new queue();
        Scanner userinput = new Scanner(System.in);
            boolean run=true;
            while(run){
                System.out.println("Enter a number to perform");
                System.out.println("(1) push");
                System.out.println("(2) pop");
                System.out.println("(3) peek");
                System.out.println("(4) isEmpty");
                System.out.println("(5) traverse");
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
                    push(q, e);
                    traverse(q);
                    break;
                }
                case 2:{
                    pop(q);
                    traverse(q);
                    break;
                }
                case 3:{
                    peek(q);
                    break;
                }
                case 4:{
                    System.out.println(isEmpty(q));
                    break;
                }
                case 5:{
                    traverse(q);
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
