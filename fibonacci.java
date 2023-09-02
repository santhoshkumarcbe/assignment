public class fibonacci {
    public static void main (String[]args){
         int n=Integer.valueOf(args[0]);
          out(n);
        
        
    }

    public static int out(int n1){
            if(n1<=1){
                return n1;
            }
            
                return out(n1-1) + out(n1-2);
            

        }
}
