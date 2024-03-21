package day0321;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Book199_9 {

    public static void main(String[] args) {
        //교재 199페이지 문제 9번 풀기
        Scanner sc = new Scanner(System.in);

        int studentNum = 0;
        int[] scores = new int[studentNum];

        while(true){
            System.out.println("----------------------------------------------");
            System.out.println("1.학생수  | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택>");
            int n = sc.nextInt();



            if(n == 1){
                System.out.print("학생수> ");
                studentNum = sc.nextInt();
                scores = new int[studentNum];
            } else if (n == 2) {
                for(int i = 0; i < studentNum; i++){
                    System.out.print("scores[" + i + "]>");
                    scores[i] = sc.nextInt();
                }
            } else if(n == 3){
                for(int i = 0; i < studentNum; i++){
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if(n == 4){
                int scoreMx = 0;
                int sumScore = 0;
                for(int i = 0; i < studentNum; i++){
                    if(scores[i] > scoreMx) scoreMx = scores[i];
                    sumScore += scores[i];
                }
                double avgScore = (double)sumScore / (double)studentNum;
                System.out.println("최고 점수: " + scoreMx);
                System.out.printf("평균 점수: %.1f%n", avgScore);
            } else if(n == 5){
                break;
            }
        }
    }
}
