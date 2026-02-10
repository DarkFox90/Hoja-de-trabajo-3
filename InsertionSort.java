public class InsertionSort {
    public <T extends Comparable<T>> void sort(T[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0) 
                index++;
            if (arr[index].compareTo(arr[index - 1]) >= 0) {
                index++;
            } else {
                T temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }   
}
