package arrays.leetcode;
import java.util.*;
import java.io.*;
public class _1CountCharacters1160 {

    public static void main(String args[]){

       String [] words= {"cat","bt","hat","tree"};
       String chars="atach";

      System.out.println( countCharacters(words,chars));
      System.out.println( countCharacters2(words,chars));

    }

    public static int  countCharacters(String [] words, String chars){

        Map<Character , Integer> map= new HashMap<>();

        for(char ch : chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        int result=0;
        for(String word : words){

             Map<Character , Integer> temp= new HashMap<>(map);
             boolean good =true;

             for(int i=0;i<word.length();i++){
                 char ch=word.charAt(i);

                 if(temp.containsKey(ch) && temp.get(ch)>0){
                     temp.put(ch,temp.get(ch)-1);
                 }else{
                     good=false;
                     break;
                 }
             }

             if(good){
                 result+=word.length();
             }
        }

        return result;
    }


    //without copy map
    public static int countCharacters2(String [] words,String chars){
        
        Map<Character,Integer> map= new HashMap<>();
         for(char c: chars.toCharArray()){

            map.put(c,map.getOrDefault(c,0)+1);

         }

         int result=0;

         Map<Character,Integer> temp=new HashMap<>();

         for(String word : words){
             boolean good=true;
              for(char c: word.toCharArray()){

                   if(temp.getOrDefault(c,0)>= map.getOrDefault(c,0) ){

                          good=false;
                          break;

                   }
                   map.put(c,map.getOrDefault(c,0)+1);
                   
              }
              if(good){
                result+=word.length();
            }
         }

        return result;
    }

    //without hashmap . using only array\\

    public static int countCharacters3(String [] words,String chars){

        int[] letters= new int[26];

        for(int i=0;i<chars.length();i++){

            letters[chars.charAt(i)-'a']++;

        }

        int result=0;
 
        word:
        for(String word: words){

            int [] quota =new int[26];
            for(char c: word.toCharArray()){
                 var letter =c-'a';
                 if(letters[letter]<1 || quota[letter]++>= letters[letter]){
                     continue word;
                 }
            }
            result+=word.length();
        }

        return result;

    }

    
}
