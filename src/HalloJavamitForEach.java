import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class HalloJavamitForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("187");
        list.add("test");
        list.add("abc");
        
        for (String numb : list) {
            System.out.println(numb);
        }
        System.out.println("\n");
        list.forEach((String numb) -> System.out.println(numb));

        Consumer<String> consumer = (String s) -> System.out.println(s);

        System.out.println("\n");
        list.forEach(System.out::print);
        }
    }

