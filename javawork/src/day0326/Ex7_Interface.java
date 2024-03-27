package day0326;

interface StudyInter
{
    public void javaStudy();
    public void springStudy();
}

interface PlayInter
{
    public void run();
    public void game();
}

class MyStudy implements StudyInter
{

    @Override
    public void javaStudy() {
        // TODO Auto-generated method stub
        System.out.println("자바 스터디");
    }

    @Override
    public void springStudy() {
        // TODO Auto-generated method stub
        System.out.println("스프링스터디");
    }

}

class MyPlay implements PlayInter
{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("달리기");
    }

    @Override
    public void game() {
        // TODO Auto-generated method stub
        System.out.println("게임");
    }

}

public class Ex7_Interface {

    static public void study(StudyInter s)
    {
        s.javaStudy();
        s.springStudy();
    }

    static public void play(PlayInter p)
    {
        p.run();
        p.game();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //위의 두 static 메서드를 호출해보세요
        study(new MyStudy());
        play(new MyPlay());
    }

}