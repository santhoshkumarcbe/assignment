import java.util.ArrayList;
import java.util.Scanner;

public class selectionsort {

    public static boolean Ascendingsort(ArrayList<Integer> sarr){
        for (int i = 0; i < sarr.size()-1; i++) {
            for (int j = i+1; j < sarr.size(); j++) {
                if(sarr.get(i)>sarr.get(j)){
                    int t=sarr.get(i);
                    sarr.set(i,sarr.get(j));
                    sarr.set(j,t);
                }
            }  
        }
        return true;
    }

    public static boolean Descendingsort(ArrayList<Integer> sarr){
        for (int i = 0; i < sarr.size()-1; i++) {
            for (int j = i+1; j < sarr.size(); j++) {
                if(sarr.get(i)<sarr.get(j)){
                    int t=sarr.get(i);
                    sarr.set(i,sarr.get(j));
                    sarr.set(j,t);
                }
            }  
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        ArrayList<Integer> sarr=new ArrayList<>();
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) show unorder array");
            System.out.println("(3) selection sort Ascending order");
            System.out.println("(4) selection sort Descending order");
            System.out.println("(0) exit");
            int n=userinput.nextInt();

            switch (n) {
                case 1:{
                    System.out.println("Enter a number to add");
                    int e = userinput.nextInt();
                    sarr.add(e);
                    System.out.println("Your array : "+ sarr);
                    break;
                }
                case 2:{
                    System.out.println("Your array : "+ sarr);
                    break;
                }
                case 3:{
                    System.out.println("Array  before Ascending order sort : "+ sarr);
                    System.out.println("Is sorted in Ascending order: "+Ascendingsort(sarr));
                    System.out.println("Array after Ascending order sort : "+ sarr);
                    break;
                }
                case 4:{
                    System.out.println("Array  before Descending order sort : "+ sarr);
                    System.out.println("Is sorted in Descending order "+Descendingsort(sarr));
                    System.out.println("Array after Descending order sort : "+ sarr);
                    break;
                }
                case 0:{
                    run=false;
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
