import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int[][] queries) {
        List<Integer> ret = new ArrayList<>();
        for(int i = 0; i < queries.length; i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            int min = 10000000;
            int min_idx = 0;
            for(int j = s; j <= e; j++){
                if(arr[i] > k){
                    int temp = Math.abs(arr[j] - k);
                    if(temp < min){
                        min = temp;
                        min_idx = j;
                    }
                }

            }
            ret.add(arr[min_idx]);
        }
        return ret;
    }
}