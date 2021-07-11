import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {
       int count =0;
       ArrayList<Integer> alnew = new ArrayList<>();
       for(Integer intar: ar){
           alnew.add(intar);
           /*for(int j=1; i<n; j++){
               if(ar[i] == ar[j]){
                   count++;
               }
           }*/
       }
       Collections.sort(alnew); 
       
       for(Integer intnew:alnew){
           System.out.println(intnew);
           if(){
               
           }
       }
       return count;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
