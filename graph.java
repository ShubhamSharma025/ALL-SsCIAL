import java.util.ArrayList;

public class graph {
    public static void main(String[] args) {
        int n =5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
      addEdge(adj,0,1);
      addEdge(adj,0,2); 
      addEdge(adj,1,3);
      addEdge(adj,1,2);
      addEdge(adj,3,2);

      print(adj);
    }
      
    public static void addEdge(ArrayList<ArrayList<Integer>>adj,int source,int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

    public static void print(ArrayList<ArrayList<Integer>>adj) {

      for(int i =0;i<adj.size();i++){
        System.out.print( i + "->");
        for(int not : adj.get(i)){
            System.out.print(not+ " ");
        }
        System.out.println();
      }
    } 


}
