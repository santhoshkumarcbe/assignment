public class patternwithrecursion {
    public static void main (String[]args){
        int n=Integer.valueOf(args[0]);
        star(0,0, n);
        dash(n-1,0,n);

    }
    
      public static void star(int i, int j, int n1){
            
            
            if(j<=i || j>=2*n1-1-i && j<2*n1){
             System.out.print("*");
             j++;
             star(i,j,n1);
             }

            else if(j>i && j<2*n1){
             System.out.print(" ");
             j++;
             star(i,j,n1);
            } 

            else if(j==2*n1){
             System.out.println();
             i++;
             j=0;
              if(i<n1){
               star(i,j,n1);
              }
            }
        }

    public static void dash(int i,int j,int n1){

        if(j<=i || j>=2*n1-1-i && j<2*n1){
            System.out.print("-");
            j++;
            dash(i,j,n1);

    }
        else if(j>i && j<2*n1){
            System.out.print(" ");
            j++;
            dash(i,j,n1);

    }
        else if(j==2*n1){
             System.out.println();
             i--;
             j=0;
              if(i>=0){
               dash(i,j,n1);
              }
            }
}
}
