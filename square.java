public class square extends shape{
    float length;

    
    square(float length){
        this.length=length;
        System.out.println("area of square is "+sarea(length)+ " sq.meter");
        
    }

    square(){
        this(5f);
        System.out.print(" This is default square value");
    }

    public static void main(String[] args){
        String t;
        //  try {
        //      t=args[0];
            
        // } catch (Exception e) {
        //     t="";
        // }
        t=args[0];
        float length=Integer.valueOf(t);

        square s= new square(length);

       
        
      
        
    }
  
    
}
