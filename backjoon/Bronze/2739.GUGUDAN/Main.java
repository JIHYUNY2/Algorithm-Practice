import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 구구단 단 수 입력 받기 (1 ~ 9)

        // 1부터 9까지 곱셈 결과 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));  // 출력 형식에 맞게 출력
        }
    }
}
