package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        List<Interval>list=new ArrayList<>();

        list.add(new Interval(2,1));
         list.add(new Interval(1,10));

        Solution obj=new Solution();

        obj.mergeIntervals(list);

        for(Interval x:list){
            System.out.println(x.start+" "+x.finish);
        }
    }
}





 class Interval {
 int start,finish;

 Interval(int start, int finish) {
 this.start = start;
 this.finish = finish;
 }
 }




class Sortbystart implements Comparator<Interval> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Interval a, Interval b)
    {

        return a.start - b.start;
    }
};

 class Solution {

     List<Interval> mergeIntervals(List<Interval> list) {
        int flag=0;




        Collections.sort(list,new Sortbystart());
        ;
        for(int i=0;i<list.size()-1;i++){
            if((list.get(i+1).start<=list.get(i).finish)){
                list.get(i+1).start=list.get(i).start;
                list.get(i+1).finish=Integer.max(list.get(i).finish,list.get(i+1).finish);
                list.remove(i);
                i--;
            }



        }


        return list;


    }
}





