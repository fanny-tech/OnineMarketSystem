import java.util.HashSet;
public class Ibara{
    public static void main(String []args){
        HashSet<String>Ibara=new HashSet<>();
        Ibara.add("umutuku");
        Ibara.add("ubururu");
        Ibara.add("umuhondo");

        System.out.println(Ibara.size());
        System.out.println(Ibara.contains("ubururu"));
    }
}