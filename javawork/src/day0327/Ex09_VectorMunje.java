package day0327;


import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *  1.학생정보추가 : 이름, 나이, 3과목 점수입력
 *  2.학생정보삭제
 *  3. 전체출력
 *  4. 평균값을 입력하면 그 평균값이상의 학생들을 출력
 *  5. 이름으로검색 : 입력한 이름을 포함하고 있으면 출력(contains);
 *  6. 저장 후 종료
 */
public class Ex09_VectorMunje {
    static final String FILENAME = "/Desktop/naver0314.txt";
    List<StudentDto> list = new Vector<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ex09_VectorMunje ex = new Ex09_VectorMunje();
            while(true){
                int menu = ex.getMenu();
                switch (menu){
                    case 1:
                        ex.addStudent();
                        break;
                    case 2:
                        ex.delteStudent();
                        break;
                    case 3:
                        ex.outPutData();
                        break;
                    case 4:
                        ex.upAvgStudent();
                        break;
                    case 5:
                        ex.searchName();
                        break;
                    case 6:
                        ex.memberFileSave();
                        System.out.println("** 멤버 정보를 저장후 종료합니다 **");
                        System.exit(0);//종료
                        break;
                    default:
                        System.out.println("잘못된 번호 입니다");
                }
                System.out.println();
            }
    }

    private void memberFileSave() {
    }

    //menu출력
    public int getMenu(){
        int menu = 0;
        System.out.println("1. 학생정보 추가");
        System.out.println("2. 학생삭제");
        System.out.println("3. 전체학생출력");
        System.out.println("4. 평균값 이상 출력");
        System.out.println("5. 핸드폰으로 검색");
        System.out.println("6. 저장후종료");
        System.out.println("================");
        try {
            menu = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {//문자 입력시 발생하는 Exception
            System.out.println("번호를 숫자로 입력해주세요");
        }

        return menu;
    }
    //학생정보추가
    public void addStudent(){
        System.out.println("이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("핸드폰을 입력하세요");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("주소를 입력하세요");
        int java = Integer.parseInt(sc.nextLine());
        System.out.println("혈액형을 입력하세요");
        int spring = Integer.parseInt(sc.nextLine());
        System.out.println("혈액형을 입력하세요");
        int html = Integer.parseInt(sc.nextLine());

        StudentDto dto = new StudentDto(name, age, java, spring, html);
        //list 에 추가
        list.add(dto);
        System.out.println(list.size() + "번째 학생 정보를 추가하였습니다 !!");
    }
    //학생정보삭제
    public void delteStudent(){
        System.out.println("학생 이름을 입력해주세요");
        String name = sc.nextLine();
        boolean f = false;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getName().equals(name)){
                f = true;
                list.remove(i);
                break;
            }
        }
        if(!f){
            System.out.printf("명단에 없습니다");
        } else {
            System.out.println(name + "의 정보를 삭제하였습니다.");
        }
    }

    //전체출력
    public void outPutData(){
        if(list.size() == 0){

        } else {
            for(int i = 0; i < list.size(); i++){
                StudentDto dto = list.get(i);
                System.out.println(i + 1 + "\t" + dto.getName() + "\t" + dto.getAge() + "\t" +
                        dto.getHtml() + "\t" + dto.getJava() + "\t" + dto.getAvg()+ "\t" + dto.getTotal());
            }
        }


    }

    //해당 평균값 이상의 학생들을 출력
    public void upAvgStudent(){

    }

    //이름으로 검색
    public void searchName(){

    }

}
