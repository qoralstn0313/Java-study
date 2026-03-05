package chap_02;

public class _01_Operator1 {
    static void main(String[] args) {
        // 산술 연산자

        // 일바 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(4 % 3); // 1
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(4 % 4); // 0

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println((3 + 7) / 5 * 2); // 4
        System.out.println((3 + 7) / (5 * 2)); // 1

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = b / a;
        System.out.println(c); // 0

        c = a % b;
        System.out.println(c); // 0

        // a, b 값 바꾸기
        c = a;
        a = b;
        b = c;
        System.out.println(a + b);
        System.out.println(a + " " + b);
        System.out.println(a + "" + b);


        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        val++; // 전치연산
        ++val; // 후치연산

        int num = 10;

        System.out.println(++num); // 11
        System.out.println(num++); // 11
        System.out.println(num); // 12

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        System.out.println("대기 인원 : " + waiting); // 총 대기 인원 : 3

    }
}
