package graphs.BC;
import java.util.*;

public class _5ShortestPathSnakeLadderBfs{
   
    static  Map<Integer,List<Integer>> map=new HashMap<>();
        public static void main(String args[]){
    
            int board[]= new int[50];
            board[2]=13;
            board[5]=2;
            board[9]=18;
            board[18]=11;
            board[17]=-13;
            board[20]=-14;
            board[24]=-8;
            board[25]=10;
            board[32]=-2;
            board[34]=-22;
            
    
    
            //   addEdge(0,3);
            //   addEdge(0,1);
            //   addEdge(2,1);
            //   addEdge(3,4);
            //   addEdge(4,5);
    
            for(int i=0;i<=36;i++){
                for(int dice=1;dice<=6;dice++){
                    int j=i+dice;
                    j+=board[j];
                    if(j<=36){
                        addEdge(i,j);
                    }
                }
            }
    
            addEdge(36,36);
    
    
            System.out.println( bfs(0,36));
    
    
    
    
        }
    
        public static void addEdge(int x,int y){
    
            if(map.get(x)==null){
                List <Integer> l1=new LinkedList<>();
                 l1.add(y);
                 map.put(x,l1);
            }else{
                map.get(x).add(y);
    
            }
    
            if(map.get(y)==null){
                List<Integer> l2=new LinkedList<>();
                l2.add(x);
                map.put(y,l2);
    
            }else{
                map.get(y).add(x);
            }
    
    
        }
    
        public static int bfs(int src,int dest){
    
            Map<Integer,Integer> parent= new HashMap<>();
    
            Map<Integer,Integer>dist=new HashMap<>();
            Queue<Integer> qu=new LinkedList<>();
    
            for(Map.Entry<Integer,List<Integer>> entry: map.entrySet() ){
    
                   int node= entry.getKey();
                   dist.put(node,Integer.MAX_VALUE);
    
            }
    
            dist.put(src,0);
            qu.add(src);
            parent.put(src,src);
    
            while(!qu.isEmpty()){
                int currentKey=qu.poll();
    
                 if(map.get(currentKey)!=null){
    
                     int size= map.get(currentKey).size();
                     for(int i=0;i<size;i++){
    
                         int nbr=map.get(currentKey).get(i);
    
                           if(dist.get(nbr)==Integer.MAX_VALUE){
                               qu.add(nbr);
                               dist.put(nbr,dist.get(currentKey)+1);
                               parent.put(nbr,currentKey);
                           }
                     }
                 }
            }
    
            for(Map.Entry<Integer,List<Integer>> res: map.entrySet()){
    
                int n=res.getKey();
                int d= dist.get(n);
    
                System.out.println(n+" dist from src "+d);
    
    
            }
            
            int temp=dest;
            while(temp !=src){
                System.out.print(temp+"<-- ");
                temp=parent.get(temp);
            }
            System.out.print(temp+"<-- ");
    
    
            return dist.get(dest);
    
        }
        
    }
    
    
    