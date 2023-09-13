import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hashset= new HashSet<>();
        hashset.add("Udhaya");
        hashset.add("Santhosh");
        hashset.add("Nathish");
        hashset.add("Sachin");
        hashset.add("Unknown");
        hashset.add("Santhosh");

        Iterator<String> itr=hashset.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next() + " ");
            }
            System.out.println();

            hashset.remove("Unknown");
            System.out.println("After removing object 'Unknown' : ");
            Iterator<String> i=hashset.iterator();
            while(i.hasNext()){
                System.out.print(i.next() + " ");
            }
            System.out.println();

            hashset.clear();
            Iterator<String> i1 = hashset.iterator();
            System.out.println("Elements after hashset.clear() method");
            while(i1.hasNext()){
                System.out.println(i1.next());
            }
        
    }
    
}
