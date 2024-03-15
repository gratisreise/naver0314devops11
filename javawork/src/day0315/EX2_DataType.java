package day0315;

public class EX2_DataType {
    public static void main(String[] args) {
        //정수타입
        byte a = 127;
        System.out.println(a);
        byte b = (byte)200; //(byte) : cast연산자 : 강제로 형변환, 값손실 발생
        System.out.println(b); // 값손실이 발생할 경우 엉뚱한 값이 출력(내부적으로는 2의 보수값이다)


        //실수 타입
        float f1 = 123.567891234f; // f를 붙여야 4바이트 float로 저장된다.
        double f2 = 123.567891234;

        System.out.println(f1);
        System.out.println(f2);
    }
}
