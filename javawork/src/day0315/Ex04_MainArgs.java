package day0315;

public class Ex04_MainArgs {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(args[0]);//Hello
        System.out.println(args[1]);//Apple

        System.out.println(args[2]+args[3]);//"10"+"20"="1020"
        //문자열->숫자로 변환후 계산한다
        //Wrapper Class 중 Integer 를 이용해서 변환한다
        int s1=Integer.parseInt(args[2]);//"10" 이 숫자 10으로 변환
        int s2=Integer.parseInt(args[3]);//"20" 이 숫자 20으로 변환0327
        System.out.println(s1+s2);

    }
}
