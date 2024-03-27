package day0327;
/*
 * 1.이름추가  2.이름삭제  3.이름출력  4.이름검색  5.종료
 */

import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class Ex07_Vector {
    Scanner sc=new Scanner(System.in);
    List<String> list = new Vector<>();

    //메뉴 선택시 번호 반환
    public int getMenu()
    {
        int menu = 0;
        System.out.println("-".repeat(50));
        System.out.println("1.이름추가  2.이름삭제  3.이름출력  4.이름검색  5.종료");
        System.out.println("-".repeat(50));
        menu = Integer.parseInt(sc.nextLine());
        return menu;
    }

    public void addPerson()
    {
        System.out.println("추가할 이름 입력");
        String name=sc.nextLine();
        list.add(name);
        System.out.println(list.size()+"번째 멤버를 추가했어요!");
    }

    public void deletePerson()
    {
        System.out.println("삭제할 이름을 입력해주세요");
        String name = sc.nextLine();
        boolean f = list.remove(name);
        if(!f)//f==false
            System.out.println(name+" 님은 명단에 없습니다");
        else
            System.out.println(name+"님을 명단에서 삭제했습니다");
    }

    public void listPerson()
    {
        System.out.println("** 멤버 현황 **");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(i+1+":"+list.get(i));
        }
    }

    public void searchPerson()
    {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex07_Vector ex=new Ex07_Vector();
        while(true)
        {
            int menu=ex.getMenu();
            if(menu==5)
            {
                System.out.println("** 종료합니다 **");
                break;
            }

            switch(menu)
            {
                case 1:
                    ex.addPerson();
                    break;
                case 2:
                    ex.deletePerson();
                    break;
                case 3:
                    ex.listPerson();
                    break;
                case 4:
                    ex.searchPerson();
                    break;
                default:
                    System.out.println("**번호 입력이 잘못되었어요 **");
            }
            System.out.println();
        }
    }

}