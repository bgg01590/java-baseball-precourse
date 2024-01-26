package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class AnswerGenerator {
    private String answer;

    public void initAnswer(){
        this.answer = generateAnswer();
        System.out.println(this.answer);
    }

    private String generateAnswer() {
        StringBuilder tempAns = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int num = Randoms.pickNumberInRange(1, 9);
            if(tempAns.toString().contains(Integer.toString(num))){
                i--;
            } else{
                tempAns.append(num);
            }

        }
        this.answer = tempAns.toString();
        return this.answer;
    }

    public String getAnswer() {
        return this.answer;
    }
}
