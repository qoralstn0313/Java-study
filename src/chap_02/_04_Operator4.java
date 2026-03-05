package chap_02;

public class _04_Operator4 {
    static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true;
        boolean 제육볶음 = true;
        boolean 계란말이 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true (or 연산)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true이면 true (and 연산)

        System.out.println((5 > 3) && (3 > 1)); // true
        System.out.println((5 > 3) && (1 > 3)); // false

        System.out.println((5 > 3) || (1 > 3)); // true
        System.out.println((3 > 5) || (1 > 3)); // false

        // System.out.println(1 < 3 < 5); 오류 발생

        // 논리 부정 연산자
        System.out.println(!false); // true
        System.out.println(!true); // false
        System.out.println(!(5 == 5)); // false

    }
}
