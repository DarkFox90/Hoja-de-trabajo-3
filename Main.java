import java.util.Arrays;

public class Main {

    private static final int Iteraciones = 5000; 
    private static final int[] tamanio = {3000};

    public static void main(String[] args) throws Exception {

        System.out.println("presionar enter para comenzar los sorts");
        System.in.read();

        for (int tamano : tamanio) {
            Integer[] original = FileAssistant.ReadNumbers("Numeros.txt");
            QuickSort(original);
            MergeSort(original);
            GnomeSort(original);
            InsertionSort(original);
            RadixSort(original);
        }
    }

    private static void QuickSort(Integer[] original) {
        for (int i = 0; i < Iteraciones; i++) {
            Integer[] copia = Arrays.copyOf(original, original.length);
            QuickSort.sort(copia);
        }
    }

    private static void MergeSort(Integer[] original) {
        for (int i = 0; i < Iteraciones; i++) {
            Integer[] copia = Arrays.copyOf(original, original.length);
            MergeSort.sort(copia);
        }
    }

    private static void GnomeSort(Integer[] original) {
        for (int i = 0; i < Iteraciones; i++) {
            Integer[] copia = Arrays.copyOf(original, original.length);
            GnomeSort.sort(copia);
        }
    }

    private static void InsertionSort(Integer[] original) {
        for (int i = 0; i < Iteraciones; i++) {
            Integer[] copia = Arrays.copyOf(original, original.length);
            InsertionSort.sort(copia);
        }
    }

    private static void RadixSort(Integer[] original) {
        for (int i = 0; i < Iteraciones; i++) {
            Integer[] copia = Arrays.copyOf(original, original.length);
            RadixSort.sort(copia);
        }
    }
}
