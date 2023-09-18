import java.util.ArrayList;
import java.util.Scanner;

public class stack {
    public static ArrayList<Integer> stack=new ArrayList<Integer>();
    static int top = -1;
    public static stack push(stack s,int data){
        stack.add(data);
        top+=1;
        return s;
    }

    public static stack pop(stack s){
        stack.remove(stack.size()-1);
        top--;
        return s;
    }

    public static void peek(stack s){
        if(!isEmpty(s)){
        int d=stack.get(stack.size()-1);
        System.out.println("The peek value of the stack is "+d);
        }
        else{
            System.out.println("The stack is Empty");
        }
    }

    public static boolean isEmpty(stack s){
        if(top==-1)
        return true;
        else
        return false;
    }

    public static void traverse(stack s){
        if(isEmpty(s)){
            System.out.println("Your Stack is empty ");
        }
        else{
        System.out.println("Your Stack : ");
        for(int d:stack){
            System.out.print(d+ " ");
        }
        System.out.println();
    }
    
}
    
    public static void main(String[] args) {
        stack s=new stack();
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
                    push(s, e);
                    traverse(s);
                    break;
                }
                case 2:{
                    pop(s);
                    traverse(s);
                    break;
                }
                case 3:{
                    peek(s);
                    break;
                }
                case 4:{
                    System.out.println(isEmpty(s));
                    break;
                }
                case 5:{
                    traverse(s);
                    break;
                }
                default :{
                    System.out.println("Please enter a valid input");
                    break;
                }

            }
        }
    }
}
