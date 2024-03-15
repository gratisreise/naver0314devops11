package day0315;

import java.util.Scanner;

public class Ex09_Munje {
    public static void main(String[] args) {
        /**
         * 백만단위의 금액을 입력받은 후
         * 만원, 천원, 백원, 십원, 일원 단위로 몇개인지 출력하시오
         *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int man = n / 10000;
        int chun = n / 1000 % 10;
        int back = n / 100 % 10;
        int ship = n / 10 % 10;
        int ill = n % 10;

        System.out.println("만원 : " + man + "장");
        System.out.println("천원 : " + chun + "장");
        System.out.println("백원 : " + back + "장");
        System.out.println("십원 : " + ship + "장");
        System.out.println("일원 : " + ill + "장");


    }


}
