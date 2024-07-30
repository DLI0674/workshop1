package workshop1.problems;

import java.util.ArrayList;
import java.util.Collections;

public class ZeroSum {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<20;i++){
            arr.add((int)(-20+Math.random()*(20+20)));
        }
        Collections.sort(arr);
        System.out.println(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<20-2;i++){
            int l=i+1,r=19;
            while(l<r){
                if(arr.get(i)+arr.get(l)+arr.get(r)==0){
                    ArrayList<Integer>a=new ArrayList<Integer>();
                    a.add(arr.get(i));
                    a.add(arr.get(l));
                    a.add(arr.get(r));
                    ans.add(a);
                    l++;
                    r--;
                }
                else if(arr.get(i)+arr.get(l)+arr.get(r)<=0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        System.out.println(ans);
    }
}
