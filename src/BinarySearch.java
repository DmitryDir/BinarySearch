import java.util.Collections;
import java.util.List;

public class BinarySearch {

    public int binarySearch(List list, Integer searchItem) {
        Collections.sort(list);
        int low = 0;
        int high = list.size() - 1;
        int numberSearchElem = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = (int) list.get(mid);
            if (guess == searchItem) {
                return numberSearchElem;
            }
            if (guess > searchItem) {
                high = mid - 1;
            }
            if (guess < searchItem) {
                low = mid + 1;
            }
            numberSearchElem++;
        }
        return 0;
    }
}
