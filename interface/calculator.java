
interface calculator {
    float add(float a,float b);
    float sub(float a,float b);
    float mul(float a,float b);
    float div(float a,float b);
   
} 



class calculate implements calculator{

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
        if(b==0){
            System.out.println("number cannot be divided by zero");
            return 0;
        }
        else{
        return a/b;
        }
     }

     public static void main (String []args){
        float a=Integer.valueOf(args[0]);
        float b=Integer.valueOf(args[2]);
        char operation=(args[1]).charAt(0);

        calculate c= new calculate();

        if(operation=='+'){
            System.out.println(c.add(a, b));     
        }
        if(operation=='-'){
            System.out.println(c.sub(a, b));
            
        }
        if(operation=='*'){
            System.out.println(c.mul(a, b));
            
        }
        if(operation=='/'){
            System.out.println(c.div(a, b));  
        }


     }

     
   
}
