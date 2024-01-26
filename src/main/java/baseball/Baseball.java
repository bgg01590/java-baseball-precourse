package baseball;

//import camp.nextstep.edu.missionutils.Console;

public class Baseball {
    private final AnswerGenerator answerGenerator;
    private final BaseballRuler baseballRuler;

    public Baseball() {
        this.answerGenerator = new AnswerGenerator();
        this.baseballRuler = new BaseballRuler(new BaseballCounter());
    }

    public void initRound(){
        this.answerGenerator.initAnswer();
    }

    public void start() {
        boolean continueRound;
        do {
            initRound();
            String answer = answerGenerator.getAnswer();
            continueRound = baseballRuler.playRound(answer);
        } while (continueRound);
    }
}
