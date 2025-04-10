class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int prevCnt = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') { 
                prevCnt++;
            } else {
                prevCnt--;
                
                if(prevCnt < 0) {
                    return !answer;
                }
            }
        }
        
        if(prevCnt != 0) {
            answer = !answer;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}