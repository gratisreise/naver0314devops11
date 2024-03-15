package day0315;

import java.util.Scanner;

public class Ex8_Munje {
    public static void main(String[] args) {
        /**
         * 이름(name), 핸드폰(hp), 태어난 년도(birthYear) 입력 받은 후
         * 이름, 핸드폰, 태어난 년도, 나이(2024-태어난녀도)를 출력하는 프로그램을 작성하시오
         *
         */
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String hp = sc.nextLine();
        int birthYear = sc.nextInt();
        int age = 2024 - birthYear;
        System.out.println("이름: " + name + "\n" +
                "핸드폰 번호: "+ hp + "\n" +
                "태어난 년도: " + birthYear + "\n" +
                        "나이: " + age);
    }
}
