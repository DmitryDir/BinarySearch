import java.util.ArrayList;
import java.util.List;

public class TestSearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            list.add(i);
        }
        Integer searchItem = 1;

        var binarySearch = new BinarySearch();
        int numberOfSearchElem = binarySearch.binarySearch(list, searchItem);

        System.out.println(numberOfSearchElem);
    }
}
