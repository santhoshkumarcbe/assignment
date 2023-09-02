import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci {
    public static void main (String[]args){
      
     //  int n=Integer.valueOf(args[0]);
     //  BigInteger b1=BigInteger.ZERO;
     //  BigInteger b2=BigInteger.ONE;
          //  out(b1, b2, n);
           Scanner in= new Scanner(System.in);
          byte c=0;
          if(args[0]=="n"){
               c++;
                System.out.println("Program execution stopped thanks for using our service");
               }
        
        
           while (c==0){
               
               out(BigInteger.ZERO, BigInteger.ONE, Integer.valueOf(args[0]));
               args[0]=in.next();
               if(args[0]=="n"){
                    c++;
               System.out.println("Program execution stopped thanks for using our service");
          }
           }
          
           in.close();
        
    }
 

    public static int out(BigInteger temp1 , BigInteger temp2, int n1){
         if(n1!=0){
                BigInteger temp3=temp1.add(temp2);
                System.out.print(temp3+" ");
                temp1=temp2;
                temp2=temp3;
                out(temp1,temp2,--n1);     
         }
         return 0;  
    }
}
