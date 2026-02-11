import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class SortTest {

    private Integer[] desordenado() {
        return new Integer[]{5, 3, 8, 1, 9, 2};
    }

    private Integer[] ordenado() {
        return new Integer[]{1, 2, 3, 5, 8, 9};
    }

    private void assertOrdenado(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    void quickSort_desordenado() {
        Integer[] arr = desordenado();
        QuickSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void quickSort_ordenado() {
        Integer[] arr = ordenado();
        QuickSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void mergeSort_desordenado() {
        Integer[] arr = desordenado();
        MergeSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void mergeSort_ordenado() {
        Integer[] arr = ordenado();
        MergeSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void gnomeSort_desordenado() {
        Integer[] arr = desordenado();
        GnomeSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void gnomeSort_ordenado() {
        Integer[] arr = ordenado();
        GnomeSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void insertionSort_desordenado() {
        Integer[] arr = desordenado();
        InsertionSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void insertionSort_ordenado() {
        Integer[] arr = ordenado();
        InsertionSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void radixSort_desordenado() {
        Integer[] arr = desordenado();
        RadixSort.sort(arr);
        assertOrdenado(arr);
    }

    @Test
    void radixSort_ordenado() {
        Integer[] arr = ordenado();
        RadixSort.sort(arr);
        assertOrdenado(arr);
    }
    
}
