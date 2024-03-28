package day0328;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex4_SwingButton extends JFrame{
    JButton btn1,btn2;
    JButton []btnArray=new JButton[6];//각 배열의 값 null
    String []btnLabel= {"초록색","빨강색","분홍색","오렌지색","노랑색","랜덤색"};

    public Ex4_SwingButton(String title) {
        // TODO Auto-generated constructor stub
        super(title);
        this.setLocation(100, 100);//시작위치
        this.setSize(300, 300);//창크기
        this.getContentPane().setBackground(new Color(230, 199, 197));//배경색 변경
        //this.getContentPane().setBackground(Color.yellow);//배경색 변경
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
        this.initDesign();//각종 컴포넌트 생성
        this.setVisible(true);
    }

    public void initDesign()
    {
        this.setLayout(null);//기본 레이아웃 없애기
        //버튼 1 생성
        btn1=new JButton("Hello!!!");
        //프레임에 추가
        btn1.setBounds(10, 10, 100, 30);//x,y,w,h
        this.add(btn1);
        //btn1 에 이벤트 추가-익명 내부 클래스 형태로 이벤트 구현
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(Ex4_SwingButton.this,"버튼 1 을 눌렀어요!!");
            }
        });

        //버튼 2 생성후 프레임에 추가해보세요
        btn2=new JButton("안녕하세요");
        //프레임에 추가
        btn2.setBounds(130, 10, 100, 30);//x,y,w,h
        this.add(btn2);
        btn2.addActionListener(new Button2Event());

        //btnArray 배열 변수를 생성후 프레임에 추가
        int yPos=50;
        for(int i=0;i<btnArray.length;i++)
        {
            btnArray[i]=new JButton(btnLabel[i]);
            btnArray[i].setBounds(10, yPos, 100, 30);
            this.add(btnArray[i]);
            yPos+=35;

            //익명 내부 클래스 형태로 이벤트 구현
            btnArray[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    //Object ob=e.getSource();//이벤트가 발생한 오브젝트
                    JButton ob=(JButton)e.getSource();
                    System.out.println(ob.getText());//초록색
                    //System.out.println(ob.getLabel());//초록색

                    switch(ob.getText())
                    {
                        case "빨강색":
                            //부모컴포넌트의 인스턴스 변수인 this 를 통해서 배경색 변경
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.red);
                            break;
                        case "초록색":
                            //부모컴포넌트의 인스턴스 변수인 this 를 통해서 배경색 변경
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.green);
                            break;
                        case "분홍색":
                            //부모컴포넌트의 인스턴스 변수인 this 를 통해서 배경색 변경
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.magenta);
                            break;
                        case "오렌지색":
                            //부모컴포넌트의 인스턴스 변수인 this 를 통해서 배경색 변경
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.orange);
                            break;
                        case "노랑색":
                            //부모컴포넌트의 인스턴스 변수인 this 를 통해서 배경색 변경
                            Ex4_SwingButton.this.getContentPane().setBackground(Color.yellow);
                            break;
                        case "랜덤색":
                            //0~255 의 임의의 숫자 r,g,b 를 구한후 new Color 생성자를 통해서 변경
                        {
                            int r=(int)(Math.random()*256);
                            int g=(int)(Math.random()*256);
                            int b=(int)(Math.random()*256);
                            Ex4_SwingButton.this.getContentPane().setBackground(new Color(r, g, b));

                        }
                        break;
                    }
                }
            });
        }

    }

    //버튼 2 이벤트
    class Button2Event implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            JOptionPane.showMessageDialog(Ex4_SwingButton.this, "맛있는 점심 먹고 오세용 ^^");
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex4_SwingButton a=new Ex4_SwingButton("스윙버튼");
    }

}