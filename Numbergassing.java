import javax.swing.*;

public class Numbergassing {
    public static void main(String args[]) {
        int computeNumber = (int) (Math.random() * 100 + 1);
        int userAnswer = 0;
        int count = 1;
        try {
            while (userAnswer != computeNumber) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userAnswer = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(userAnswer, computeNumber, count));
                count++;
            }
        } catch (Exception e) {

        }
    }

    public static String determineGuess(int userAnswer, int computeNumber, int count) {
        if (userAnswer <= 0 || userAnswer > 100) {
            return ("your guess is invalid");
        } else if (userAnswer == computeNumber) {
            return "correct ! \n Total Guessing :" + count;
        } else if (userAnswer > computeNumber) {
            return "your guess is to high, try again,\n TryNumber:" + count;
        } else if (userAnswer < computeNumber) {
            return "your guess is to low,try again,\n TryNumber:" + count;
        } else {
            return "your guess is incorect \n TryNUmber:" + count;
        }
    }
}
