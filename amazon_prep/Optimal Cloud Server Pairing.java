import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        int ans=0;
        Arrays.sort(l);
        for(int i=n-2;i>=0;i-=2){
            ans+=l[i];
        }
        System.out.println(ans);
    }
}
