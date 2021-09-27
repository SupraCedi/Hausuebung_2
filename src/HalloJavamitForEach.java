import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    private List<String> list = new ArrayList<>();

    public HalloJavamitForEach(List<String> list) {
        this.list = list;
    }

    public void printList() {
        for (String numb : list) {
            System.out.println(numb);
        }
    }
}
