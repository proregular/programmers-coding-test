import java.util.*;

class Solution {
    public String[] solution(String[] record) {
       Map<String, String> nicknameMap = new HashMap<>();
        List<String[]> messages = new ArrayList<>();

        for (String r : record) {
            String[] parts = r.split(" ");
            String command = parts[0];
            String userId = parts[1];

            if (command.equals("Enter")) {
                String nickname = parts[2];
                nicknameMap.put(userId, nickname);
                messages.add(new String[]{userId, "들어왔습니다."});
            } else if (command.equals("Leave")) {
                messages.add(new String[]{userId, "나갔습니다."});
            } else if (command.equals("Change")) {
                String nickname = parts[2];
                nicknameMap.put(userId, nickname);
            }
        }

        String[] answer = new String[messages.size()];
        for (int i = 0; i < messages.size(); i++) {
            String userId = messages.get(i)[0];
            String action = messages.get(i)[1];
            String nickname = nicknameMap.get(userId);
            answer[i] = nickname + "님이 " + action;
        }

        return answer;
    }
}