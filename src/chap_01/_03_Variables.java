package chap_01;

public class _03_Variables {
    public static void main(String[] args){
        String name;
        name = "배송";
        // String name = "배송"; 같다
        int hour = 15;

        System.out.println(name + "이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        System.out.println("평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("장학금을 받나요? " + pass);

        double d = 3.1412345678;
        float f = 3.1412345678F; // float안에 값을 넣을땐 뒤에 f or F
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // long안에 값을 넣을땐 L
        l = 1_000_000_000_000L;
        System.out.println(l);

    }
}
