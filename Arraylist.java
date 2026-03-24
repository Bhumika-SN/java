import java.util.*;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
list.add(200);
        list.add(50);
        list.add(10);

        System.out.println("Original List: " + list);

        
        System.out.println("Element at index 2: " + list.get(2));

        
        list.set(1, 25);
        System.out.println("After Update: " + list);

        
        list.remove(Integer.valueOf(30));
        System.out.println("After Removal: " + list);

        
        if(list.contains(40)) {
            System.out.println("40 is present in list");
        }

    
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println("Without Duplicates: " + set);

        
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : list) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency: " + freq);

        
        Collections.sort(list);
        int secondLargest = list.get(list.size() - 2);
        System.out.println("Second Largest: " + secondLargest);

        
        int sum = 0;
        for(int num : list) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
}

// commit
