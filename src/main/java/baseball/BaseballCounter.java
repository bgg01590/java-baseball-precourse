package baseball;

public class BaseballCounter {

    public int countStrikes(String input, String answer) {
        int strikes=0;
        for (int i = 0; i < 3; i++) {
            if (answer.charAt(i) == input.charAt(i)) {
                strikes++;
            }
        }
        return strikes;

    }

    public int countBalls(String input, String answer) {
        int balls=0;
        for (int i = 0; i < 3; i++) {
            if (answer.contains(String.valueOf(input.charAt(i)))
                    && answer.charAt(i) != input.charAt(i)) {
                balls++;
            }
        }
        return balls;
    }
}
