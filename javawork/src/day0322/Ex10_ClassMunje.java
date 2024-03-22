package day0322;

class Member
{
    Member(){

    }
    Member(String name){
        this.name = name;
    }
    Member(String name, String hp){
        this.name= name;
        this.hp = hp;
    }
    Member(String name, String hp, String addr){
        this.name = name;
        this.hp = hp;
        this.addr = addr;
    }

    private String name;
    private String hp;
    private String addr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    //생성자

    //setter

    //getter

}
public class Ex10_ClassMunje {

    public static void writeMember(Member m)
    {
        System.out.println(
                "이름: " + m.getName() + "  " + "전화번호: " + m.getHp() + "  " + "주소: " + m.getAddr()
        );
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Member m1=new Member();
        Member m2=new Member("이강인");
        Member m3=new Member("손흥민","010-2222-3333");
        Member m4=new Member("Candy","010-444-5555","제주도");

        System.out.println("** 멤버 명단 출력 **");
        writeMember(m1);
        writeMember(m2);
        writeMember(m3);
        writeMember(m4);
    }
}