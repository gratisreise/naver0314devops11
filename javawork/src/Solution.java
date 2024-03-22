//class Solution {
//
//    public int[] solution(String[] keymap, String[] targets) {
//        int row = keymap.length;
//        int col = 0;
//        for(String s : keymap) if(s.length() > col) col = s.length();
//        char[][] c = new char[row][col];
//        for(int i = 0; i < row; i++){
//            for(int j = 0; j < col; j++){
//                if(j > keymap[i].length() - 1) continue;
//                c[i][j] = keymap[i].charAt(j);
//            }
//        }
//        for(String s : targets){
//            for(char c : s.toCharArray()){
//                for(int i = 0; i < col; i++){
//                    for(int j = 0; j < row; j++){
//                        if(c[j][i] == )
//                    }
//                }
//            }
//        }
//
//
//
//    }
//}