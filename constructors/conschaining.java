package constructors;

public class conschaining {
     String s="predefined";
    conschaining()
    {
        this("default");
        System.out.println("This is default constructor");

    }

    conschaining(String a){
         s=a;
        
        System.out.println("This is parameterized constructor and the argument passed ");
    }

    public static void main(String[]args){
        conschaining c = new conschaining();
          c.s=args[0];
        
    }


    
}
