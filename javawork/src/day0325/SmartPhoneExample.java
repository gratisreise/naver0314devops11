package day0325;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // 부모로부터 상속받아 선언한 필드


        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
        myPhone.sendVoice("아~~ 네, 반갑습니다.");
        myPhone.hangUp();

        myPhone.setWifi(true);
        System.out.println("와이파이 상태: " + myPhone.wifi);
        myPhone.internet();
    }
}
