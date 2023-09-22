import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.RowFilter.Entry;

public class udgraph {
    static int tc=0;
static ArrayList<udgraphNode> shownodes=new ArrayList<>();
   
public class udgraphNode{
        int data;
        HashMap<udgraphNode,Integer> nodes;

    udgraphNode(int data){
        this.data=data;
        nodes=new HashMap<>();
    }
}


    public static void add(int data,ArrayList<udgraphNode> node, udgraph u){
        udgraphNode new_Node=u.new udgraphNode(data);
        shownodes.add(new_Node);
        for (int i = 0; i < node.size(); i++) {
            udgraphNode nextnode=node.get(i);
            nextnode.nodes.put(nextnode,0);
        }
    }

    public static void traverse(udgraphNode u){
        // System.out.println("Your graph :");
        udgraphNode originNode=u;
        udgraphNode nextNode=null;
        while(true){
            System.out.print(originNode.data+" ");
            if (tc==shownodes.size()) {
                break;
            }
            for (java.util.Map.Entry<udgraph.udgraphNode, Integer> entry : nodes.entrySet()) {
                nextNode=entry.getKey();
                int val=entry.getValue();
                if(val==0){
                originNode.nodes.put(nextNode,1);
                traverse(nextNode);
                tc++;
                }
            }
            
        }
    }

    public static void main(String[] args) {
        udgraph u = new udgraph();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("Enter a number to perform :");
            System.out.println("(1) add");
            System.out.println("(2) Show nodes with next nodes");
            System.out.println("(3) traverse");
            System.out.println("(0) exit");
            int n=userinput.nextInt();
            switch (n) {
            case 0: {
                run=false;
                break;
            }
            case 1: {
                System.out.println("Enter a number to insert");
                int e=userinput.nextInt();
                System.out.println("Enter number of next nodes");
                int k=userinput.nextInt();
                ArrayList<udgraphNode> node= new ArrayList<>();
                for (int i = 0; i < k; i++) {
                    System.out.println("Enter next node "+(i+1));
                    udgraphNode iNode=u.new udgraphNode(userinput.nextInt());
                    node.add(iNode);
                }
                add(e, node, u);
                break;
            }
            case 2:{
                for (udgraphNode udn : shownodes) {
                    System.out.println(udn.data + " => ");
                    System.out.println("Next nodes : ");
                    for (Map.Entry<udgraphNode,Integer> entry : udn.nodes.entrySet()) {
                        System.out.print(entry.getKey()+ " ");
                    }
                    System.out.println();
                }
            }
            case 3:{
                System.out.println("Enter the origin Node");
                udgraphNode originNode = u.new udgraphNode(userinput.nextInt());
                tc=0;
                traverse(originNode);
            }
    }
}
userinput.close();
}

}

