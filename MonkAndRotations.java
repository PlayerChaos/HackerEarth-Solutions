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
            if (K>N){
                K = K%N;
            }
            int[] arr = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            int[] aux = new int[K];
            System.arraycopy(arr, N - K, aux, 0, K);
            System.arraycopy(arr, 0, arr, K, N - K - 1 + 1);
            System.arraycopy(aux, 0, arr, 0, K);
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
