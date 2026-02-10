public class Main {
    public static void main(String[] args) throws Exception {
        int[] cantidades = {100, 500, 1000, 1500, 2000, 2500, 3000};

        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort(); 
        GnomeSort gnomeSort = new GnomeSort();
        InsertionSort insertionSort = new InsertionSort();
        RadixSort radixSort = new RadixSort();

        for (int cantidad : cantidades) {
            System.out.println("Cantidad de números: " + cantidad);
            Integer[] arr = FileAssistant.ReadNumbers("Numeros.txt");
            
            long start = System.nanoTime();
            quickSort.sort(arr, 0, arr.length - 1);
            long end = System.nanoTime();
            System.out.println("QuickSort: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            mergeSort.sort(arr, 0, arr.length - 1);
            end = System.nanoTime();
            System.out.println("MergeSort: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            gnomeSort.sort(arr);
            end = System.nanoTime();
            System.out.println("GnomeSort: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            insertionSort.sort(arr);
            end = System.nanoTime();
            System.out.println("InsertionSort: " + (end - start) + " nanoseconds");

            start = System.nanoTime();
            radixSort.sort(arr);
            end = System.nanoTime();
            System.out.println("RadixSort: " + (end - start) + " nanoseconds");
        }
    }
}
