public class QuickSort {

    public int partition(int arr[], int lw, int hg) {
        int pivot = arr[hg];
        int i = (lw - 1);
        for (int j = lw; j < hg; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[hg];
        arr[hg] = temp;
        return i + 1;
    }

    public void sort(int arr[], int lw, int hg) {
        if (lw < hg) {
            int pi = partition(arr, lw, hg);
            sort(arr, lw, pi - 1);
            sort(arr, pi + 1, hg);
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

}
