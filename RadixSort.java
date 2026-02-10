import java.util.Arrays;
public class RadixSort {
    public void sort(Integer[] arr) {
        if (arr.length == 0) return;
        int m = getMax(arr, arr.length);
        
        
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, arr.length, exp);
    }

    private static int getMax(Integer[] arr, int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    private static void countSort(Integer[] arr, int n, int exp) {
        Integer[] output = new Integer[n]; 
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}

