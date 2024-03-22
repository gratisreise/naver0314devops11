class Solution {
    static int[] calcNum = new int[3];;
    static int calc(String s, int n){
        int ans = 0;
        if(s.lenghth() == 2){

        } else if(s.length() == 3){

        }
    }
    public int solution(String dartResult) {
        int ret = 0;

        String temp = "";
        int j = 0;
        for(int i = 0; i < dartResult.length(); i++){
            char c1 = dartResult.charAt(i)
            temp += c1;
            if(i + 1 == dartResult.length() - 1){
                calcNum[j] = calc(temp);
            } else {
                char c2 = dartResult.charAt(i + 1);
                if( || ('0' <= c2 && c2 <= '9')){
                    calcNum[j] = calc(temp);
                    temp = "";
                }
            }

        }



        return ret;
    }
}