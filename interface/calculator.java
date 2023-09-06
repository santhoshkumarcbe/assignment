// import java.util.InputMismatchException;



interface calculator {
    float add(float a,float b);
    float sub(float a,float b);
    float mul(float a,float b);
    float div(float a,float b);
   
   
} 


class calculate implements calculator{
    
    

    class Inputformat extends Exception{
        public Inputformat(String aware){
            super(aware);
        }

    }

    class getter {
    String s1;
    String s2;
    char operation;
    float a;
    float b;
    boolean check=true;
         public void getInput(String[] args){   
         

    

        try{
            s1=args[0];
            s2=args[2];
            operation=(args[1]).charAt(0);
            a=Integer.valueOf(s1);
            b=Integer.valueOf(s2);
             
        }

        catch(ArrayIndexOutOfBoundsException ex){
            check=false;
            System.out.println("Please enter number in the format  ' number <space> operation <space> number '");
        }

        catch (NumberFormatException ex1){
            check=false;
             System.out.println("Input should be in the format ' number<space> operation <space> number '");
           
        }
    }

       
    }


   


     

    public float add(float a,float b){
        return a+b;
     }

    public float sub(float a,float b){
        return a-b;
     }

    public float mul(float a,float b){
        return a*b;
     }

    public float div(float a,float b){
      
        return a/b;
        
     }



     

     public static void main (String []args) throws calculate.Inputformat{

        calculate c= new calculate();
        final getter cc = c.new getter();

       
       

        

        // calculate c= new calculate();
        char operator=cc.operation;
        float a1=Integer.valueOf(cc.s1);
        float b1=Integer.valueOf(cc.s2);

    
        if(operator=='+'){
            System.out.println(c.add(a1, b1));     
        }
        if(operator=='-'){
            System.out.println(c.sub(a1, b1));
            
        }
        if(operator=='*'){
            System.out.println(c.mul(a1, b1));
            
        }
        if(operator=='/'){
            System.out.println(c.div(a1, b1));  
        }


     }


     
   
}
