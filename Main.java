
import java.util.ArrayList;
import java.util.List;

class Coustomer {
    private int id;
    private String name;

    public Coustomer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
      return "ID: " + id + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {

    //updating i
        List<Coustomer> list = new ArrayList<>();

        list.add(new Coustomer(1, "Boomika"));
        list.add(new Coustomer(2, "Charan"));
        list.add(new Coustomer(3, "Appu"));

        System.out.println(list);
    }
}