public class commentlineargs {
    public static void main(String[]args){
        int n= args.length;
          System.out.print("commentline argument is ' ");
        for(int i=0;i<n;i++){
            System.out.print(args[i] + " ");
        }
        System.out.print("'");
    }
    
}
