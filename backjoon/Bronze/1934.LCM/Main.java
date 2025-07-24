import java.util.Scanner;  // 표준 입력을 받기 위해 Scanner 클래스 임포트

public class Main {  // 백준 제출용 클래스명은 반드시 Main
    /**
     * 최대공약수(GCD)를 구하는 함수
     * 유클리드 호제법 사용: GCD(a, b) = GCD(b, a % b)
     */
    public static int gcd(int a, int b) {
        while (b != 0) {          // b가 0이 될 때까지 반복
            int tmp = a % b;      // a를 b로 나눈 나머지를 구함
            a = b;                // a에 b를 대입
            b = tmp;              // b에 나머지를 대입
        }
        return a;  // b가 0이 되면 a가 최대공약수
    }

    /**
     * 최소공배수(LCM)를 구하는 함수
     * LCM(a, b) = (a * b) / GCD(a, b)
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner로 입력 받기

        int T = sc.nextInt();  // 테스트 케이스 개수 입력 받기

        // 각 테스트 케이스마다 A와 B를 입력받아 LCM을 계산
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();  // 첫 번째 자연수 A
            int B = sc.nextInt();  // 두 번째 자연수 B
            System.out.println(lcm(A, B));  // 최소공배수 출력
        }
    }
}
