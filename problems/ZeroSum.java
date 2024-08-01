package workshop1.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZeroSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            int x=sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
        System.out.println(arr);
        ArrayList<ArrayList<Integer>>ans=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<10-2;i++){
            int l=i+1,r=9;
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
