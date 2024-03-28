package day0328;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex6_SwingCanvasRadio extends JFrame{

    final static String PHOTO1="D:\\naver0314\\workall\\image\\연예인사진\\19.jpg";//수지
    final static String PHOTO2="D:\\naver0314\\workall\\image\\연예인사진\\18.jpg";//신세경
    final static String PHOTO3="D:\\naver0314\\workall\\image\\연예인사진\\15.jpg";//설현
    final static String PHOTO4="D:\\naver0314\\workall\\image\\연예인사진\\2.jpg";//김우빈

    Color boxColor=new Color(67,196,207);//초기 박스 색상
    JRadioButton rbBox1,rbBox2,rbBox3,rbBox4;
    JRadioButton []rbPhoto=new JRadioButton[4];

    int photoIndex=3;//처음에 수지사진

    MyDraw draw=new MyDraw();

    public Ex6_SwingCanvasRadio(String title) {
        // TODO Auto-generated constructor stub
        super(title);
        this.setLocation(100, 100);//시작위치
        this.setSize(400, 500);//창크기
        //this.getContentPane().setBackground(new Color(93, 199, 187));//배경색 변경
        //this.getContentPane().setBackground(Color.yellow);//배경색 변경
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
        this.initDesign();//각종 컴포넌트 생성
        this.setVisible(true);
    }

    //캔바스 내부 클래스
    class MyDraw extends Canvas
    {
        @Override
        public void paint(Graphics g) {
            // TODO Auto-generated method stub
            super.paint(g);

            //채워진 박스 그리기
            g.setColor(boxColor);
            g.fillRect(30, 30, 320, 340);

            Image image=null;
            switch(photoIndex)
            {
                case 1:
                    image=new ImageIcon(PHOTO1).getImage();
                    break;
                case 2:
                    image=new ImageIcon(PHOTO2).getImage();
                    break;
                case 3:
                    image=new ImageIcon(PHOTO3).getImage();
                    break;
                case 4:
                    image=new ImageIcon(PHOTO4).getImage();
                    break;
            }
            g.drawImage(image, 80, 60, 220, 280, this);

        }
    }

    public void initDesign()
    {
        this.add("Center",draw);
        //상단에 색상 라디오 버튼 추가
        JPanel pTop=new JPanel();
        ButtonGroup bg1=new ButtonGroup();
        rbBox1=new JRadioButton("초록색");
        bg1.add(rbBox1);
        pTop.add(rbBox1);

        rbBox2=new JRadioButton("하늘색",true);
        bg1.add(rbBox2);
        pTop.add(rbBox2);

        rbBox3=new JRadioButton("분홍색");
        bg1.add(rbBox3);
        pTop.add(rbBox3);

        rbBox4=new JRadioButton("오렌지색",true);
        bg1.add(rbBox4);
        pTop.add(rbBox4);

        //rbBox1 에 대한 이벤트
        rbBox1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                boxColor=Color.green;
                //캔바스의 paint 메서드 강제호출
                draw.repaint();
            }
        });

        //rbBox2 에 대한 이벤트
        rbBox2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                boxColor=new Color(67,196,207);
                //캔바스의 paint 메서드 강제호출
                draw.repaint();
            }
        });

        //rbBox3 에 대한 이벤트
        rbBox3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                boxColor=new Color(235,171,223);
                //캔바스의 paint 메서드 강제호출
                draw.repaint();
            }
        });

        //rbBox4 에 대한 이벤트
        rbBox4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                boxColor=new Color(191,136,5);
                //캔바스의 paint 메서드 강제호출
                draw.repaint();
            }
        });

        //프레임 상단에 Panel 추가
        this.add("North",pTop);

        //프레임의 하단에는 사진선택하는 라디오 버튼 추가
        JPanel pBottom=new JPanel();
        ButtonGroup bg2=new ButtonGroup();

        String []s= {"수지","신세경","설현","김우빈"};


        for(int i=0;i<rbPhoto.length;i++)
        {
            final int n=i+1;

            rbPhoto[i]=new JRadioButton(s[i], i==(photoIndex-1)?true:false);
            //그룹변수에 추가
            bg2.add(rbPhoto[i]);
            //페널에도 추가
            pBottom.add(rbPhoto[i]);

            //이벤트
            rbPhoto[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    //photoIndex=i+1;
                    photoIndex=n;
                    draw.repaint();//캔바스 내부클래스의 paint 메소드 강제 호출
                }
            });
        }

        this.add("South",pBottom);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex6_SwingCanvasRadio a=new Ex6_SwingCanvasRadio("캔바스2");
    }

}