import java.util.Scanner;

public class Print20PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Số lượng số nguyên tố cần in: ");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int count = 0;

        for (count = 0; count < numbers;) {
            for (int N = 2; count < numbers; N++) {
                for (int i = 2; i <= N; i++) {
                    if (N % i == 0) {
                        if (i == N) {
                            System.out.print(N + ", ");
                            count++;
                        }
                        break;
                    }
                }
            }
        }
    }
}
