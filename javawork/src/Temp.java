class Solution {
    public String solution(String[] storage, int[] num) {
        int num_item = 0;
        String[] clean_storage = new String[storage.length]; //압축 이후 저장공간 배열
        int[] clean_num = new int[num.length]; // 클린 후 숫자 배열

        for(int i=0; i<storage.length; i++){
            int clean_idx = -1; // 클린 인덱스
            for(int j=0; j < num_item; j++){ // 왜돌리는 거지?
                if(storage[i].equals(clean_storage[j])){ // 저장공간에 클린
                    clean_idx = j; //
                    break;
                }
            }
            if(clean_idx == -1){ // 인덱스가 처음이면
                clean_storage[num_item] = Integer.toString(i); // 처음 문자열 넣기
                clean_num[num_item] = num[i]; //처음 숫자 넣기
                num_item += 1;
            }
            else{
                clean_num[clean_idx] += num[i];
            }
        }

        // 아래 코드에는 틀린 부분이 없습니다.

        int num_max = -1;
        String answer = "";
        for(int i=0; i<num_item; i++){
            if(clean_num[i] > num_max){
                num_max = clean_num[i];
                answer = clean_storage[i];
            }
        }
        return answer;
    }
}