import java.util.Scanner;
import java.lang.Math;

/**
 * ipaddress
 */
public class ipaddress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("List of " +n+" IP addresses:");
        if(n>0){
        for(int i=0;i<n;i++){
            int a=(int)((Math.random() * (255 - 0)) + 0);
            int b=(int)((Math.random() * (255 - 0)) + 0);
            int c=(int)((Math.random() * (255 - 0)) + 0);
            int d=(int)((Math.random() * (255 - 0)) + 0);
            System.out.println("IP address "+i+1 + ":" +a+"."+b+"."+c+"."+d);
        }
    }
    }
}