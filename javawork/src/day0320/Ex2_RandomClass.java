package day0320;

import java.util.Random;

public class Ex2_RandomClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random r=new Random();
        System.out.println("** Random 클래스를 이용한 난수 구하기");
        System.out.println("1. 0~9 난수 구하기");
        for(int i=1;i<=5;i++)
        {
            int n=r.nextInt(10);
            System.out.printf("%4d",n);
        }
        System.out.println();
        System.out.println("=".repeat(30));

        System.out.println("2. 1~10 난수 구하기");
        for(int i=1;i<=5;i++)
        {
            int n=r.nextInt(10)+1;
            System.out.printf("%4d",n);
        }
        System.out.println();
        System.out.println("=".repeat(30));

        System.out.println("3. 1~100 난수 구하기");
        for(int i=1;i<=5;i++)
        {
            int n=r.nextInt(100)+1;
            System.out.printf("%4d",n);
        }
        System.out.println();
        System.out.println("=".repeat(30));

        System.out.println("4. 65~90(대문자) 난수 구하기");
        for(int i=1;i<=5;i++)
        {
            int n=r.nextInt(26)+65;
            System.out.printf("%4c",(char)n);
        }
        System.out.println();
        System.out.println("=".repeat(30));

        System.out.println("5. 97~122(소문자) 난수 구하기");
        for(int i=1;i<=5;i++)
        {
            int n=r.nextInt(26)+97;
            System.out.printf("%4c",(char)n);
        }
        System.out.println();
        System.out.println("=".repeat(30));
    }

}