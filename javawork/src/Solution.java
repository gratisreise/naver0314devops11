import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        // 나머지 입력 처리
        // ...

        bw.write(String.valueOf(m));
        Map<String, int[]> mp = new HashMap<>();
        mp.put("ss", new int[]{0, 0});

        br.close();
        bw.flush();
        bw.close();
    }
}
