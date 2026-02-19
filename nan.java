import java.util.*;

public class nan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed))
            System.out.println(reversed);
        else
            System.out.println(s);
    }
}
