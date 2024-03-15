package day0315;

import java.util.Scanner;

public class Ex12_Munje {
    public static void main(String[] args) {
        /** 조건연산자 문제
         * 점수(score)를 입력받아
         * 점수가 90 이상이면 "참 잘했어요 !!"
         *        80 이상이면 "수고했어요!"
         *        70 이상이면 "조금 더 노력하세요!"
         */
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        String msg = score < 80 ? "조금 더 노력하세요!" :
                score < 90 ? "수고했어요!" : "참 잘했어요 !!";
        System.out.println(msg);

    }
}
