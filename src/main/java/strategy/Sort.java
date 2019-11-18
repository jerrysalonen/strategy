package strategy;

/**
 * @author Jerry Salonen
 */
public class Sort {

    public void sort(SortingStrategy s, int[] arr) {
        s.sort(arr, 0, arr.length - 1);
    }
}
