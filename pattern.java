public class pattern {
    public static void main (String[]args){
        // pattern using loop
        // star
        int n=Integer.valueOf(args[0]);

        for (int i=0;i<n;i++){
            for(int j=0;j<2*n;j++){
                if(j<=i || j>=2*n-1-i){
                    System.out.print("*");
                }
                else
                System.out.print(" ");

            }
            System.out.println();
        }

        // --
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<2*n;j++){
                 if(j<=i || j>=2*n-1-i){
                    System.out.print("-");
                }
                else
                System.out.print(" ");

            }
            System.out.println();
        }


    }
}

