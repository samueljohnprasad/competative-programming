package graphs.NC;
import java.util.LinkedList;

public class _1adjacentList {

     int V;
   static LinkedList<Integer> [] list;

    public _1adjacentList(int V){
        this.V=V;
        list=new LinkedList[V];
        for(int i=0;i<V;i++){
            list[i]=new LinkedList<>();
        }
       
    }
    public  void addEdge(int x,int y){
        list[x].add(y);
        list[y].add(x); 
    }
    public  void printAdjList(){
        for(int i=0;i<this.V;i++){
            System.out.print("vertex "+i+":");
              for(int x: list[i]){
                      System.out.print(x+" ");
              }
              System.out.println();
        }
    }
    public static void main(String args[]){
        _1adjacentList graphs = new _1adjacentList(4);
        graphs.addEdge(0, 1);
        graphs.addEdge(0, 2);
        graphs.addEdge(2, 3);
        graphs.addEdge(1, 2);

        graphs.printAdjList();


    }
    
}
