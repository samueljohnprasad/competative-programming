package graphs.BC;
import java.util.*;
class _16CycleDectectionUndirectedDSU{

     static int V;
   static  List< Pair> arrlist= new ArrayList<>();

	public static void main(String args[]){

          
          V=4;
          // for(int i=0;i<n;i++){
          // 	arr.add(i,new Pair<>());
          // }

          addEdge(0,1);
          addEdge(1,2);
          addEdge(2,3);
          addEdge(3,0);

         System.out.println(containsCycle());
	}

	public static boolean containsCycle(){
		//checks graph contains the cycle aor not

		int []parent =new int [V];
		for(int i=0;i<V;i++){
			parent[i]=-1;
		}

		  for(Pair edge: arrlist){
		  	int i=edge.x;
		  	int j=edge.y;

		  	int s1=findSet(i,parent);
		  	int s2=findSet(j,parent);// checking for check

		  	 if(s1!=s2){
		  	 	unionSet(s1,s2,parent);
		  	 }else{
		  	 	System.out.print("same parent for"+s1 +" and "+s2);
		  	 	return true;
		  	 }
		  }
		  return false;
	}

	public static int findSet(int i, int parent[]){
		if(parent[i]== -1){
			return i;
		}

		return findSet(parent[i],parent);
	}
	public static void unionSet(int x,int y,int[] parent){
		 int s1= findSet(x,parent);
		 int s2=findSet(y,parent);  // for merging

		 if(s1!=s2){
		 	parent[s1]=s2;
		 }


	}
	public static void addEdge(int x,int y){

		    arrlist.add(new Pair(x,y));

	} 


}

class Pair{
	int x;
	int y;
	Pair(int x,int y){
		this.x=x;
		this.y=y;

	}
}