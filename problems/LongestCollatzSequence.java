import java.util.Scanner;

public class LongestCollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum number to check lcsn");
        Long n=sc.nextLong();
        Long max=(long) 0;
        Long lcsn=(long) 0;
        for (Long i = (long) 1; i < n; i++) {
            Long t=(long) 0;
            Long num=i;
            while (num!=1) {
                if (num%2==0) {
                    num=num/2;
                    t++;
                }
                else{
                    num = 3*num + 1; 
                    t++;
                }
            }
            if (t>max) {
                max=t;
                lcsn=i;
            }
            
        }
        System.out.println("Longest Collatz Sequence number is " +lcsn);
        System.out.println("with "+max+ " terms");
        sc.close();
    }
}
