import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List;
import java.util.Scanner;
public class Wordsplit{

    public static String words(String[] strArr){
        String finalword= "";
        String wordmatch = strArr[0];
        String[] wordDictionary = strArr[1].split(",");
        ArrayList<String> wordicClone 
            = new ArrayList<String>(Arrays.asList(wordDictionary));
        for(String s:wordDictionary){
            String newWord = wordmatch.replace(s,"");
              for(String sss:wordicClone){
                     if(newWord.equals(sss)){
                         String anotherWord = wordmatch.replace(newWord,"");
                         if(wordmatch.equals(anotherWord+sss)){
                             finalword = anotherWord+","+sss;
                         }else if(wordmatch.equals(sss+anotherWord)){
                             finalword = sss+","+anotherWord;
                         }
                     }
             }
        }
        return finalword;
    }
     public static void main(String []args){
    String[] strArr={"abcdgef","a,all,b,bc,ge,gef,z,abc,bal,abcd"};
        System.out.println(Wordsplit.words(strArr));
     }
}
