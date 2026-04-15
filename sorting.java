import java.util.*;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();

        for(int[] interval : intervals) {
            if(res.size() == 0 || res.get(res.size()-1)[1] < interval[0]) {
                res.add(interval);
            } else {
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], interval[1]);
            }
        }

        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for(int[] i : result) {
            System.out.println(i[0] + " " + i[1]);
        }
    }
}

//Given intervals, merge overlapping ones.

//Input
//[[1,3],[2,6],[8,10],[15,18]]
//Output
//[[1,6],[8,10],[15,18]]

//Sort intervals based on start
//Traverse and merge overlapping intervals
