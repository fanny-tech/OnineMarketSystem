import java.util.ArrayList;
public class Name {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<>();
        name.add("alice");
        name.add("bobo");
        name.add("fanny");

        System.out.println(name.get(0));
        System.out.println(name.get(1));
        System.out.println(name.size());
        System.out.println(name.remove("fanny"));
    }
}