import java.util.HashMap;
import java.util.Scanner;

import javax.swing.RowFilter.Entry;

public class udgraph {

public class udgraphNode {
    
        int data;
        HashMap<udgraphNode,Integer> nodes;

    udgraphNode(int data){
        this.data=data;
        nodes=new HashMap<>();
    }

    public void add(int data,int[] node){
        udgraphNode new_Node=new udgraphNode(data);
        for (int i = 0; i < node.length; i++) {
            udgraphNode nextnode=new udgraphNode(node[i]);
            nodes.put(nextnode,0);
        }
    }

    public void traverse(udgraphNode u){
        // System.out.println("Your graph :");
        udgraphNode originNode=u;
        while(true){
            System.out.print(originNode.data+" ");
            for (java.util.Map.Entry<udgraph.udgraphNode, Integer> entry : nodes.entrySet()) {
                originNode=entry.getKey();
                int val=entry.getValue();
                if(val==0){
                nodes.put(originNode,1);
                traverse(originNode);
                }
            }
            
        }
    }

    public static void main(String[] args) {
        udgraph u = new udgraph();
        Scanner userinput = new Scanner(System.in);
        boolean run=true;
        while(run){

    }
}
}
}
