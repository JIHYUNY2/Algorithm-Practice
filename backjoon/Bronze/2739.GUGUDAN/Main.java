import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력을 받기 위한 Scanner

        int N = sc.nextInt(); // 구구단 단 수 입력 (1 ≤ N ≤ 9)

        for (int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + (N * i));
        }
    }
}