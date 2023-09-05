

public class ConstChaining {
    String s="predefined";
    ConstChaining()
    {
        this("default");
        System.out.println("This is default constructor");

    }

    ConstChaining(String a){
         a=s;
        
        System.out.println("This is parameterized constructor and the argument passed is"+s);
    }

    public static void main(String[]args){
        ConstChaining c = new ConstChaining();
         c.s=args[0];
         System.out.println(c.s);
         
        
       
        
    }

    
    
}
