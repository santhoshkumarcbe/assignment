public class rectangle extends shape{
    float length;
    float width;

    rectangle(float l,float w){
        length=l;
        width=w;
        System.out.println("area of rectangle is "+rarea(length,width)+ " sq.meter");
    }

    public static void main (String[]args){
        String t=args[0];
        String t1=args[1];
        float l=Integer.valueOf(t);
        float w=Integer.valueOf(t1);
        rectangle r = new rectangle(l, w);
    }
    
}
