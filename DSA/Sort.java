import java.util.*;
public class Sort {
    static int tc=0;

    public static void quicksort(ArrayList<Integer> arr,int s,int e){
        int i=s-1;
        // try with pivot = (s+e)/2;
        int pivot=e;
        for (int j = s; j < arr.size(); j++) {
            if(arr.get(j)<arr.get(pivot)){
                i++;
                int t=arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j, t);
            }
        }
         pivot=i+1;
        int t=arr.get(pivot);
        arr.set(pivot,arr.get(e));
        arr.set(e,t);
        if(pivot>s)
        quicksort(arr, s, pivot-1);
        if(pivot<e)
        quicksort(arr, pivot+1, e);
       
    }

    public static void quicksortWithMidPivot(ArrayList<Integer> arr,int s,int e){
        int pivot=(s+e)/2;
        int left=s;
        int right=e;
        while(left<=right){
        while(arr.get(left)<arr.get(pivot) && left<e)
        left++;
        while(arr.get(right)>arr.get(pivot) && right>s)
        right--;
        if(left<=right){
            int t=arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right,t);
            left++;
            right--;
        }
    }
    if(left-1 >s)
    quicksortWithMidPivot(arr, s, left-1);
    if(left<e)
    quicksortWithMidPivot(arr, left, e);
       
    }


    public static void split(ArrayList<Integer> arr,int s, int e){
        int m;
        if(s<e){
        m=(s+e)/2;
        split(arr, s, m);
        split(arr, m+1, e);
        mergesort(arr, s, e);
        }
       
    }
    public static void mergesort(ArrayList<Integer> arr,int s, int e){
        int c=s;
        int m=(s+e)/2;
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> r=new ArrayList<>();
        for (int i = s; i <=m; i++) {
            l.add(arr.get(i));
        }
        for (int i = m+1; i <=e; i++) {
            r.add(arr.get(i));
        }
        int ls=l.size();
        int rs=r.size();
        int i=0,j=0;
        while (i<ls && j<rs) {
            if(l.get(i)<r.get(j)){
                arr.set(c,l.get(i));
                i++;
                c++;
            }
            else{
                arr.set(c,r.get(j));
                j++;
                c++;
            }
        }

        while(i<ls){
            arr.set(c,l.get(i));
                i++;
                c++;
        }
        while(j<rs){
            arr.set(c,r.get(j));
                j++;
                c++;
        }
    }

    public static void selectionsort(ArrayList<Integer> sarr){
        for (int i = 0; i < sarr.size()-1; i++) {
            for (int j = i+1; j < sarr.size(); j++) {
                if(sarr.get(i)>sarr.get(j)){
                    int t=sarr.get(i);
                    sarr.set(i,sarr.get(j));
                    sarr.set(j,t);
                }
            }  
        }
    }

    public static boolean DescendingSelectionSort(ArrayList<Integer> sarr){
        for (int i = 0; i < sarr.size()-1; i++) {
            for (int j = i+1; j < sarr.size(); j++) {
                if(sarr.get(i)<sarr.get(j)){
                    int t=sarr.get(i);
                    sarr.set(i,sarr.get(j));
                    sarr.set(j,t);
                }
            }  
        }
        return true;
    }

    public static void bubblesort(ArrayList<Integer> arr){
        boolean swap=false;
        for (int i = 0; i < arr.size(); i++) {
            swap=false;
            for (int j = 0; j < arr.size()-1; j++) {
            if(arr.get(j) > arr.get(j+1)){
                int temp=arr.get(j);
                arr.set(j,arr.get(j+1));
                arr.set(j+1,temp);
                swap=true;
            }
        }
        if(!swap){
                break;
            }
        }
    }
    
    public static void cocktailsort(ArrayList<Integer> arr){
        boolean sorted=true;
        int start=0;
        int end=arr.size()-1;
        while (sorted) {
            sorted=false;
            for (int i=start; i < end; i++) {
                if (arr.get(i)>arr.get(i+1)) {
                    int temp=arr.get(i);
                    arr.set(i,arr.get(i+1));
                    arr.set(i+1,temp);
                    sorted=true;
                }
            }
            
            // sorted=false;
            end--;
            for (int i = end; i >start; i--) {
                if(arr.get(i) < arr.get(i-1)){
                    int temp=arr.get(i);
                    arr.set(i,arr.get(i-1));
                    arr.set(i-1,temp);
                    sorted=true;
                }
            }
            start++;
            
        }
    }
 

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        ArrayList<Integer> sarr=new ArrayList<>();
        boolean run=true;   
        while(run){
            System.out.println("Enter a number to perform");
            System.out.println("(1) add");
            System.out.println("(2) show unorder array");
            System.out.println("(3) Bubble sort");
            System.out.println("(4) Selection sort");
            System.out.println("(5) Cocktail sort");
            System.out.println("(6) Quick sort");
            System.out.println("(7) Quick sort with mid point as pivot");
            System.out.println("(8) Merge sort");
            System.out.println("(9) Descending order Selection sort");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
            switch (n) {
                case 1:{
                    System.out.println("Enter a number to add");
                    int e = userinput.nextInt();
                    sarr.add(e);
                    System.out.println("Your array : "+ sarr);
                    break;
                }
                case 2:{
                    System.out.println("Your array : "+ sarr);
                    break;
                }
                case 3:{
                    bubblesort(sarr);
                    System.out.println("Your bubble sort array : "+ sarr);
                    break;
                }
                case 4:{
                    selectionsort(sarr);
                    System.out.println("Your selection sort array : "+ sarr);
                    break;
                }
                case 5:{
                    cocktailsort(sarr);
                    System.out.println("Your cocktail sort array : "+ sarr);
                    break;
                }
                case 6:{
                    
                    quicksort(sarr,0,sarr.size()-1);
                    System.out.println("Your Quick sort array : "+ sarr);
                    break;
                }
                case 7:{
                    
                    quicksortWithMidPivot(sarr, 0, sarr.size()-1);
                    System.out.println("Your Quick sort array : "+ sarr);
                    break;
                }
                case 8:{
                    split(sarr,0,sarr.size()-1);
                    System.out.println("Your Merge sort array : "+ sarr);
                    break;
                }
                case 9:{
                    DescendingSelectionSort(sarr);
                    System.out.println("Your Descending order selection sort array : "+ sarr);
                    break;
                }
                case 0:{
                    run=false;
                    break;
                }
                default:{
                    System.out.println("Please enter a valid number");
                    break;
                }
        }
    }
    userinput.close();
}
}

