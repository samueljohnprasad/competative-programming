package graphs.BC;
import java.util.*;

 class Graph  {
      
        List<List<Integer>> arrlist=new  ArrayList<>();
        int V;

        Graph(int V){
            this.V=V;
        }

        public static void main(String args[]){
              Graph g= new Graph(4);
              g.addEdge(0, 1, 1);
              g.addEdge(1, 3, 3);
              g.addEdge(3, 2, 4);
              g.addEdge(2, 0, 2);
              g.addEdge(0, 3, 2);
              g.addEdge(1, 2, 2);

            System.out.println( g.kruskals());
        }


        public void addEdge(int x,int y,int w){
          arrlist.add(new ArrayList<Integer>(Arrays.asList(x,y,w)));
        }

        int kruskals(){
           //sorting arrlist
           arrlist.sort((l1, l2)-> l1.get(2).compareTo(l2.get(2)));
             
             DSU s= new DSU(V);
           int ans=0;
           for(List<Integer> edge:arrlist){
               int x=edge.get(0);
               int y=edge.get(1);
               int w=edge.get(2);
               

               //take that edge that does not form a cycle
                     
               if(s.findSet(x)!=s.findSet(y)){
                   s.unionSet(x, y);
                   ans+=w;
               }
            }
            return ans;
        }
    
        



    
}


class DSU{

    int parent [];
    int rank[];

    DSU(int n){
        parent=new int[n];

        rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=-1;
            rank[i]=1;
        }
    }


    public int findSet(int i){
        if(parent[i]==-1) return i;

        return   parent[i]= findSet(parent[i]);
    }

    public void unionSet(int x,int y){
        int s1=findSet(x);
        int s2=findSet(y);

        if(s1!=s2){
            if(rank[s1]<rank[s2]){
                parent[s1]=s2;
                rank[s2]+=rank[s1];
            }else{
                parent[s2]=s1;
                rank[s1]+=rank[s2];
            }
        }
    }
}
