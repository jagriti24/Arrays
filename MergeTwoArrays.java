import java.util.ArrayList;

/**
 * Program to merge two arrays in sorted order, without using sort
 * Created by jagriti on 1/4/15.
 */
public class MergeTwoArrays {

    public static void commonSolution(){
        int a[]= {1,3,4,8};
        int b[] = {2,5,9,9,12};

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int j=0;
        int i=0;

        while(i!=a.length || j!=b.length){
            if(i!=a.length && a[i]<b[j]){
                arr.add(a[i]);
                i++;
            }
            else {
                if (j!=b.length){
                    arr.add(b[j]);
                    j++;
                } else break;
            }
        }
        System.out.println(arr);
    }


    public static void main(String args[]){

        commonSolution();

    }
}

