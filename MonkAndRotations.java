import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MonkAndRotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            for (int j = 0; j < K; j++) {
                int l, temp;
                temp = arr[arr.length - 1];
                for (l = arr.length - 1; l > 0; l--)
                    arr[l] = arr[l - 1];
                arr[l] = temp;
            }
            list.add(arr);
        }
        for (int[] ints : list) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}