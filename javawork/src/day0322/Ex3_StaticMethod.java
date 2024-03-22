package day0322;
class MyShop
{
    private String sangpum;
    private int su,dan;
    private static String message;//공유되는 값

    public static final String SHOP="24시간이마트";

    //setter method
    public void setSangpum(String sangpum)
    {
        this.sangpum=sangpum;
    }

    public void setSu(int su)
    {
        this.su=su;
    }

    public void setDan(int dan)
    {
        this.dan=dan;
    }

    static public void setMessage(String message)
    {
        //static 멤버변수는 같은 구역에 같은 이름의 변수가 있을경우 앞에 클래스명을 생략하지 말고 써준다
        MyShop.message=message;
    }

    //상품명,수량,단가를 한번에 변경하고 싶을경우
    public void setData(String sangpum,int su,int dan)
    {
        //메서드안에서 같은 멤버 메서드는 this 로 호출이 가능
        this.setSangpum(sangpum);
        this.setSu(su);
        this.setDan(dan);
    }
    //overloading method(중복함수):메서드명은 같으나 인자가 달라야한다
    public void setData(String sangpum,int su,int dan,String message)
    {
        //메서드안에서 같은 멤버 메서드는 this 로 호출이 가능
        this.setSangpum(sangpum);
        this.setSu(su);
        this.setDan(dan);
        //인스턴스메서드에서 static 메서드 호출이 가능할까요?ok
        //반대로 staic 메서드에서 인스턴스 멤버메서드를 호출할수 있을까요? no ,안됨
        //static 메서드에서 같은 static 메서드는 호출이 가능할까요? ok, 가능함
        setMessage(message);//앞에 클래스명은 같은 클래스라 생략함
    }

    //출력은 getter 가 아닌 일반 멤버 메서드로 만들어보자
    public void writeData()
    {
        System.out.println("상품명 : "+sangpum);
        System.out.println("수량:"+su+", 단가:"+dan);
        System.out.println("총금액 : "+su*dan);
        System.out.println("오늘의 메세지 : "+message);
        System.out.println("=".repeat(20));
    }

}

public class Ex3_StaticMethod {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyShop sang1=new MyShop();
        MyShop sang2=new MyShop();
        MyShop sang3=new MyShop();

        System.out.println("** 상품 1 **");
        sang1.setSangpum("딸기");
        sang1.setSu(3);
        sang1.setDan(2300);
        MyShop.setMessage("오늘 각종 과일 세일합니다!!");//static 메서드는 클래스명으로 호출

        sang1.writeData();

        System.out.println("** 상품 2 **");
        sang2.setData("수박", 2, 30000);
        sang2.writeData();

        System.out.println("** 상품 3 **");
        sang3.setData("참외", 5, 2000, "오늘 세일 마감!!");
        sang3.writeData();

        System.out.println("** 상품 1 다시 출력 **");
        sang1.writeData();

        System.out.println("** 상품 2의 수량만 변경 **");
        sang2.setSu(5);
        sang2.writeData();



    }

}