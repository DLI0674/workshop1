package workshop1.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            int x=sc.nextInt();
            arr.add(x);
        }
        HashSet<Integer>st=new HashSet<Integer>();
        for(int i=0;i<arr.size();i++){
            st.add(arr.get(i));
        }
        int ans=1;
        for(int i=0;i<arr.size();i++){
            int idx=arr.get(i);
            int res=1;
            while(st.contains(idx+1)){
                idx++;
                res++;
            }
            ans=Math.max(ans,res);
        }
        System.out.println(ans);
    }
}
