package day0321;

import java.util.Scanner;

public class Ex9_Array2ChaBinggo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [][]arr=new int[3][3];
        int binggo;
        Scanner sc=new Scanner(System.in);

        /*
         * 1~3 사이의 난수를 발생후 가로,세로,대각선 방향으로
         * 같은 숫자가 나올경우 binggo 변수를 1증가하여 빙고갯수를 구하고
         * 같은 숫자가 없을경우 꽝!!! 이라고 출력하시오
         */
        while(true)
        {
            binggo=0;

            //2차원 배열에 1~3 의 값을 임의로 발생
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    arr[i][j]=(int)(Math.random()*3)+1;
                }
            }

            //출력
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.printf("%4d",arr[i][j]);
                }
                System.out.println("\n");
            }
            //빙고갯수나 꽝 출력
            for(int i=0;i<3;i++)
            {
                //행방향
                if(arr[i][0]==arr[i][1] && arr[i][1]==arr[i][2])
                    binggo++;
                //열방향
                if(arr[0][i]==arr[1][i] && arr[1][i]==arr[2][i])
                    binggo++;
            }

            //  \ 대각선 방향
            if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
                binggo++;

            //   / 대각선 방향
            if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0])
                binggo++;

            //빙고 출력
            if(binggo==0)
                System.out.println("\t꽝!!!!");
            else
                System.out.println("\t빙고 "+binggo+"개");

            System.out.println("=".repeat(12));
            String ans=sc.nextLine();
            if(ans.equalsIgnoreCase("x"))
            {
                System.out.println("** 빙고게임을 종료합니다 **");
                break;
            }
        }
    }

}