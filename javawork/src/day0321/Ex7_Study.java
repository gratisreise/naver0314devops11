package day0321;

import java.sql.SQLOutput;
import java.util.Random;

public class Ex7_Study {
    public static void main(String[] args) {
        String []members= {
                "강하윤","공병현","김도훈","김우형","김정호",
                "김창인","민경진","박민지","박보민","박주용",
                "박한경","배동우","서정현","손가원","시바타유니",
                "신완철","우태형","유상곤","이가현","이병현",
                "이장우","이현성","정민석","정상혁","정진욱",
                "정환용","최시현","허승필","황재웅","꽝"
        };
        Random random = new Random();
        String[][] study = new String[6][5];
        int row = study.length;
        int col = study[0].length;
        int[] cnt = new int[30];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                while(true){
                    int idx = random.nextInt(members.length);
                    if(cnt[idx] == 1) continue;
                    study[i][j] = members[idx];
                    cnt[idx]++;
                    break;
                }
            }
        }
        for(int i = 0; i < row; i++){
            System.out.print("["+i + "조팀] " );
            for(int j = 0; j < col; j++){
                System.out.print(study[i][j] + " ");
            }
            System.out.println();
        }
    }
}
