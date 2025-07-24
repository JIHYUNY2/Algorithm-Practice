import java.util.Scanner;

public class Main {
    // 최대공약수(GCD) 계산 (유클리드 알고리즘)
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    // 최소공배수(LCM) = (a * b) / GCD(a, b)
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(lcm(A, B));
        }
    }
}
