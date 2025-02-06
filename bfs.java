import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

public static void main(String[] args) {
    int vertices =5;
    ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    for(int i=0;i< vertices;i++)
    {
        adj.add(new ArrayList<>());
    }

adj.get(0).add(1);
adj.get(0).add(2);
adj.get(1).add(0);
adj.get(1).add(3);
adj.get(1).add(4);
adj.get(2).add(0);
adj.get(3).add(1);
adj.get(4).add(1);

bfs(adj,vertices,0);

}

public static void bfs(ArrayList<ArrayList<Integer>> adj,int vertices,int start){
//created a visited array to keep track of visited node
    boolean [] visited =new boolean[vertices];
//queue for bfs
    Queue<Integer> queue=new LinkedList<>();
//mark the starting of node as visited and enqueue 
    visited[start]=true;
    queue.add(start);
    System.out.print("start from here"+start+" :");

//standard bfs loop
    while(!queue.isEmpty()){
    //dequeue a vertex and print it
        int current =queue.poll();
        System.out.print(current+" ");
//get  all the adjacent vertices of dequeue vertex
        for(int neighbor:adj.get(current)){
            //if an adjacent vertex has not been visisted,it and mark it visited and enquue it 
            if(!visited[neighbor]){
                visited[neighbor]=true;
                queue.add(neighbor);         }
        }
    }
    System.out.println();
} 
}
