package day0327;

public class StudentDto {
    private String name;
    private int age;
    private int java;
    private int spring;
    private int html;

    public StudentDto() {
    }

    public StudentDto(String name, int age, int java, int spring, int html) {
        this.name = name;
        this.age = age;
        this.java = java;
        this.spring = spring;
        this.html = html;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJava() {
        return java;
    }

    public void setJava(int java) {
        this.java = java;
    }

    public int getSpring() {
        return spring;
    }

    public void setSpring(int spring) {
        this.spring = spring;
    }

    public int getHtml() {
        return html;
    }

    public void setHtml(int html) {
        this.html = html;
    }
    public int getTotal(){
        int sum = 0;
        sum = java + spring + html;
        return sum;
    }
    public double getAvg(){
        return getTotal() / 3.0;
    }
    public String getGrade(){
        int avg = (int)getAvg();
        String grade = "";
        if(avg >= 90){
            grade = "*****";
        } else if(avg >= 80){
            grade = "****";
        } else if(avg >= 70){
            grade = "***";
        } else if(avg >= 60){
            grade = "*";
        }
        return grade;
    }
}
