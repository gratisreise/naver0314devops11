package day0315;

public class Ex10_Operator {
    public static void main(String[] args) {
        //증감연산자
        //전치일겨우는 1순위, 후치일경우는 끝순위

        int m = 5, n = 5;

        System.out.println("m = " + m);
        System.out.println("n = " + n);
        int ret = m < n ? 1 : -1;
        System.out.println(ret);
    }
}
