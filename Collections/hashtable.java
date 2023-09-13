//  package Collections;

import java.util.*;

public class hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"OLA");
        ht.put(4,"TVS iqube");
        ht.put(2,"ATHER");
        ht.put(3,"CHETAK");
        

        System.out.println(ht);

        for(Map.Entry<Integer,String> m:ht.entrySet()){
            System.out.println(m.getKey()+ " "+m.getValue());
        }

        System.out.println(ht.get(1));
        System.out.println(ht.containsValue("OLA"));
        

    }

    
}
