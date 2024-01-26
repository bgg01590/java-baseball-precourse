package baseball;

import camp.nextstep.edu.missionutils.Console;

public class BaseballRuler {
    BaseballCounter baseballCounter;
    BaseballRuler(BaseballCounter baseballCounter){
        this.baseballCounter = baseballCounter;
    }
    public boolean playRound(String answer) {
        while (true) {
            System.out.print("숫자를 입력해주세요 : ");
            String input = Console.readLine();
            checkValidation(input);

            int balls = baseballCounter.countBalls(input, answer);
            int strikes = baseballCounter.countStrikes(input, answer);
            printResult(balls, strikes);

            if (isRoundWon(strikes)) {
                return askForContinuation();
            }
        }
    }

    private void checkValidation(String input){
        if(!input.matches("[1-9]{3}")){
            throw new IllegalArgumentException();
        }
    }

    private void printResult(int balls, int strikes) {
        if (balls > 0) System.out.print(balls + "볼 ");
        if (strikes > 0) System.out.print(strikes + "스트라이크");
        if (balls==0 && strikes ==0) System.out.print("낫싱");
        System.out.println();
    }

    private boolean isRoundWon(int strikes) {
        return strikes == 3;
    }

    private boolean askForContinuation() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = Console.readLine();
        if ("1".equals(input)) {
            return true;
        }
        else if("2".equals(input)){
            return false;
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
