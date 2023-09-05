public class circle extends shape {
float radius;
    
    circle(float radius){
        this.radius=radius;
        System.out.println("area of circle is "+carea(radius)+ " sq.meter");
        
    }

    public static void main (String[]args){
        String t=args[0];
        float radius=Integer.valueOf(t);
        circle c= new circle(radius);
    }
    
}
