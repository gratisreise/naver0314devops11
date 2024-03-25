import java.util.*;

public class Main{
    public static void main(String[] args){
        Stack<Integer> stk = new Stack<>();
        String s = "";
        int n = 1000;
        int b = 16;
        while(n > 1){

            stk.push(n % b);
            n /= b;

        }
        if(n == 1) stk.push(1);
        while(!stk.isEmpty()) {
            if(stk.peek() >= 10){
                s += ("" + (char)(stk.pop() + 55));
            } else s += ("" + stk.pop());
        }
        System.out.println(s);
    }
}