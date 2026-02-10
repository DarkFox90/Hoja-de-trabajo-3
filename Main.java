import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Thread.sleep(5000);

        Integer[] original = FileAssistant.ReadNumbers("Numeros.txt");

        Integer[] arr1 = Arrays.copyOf(original, original.length);
        QuickSort.sort(arr1);

        Integer[] arr2 = Arrays.copyOf(original, original.length);
        MergeSort.sort(arr2);

        Integer[] arr3 = Arrays.copyOf(original, original.length);
        GnomeSort.sort(arr3);

        Integer[] arr4 = Arrays.copyOf(original, original.length);
        InsertionSort.sort(arr4);

        Integer[] arr5 = Arrays.copyOf(original, original.length);
        RadixSort.sort(arr5);
    }
}
