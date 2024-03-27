package day0326;

//abstract(추상화) 메서드는 오버라이드만을 목적으로 body({}) 없이 구현하고자 할경우
//앞에 abstract 를 붙여서 추상 메서드로 만든다
//abstract 메서드를 한개이상 포함하고 있는 클래스는 클래스 역시 추상화시켜야한다
//추상화시키는 방법은 class 앞에 abstract 를 붙이면 된다
//단, 추상클래스는 그 자체로는 생성할수 없다
//추상클래스를 상속받는 서브 클래스는 반드시 추상 메서드를 오버라이드해야만 하는데
//만약 오버라이드하지 않았을경우 서브클래스 역시 추상화시킨다
abstract class Animal
{
//	public void sound()
//	{
//		System.out.println("딱히 하는일이 없음");
//	}

    abstract public void sound();
    //추상 클래스에는 추상 메서드뿐 아니라 일반 메서드도 포함할수 있다
    public void showTitle()
    {
        System.out.println("추상 클래스 공부중!!");
    }
}

class Dog extends Animal
{
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        //super.sound();
        System.out.println("멍멍!!!");
    }
}

class Chick extends Animal
{
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        //super.sound();
        System.out.println("삐약삐약!!!");
    }
}
////////////////////////////////
class Cat extends Animal
{
    @Override
    public void sound() {
        // TODO Auto-generated method stub
        //super.sound();
        System.out.println("야옹야옹!!!");
    }
}
public class Ex1_Abstract {

    public static void hello(Animal ani)
    {
        ani.showTitle();
        ani.sound();
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        hello(new Cat());
        hello(new Dog());
        hello(new Chick());
        //hello(new Animal());//추상클래스는 new 로 생성 불가
    }

}