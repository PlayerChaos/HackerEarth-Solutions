
//////////////////////////////COMPLETED //////////////////////////////////



import java.util.Scanner;

public class MonkAndInversions {
    public static void main (String[] args) {
        int[] tempArray;
        try{
            Scanner scanner =  new Scanner(System.in);
            int T = scanner.nextInt();
             tempArray = new int[T];
            for (int m = 0; m < T; m++) {
                int N = scanner.nextInt();
                int[][] arr = new int[N][N];
                for (int i = 0; i < N; i++){
                    for (int j = 0; j < N; j++){
                        arr[i][j] = scanner.nextInt();
                    }
                }
                int inversions = 0;
                for (int i = 0; i < N; i++){
                    for (int l = 0; l < N; l++){
                        for (int j = 0; j <= i; j++){
                            for (int k = 0; k <= l; k++){
                                if (arr[i][l] < arr[j][k]){
                                    inversions++;
                                }
                            }
                        }
                    }
                }
                tempArray[m] = inversions;
            }
            for (int i = 0; i < T; i++) {
                System.out.println(tempArray[i]);
            }
        }catch(Exception e){
            System.exit(1);
        }

    }
}


