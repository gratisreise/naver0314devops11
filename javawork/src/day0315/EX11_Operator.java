package day0315;

import java.util.Scanner;

public class EX11_Operator {
    public static void main(String[] args) {
        //조건(삼항) 연산자
        // 조건식 ? 참 : 거짓
        //두수를 입력후 더 큰 숫자를 출력하시오
        Scanner sc = new Scanner(System.in);
        int su1, su2, max;
        System.out.println("두개의 숫자 입력");
        su1 = sc.nextInt();
        su2 = sc.nextInt();
        max = su1 > su2 ? su1 : su2;
        System.out.println(max);
    }
}
