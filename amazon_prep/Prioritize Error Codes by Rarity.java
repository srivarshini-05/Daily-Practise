// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int[] c=new int[n];
        for(int i=0;i<n;i++ ){
            c[l[i]]++;
        }
        Integer[] an=new Integer[n];
        for(int i=0;i<n;i++){
            an[i]=l[i];
        }
        Arrays.sort(an,(a,b)->{
        int fa=c[a];
        int fb=c[b];
        if(fa!=fb){
            return Integer.compare(fa,fb);
        }
        else{
            return Integer.compare(a,b);
        }});
        
        for(int i=0;i<n;i++){
System.out.println(an[i]);
        }
        
    }
}

////part 2
import java.util.Arrays;

class Solution {
    public int[] sortBugReportFrequencies(int[] errors) {
        int n = errors.length;
        
        // Step 1: Count frequencies
        // The array size is 1000001 to accommodate error codes up to 10^6
        int[] count = new int[1000001];
        for (int i = 0; i < n; i++) {
            count[errors[i]]++;
        }
        
        // Step 2: Encode frequency and value into a 64-bit long
        long[] encoded = new long[n];
        for (int i = 0; i < n; i++) {
            int val = errors[i];
            int freq = count[val];
            
            // Shift frequency to the top 32 bits, and put the value in the bottom 32 bits
            encoded[i] = ((long) freq << 32) | val;
        }
        
        // Step 3: Sort the encoded array
        // This sorts by frequency first, then by value (exactly as required)
        Arrays.sort(encoded);
        
        // Step 4: Decode back to an int array
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            // Use a bitwise AND mask to extract only the bottom 32 bits
            result[i] = (int) (encoded[i] & 0xFFFFFFFFL);
        }
        
        return result;
    }
}
