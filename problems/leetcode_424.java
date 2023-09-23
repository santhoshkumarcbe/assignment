
import java.util.HashMap;
import java.util.Scanner;

public class leetcode_424 {
    // [Java] Leetcode 424. Longest Repeating Character Replacement

    public static int characterReplacement(String s, int k) {
        char[] c=s.toCharArray();
        int left=0,right=0,n=c.length;
        HashMap<Character,Integer> freq=new HashMap<>();
        int maxlen=0,mostfreq=0;

        // find Longest Repeating Character Replacement
        while(right<n){
            // expand substring
            freq.put(c[right],freq.getOrDefault(c[right],0)+1);
            mostfreq=Math.max(mostfreq,freq.get(c[right]));

            // shrink substring size if we need to replace more than k char
            if((right-left+1)-mostfreq>k){
                freq.put(c[left],freq.get(c[left])-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
        // ArrayList<Character> c= new ArrayList<>();
        // int max=0;
        // int res=0;
        // int l=0;
        // int r=k;
        // int n=s.length();
        // boolean run=true;
        // while(run){
        //   for(int i=l;i<=r;i++){
        //     freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        //   }
        // }
        // for(int i=0;i<n;i++){
        //   if(c.Contains(s.charAt(i))){

        //   }
        //   else{
        //     c.add(s.charAt(i));
        //   }
        // }
        // return 4;
    }


public static void main(String[] args) {
    Scanner userinput=new Scanner(System.in);
    System.out.println("Enter the String ");
    String s=userinput.next();
    System.out.println("Enter the maximum number of replacement");
    int k=userinput.nextInt();
    System.out.println("The longest substring containing the same letter after replacements is of length "+characterReplacement( s, k));
    userinput.close();
    
}
    
}
