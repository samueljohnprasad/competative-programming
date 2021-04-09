package graphs.BC;
import java.util.*; 


public class _15StronglyConnectedCompDfs {
     static int N;
   // static Map<Integer,List<Integer>>  map=new HashMap<>();
    //static Map<Integer,List<Integer>>  revGraph=new HashMap<>();

    public static void main(String args[]){

        Scanner sc= new Scanner (System.in);
        N=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> graph= new ArrayList<>();
        List<List<Integer>> newgraph= new ArrayList<>();
        for(int i=0;i<N;i++){
            graph.add(new ArrayList<>());
            newgraph.add(new ArrayList<>());

        }

        while(m-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
           graph.get(x).add(y);
           newgraph.get(y).add(x);
        
        }

         System.out.println(solve(graph, newgraph, N));



    }

    public static void dfs(List<List<Integer>> graph,int i,boolean[] visited,Stack<Integer> stack){
              visited[i]=true;

                  for(int nbr: graph.get(i)){
                      if(!visited[nbr]){
                          dfs(graph,nbr,visited,stack);
                      }
                  }
              //function call is complete
            //  System.out.println(i+"i");
              stack.push(i);

           
    }
    public static void dfs2(List<List<Integer>> newGraph,int i,boolean[] visited){
        visited[i]=true;
        System.out.print(i+" ");
        if(newGraph.get(i)!=null){
        for(Integer nbr : newGraph.get(i)){
            if(!visited[nbr]){
                dfs2(newGraph,nbr,visited);
            }

        }
    }

     
}

    public static int solve(List<List<Integer>> graph, List<List<Integer>> newGraph,int N){
                       boolean visited[]= new boolean[N];

                      //ArrayList<Integer> stack= new ArrayList<>();
                      Stack<Integer> stack= new Stack<>();

                    //step : 1 need to store the vertices acc to dfs finish time
                     for(int i=0;i<N;i++){
                         if(!visited[i]){
                             dfs(graph,i,visited,stack);
                              
                         }
                     }

                     //at this point stack is ordered
                     //step -2 reverse
                     // step-3 do dfs acc to ordering given inthe stack
                    visited=new boolean[N];
                    char comp='A';
                    int count=0;
                    while(stack.size()>0){
                        int curr=stack.pop();
                        if(visited[curr]==false){
                            System.out.print(comp+"--> ");
                              dfs2(newGraph,curr,visited);
                              System.out.println();
                              count++;
                              comp++;

                        }
                    }


       return count;


    }

   
    
}
/*
 7 8
 2 1
 1 0
 0 2
 0 3 
 3 5
 5 6
 6 3
 3 4
 */