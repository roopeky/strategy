import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = generateRandomArray(n);
        Context context = new Context();

        // Kommentit voi ottaa pois jos haluaa tarkastella arrayn lukuja

        //System.out.println("Unsorted array:");
        //System.out.println(Arrays.toString(arr));

        // Quick Sort
        context.setStrategy(new QuickSortStrategy());
        context.sort(Arrays.copyOf(arr, arr.length));
        //System.out.println("Quick Sorted array:");
        //System.out.println(Arrays.toString(arr));

        // Merge Sort
        context.setStrategy(new MergeSortStrategy());
        context.sort(Arrays.copyOf(arr, arr.length));
        //System.out.println("Merge Sorted array:");
        //System.out.println(Arrays.toString(arr));

        // Insertion Sort
        context.setStrategy(new InsertionSortStrategy());
        context.sort(Arrays.copyOf(arr, arr.length));
        //System.out.println("Insertion Sorted array:");
        //System.out.println(Arrays.toString(arr));

    }

    private static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n * 10);
        }
        return arr;
    }
}