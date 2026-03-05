package chap_02;
/*
    어린이 키에 따른 놀이 기구 탑승 가능 여를 확인하는 프로그램을 작성하시오.
    조건 : 키가 120cm 이상인 경우에만 탑승가능
          삼항 연산자 이용

    실행결과 : 키가 115cm이므로 탑승 불가능합니다 // 값이 115 인경우
             키가 121cm이므로 탑승 가능합니다 // 값이 121 인 경우
 */

public class _Quiz_02 {
    static void main(String[] args) {

        int hight1 = 115;
        int hight2 = 121;

        /*
        String case1 = (120 >= hight1) ? "키가 " + hight1 + "cm이므로 탑승 불가능합니다" : "키가 " + hight1 + "cm이므로 탑승 가능합니다";
        String case2 = (120 >= hight2) ? "키가 " + hight2 + "cm이므로 탑승 불가능합니다" : "키가 " + hight2 + "cm이므로 탑승 가능합니다";
        System.out.println(case1);
        System.out.println(case2);
        처음에 적은 코드
        */

        String case1 = (hight1 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        String case2 = (hight2 >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";

        System.out.println("키가 " + hight1 + "cm이므로 " + case1);
        System.out.println("키가 " + hight2 + "cm이므로 " + case2);



    }
}
