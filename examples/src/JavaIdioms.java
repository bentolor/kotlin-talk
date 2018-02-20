import java.util.Arrays;
import java.util.List;

public class JavaIdioms {

    public void iterateListByIndex() {
        List<String> list = Arrays.asList("a","b","c");
        for (int index = 0; index < list.size(); index++) {
            System.out.println(index + " -> " + list.get(index));
        }
    }

    public static void main(String[] args) {
        JavaIdioms idioms = new JavaIdioms();
        idioms.iterateListByIndex();
    }

}
