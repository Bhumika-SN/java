import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class mergeinterval{

    public static void main(String[] args) {

        ArrayList<int[]> intervals = new ArrayList<>();

        intervals.add(new int[]{1,3});
        intervals.add(new int[]{2,6});
        intervals.add(new int[]{8,10});
        intervals.add(new int[]{15,18});

        Collections.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        ArrayList<int[]> result = new ArrayList<>();

        result.add(intervals.get(0));

        for(int i = 1; i < intervals.size(); i++) {

            int[] current = intervals.get(i);
            int[] last = result.get(result.size() - 1);

            if(current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            }
            else {
                result.add(current);
            }
        }

        System.out.println("Merged Intervals:");
        for(int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i)[0] + " " + result.get(i)[1]);
        }
    }
}