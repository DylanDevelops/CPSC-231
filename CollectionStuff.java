import java.util.ArrayList;
import java.util.List;

public class CollectionStuff {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Hello");
        list.add("There");

        System.out.println(list);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
