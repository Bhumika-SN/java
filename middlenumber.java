import java.util.Scanner;

public class middlenumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n % 2 == 1) {
            System.out.println("middle number is: " + arr[n/2]);
        } else {
            System.out.println("middle numbers are: " + arr[n/2 - 1] + " and " + arr[n/2]);
        }

        sc.close();
    }
}
