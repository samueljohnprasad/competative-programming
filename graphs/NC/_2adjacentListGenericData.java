package graphs.NC;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class _2adjacentListGenericData {

      HashMap<String ,List<pair>> map;
    public static void main(String s[]){


    }

    public void addEdge(String x,String y,boolean birdir, int wt){
            List <pair> list=new LinkedList<>();
            list.add(new pair(y,wt));
            
            map.put(x,list);
            if(birdir){
                list.add(new pair(x,wt));
                map.put(y,list);
            }
    }
    
    
}

class pair{
    int data;
    String str;

    pair(String str,int data){
        this.data=data;
        this.str=str;
    }
}
