import java.util.*;

public class Main{
    static int n, m, k,x1, x2, y1,y2;
    static int[][] a = new int[104][104];
    static int[][] visited = new int[104][104];
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int dfs(int y, int x){
        visited[y][x] = 1;
        int ret = 1;
        for(int i = 0; i < 4; i++){
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
            if(a[ny][nx] == 0 || visited[ny][nx] != 0) continue;
            ret += dfs(ny, nx);
        }
        return ret;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        m = sc.nextInt();
        n = sc.nextInt();
        k = sc.nextInt();
        while(k-- > 0){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    a[y][x] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == 0 || visited[i][j] != 0) continue;
                l.add(dfs(i ,j));
            }
        }
        Collections.sort(l);

        System.out.println(l.size());
        for(int i : l) System.out.print(i + " ");
    }
}