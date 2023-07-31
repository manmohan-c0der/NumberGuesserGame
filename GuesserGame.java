
import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter guessing(only Positive Number)");
        guessNum = sc.nextInt();
        return guessNum;

    }

}

class Players {
    int PlayerNum;

    int getPlayerNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Guessing Number");
        PlayerNum = sc.nextInt();
        return PlayerNum;

    }

}

class Mediator {
    int guessnum1;
    int Player1Num;
    int Player2Num;
    int Player3Num;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    void guesserInput() {
        Guesser g = new Guesser();
        guessnum1 = g.guessingNum();

    }

    void verifyingNum() {
        if (guessnum1 >= 0 && guessnum1 < 10) {
            System.out.println("Guess the number between 0 to 10");
        } else if (guessnum1 >= 10 && guessnum1 < 20) {
            System.out.println("Guess the number between 10 to 20");
        } else if (guessnum1 >= 20 && guessnum1 < 30) {
            System.out.println("Guess the number between 20 to 30");
        } else if (guessnum1 >= 30 && guessnum1 < 40) {
            System.out.println("Guess the number between 30 to 40");
        } else if (guessnum1 >= 40 && guessnum1 < 50) {
            System.out.println("Guess the number between 40 to 50");
        } else if (guessnum1 >= 50 && guessnum1 < 70) {
            System.out.println("Guess the number between 50 to 70");
        } else if (guessnum1 >= 70 && guessnum1 < 90) {
            System.out.println("Guess the number between 70 to 90");
        } else if (guessnum1 >= 90 && guessnum1 < 100) {
            System.out.println("Guess the number between 90 to 100");
        } else {
            System.out.println("Guess the number without any range ");
        }
    }

    void PlayerInput() {
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();
        Player1Num = p1.getPlayerNum();
        Player2Num = p2.getPlayerNum();
        Player3Num = p3.getPlayerNum();

    }

    void compare() {
        if (guessnum1 == Player1Num) {
            if (guessnum1 == Player2Num && guessnum1 == Player3Num) {
                count1 += 1;
                count2 += 1;
                count3 += 1;
                System.out.println("All Players Guess the right Number all won the Game ");
            } else if (guessnum1 == Player2Num) {
                count1 += 1;
                count2 += 1;

                System.out.println("Player1 and Player2 Guess the right Number won the Game ");
            } else if (guessnum1 == Player3Num) {
                count1 += 1;

                count3 += 1;
                System.out.println("Player1 and Player3 Guess the right Number won the Game ");

            } else {
                count1 += 1;

                System.out.println("Player1 Guess the right Number won the Game ");

            }
        } else if (guessnum1 == Player2Num) {
            if (guessnum1 == Player2Num && guessnum1 == Player3Num) {

                count2 += 1;
                count3 += 1;
                System.out.println("Player2 and Player3 Guess the right Number won the Game ");

            } else {

                count2 += 1;

                System.out.println("Player2 Guess the right Number won the Game ");

            }
        } else {

            count3 += 1;
            System.out.println("Player3 Guess the right Number won the Game ");

        }
    }

    void finalWinner() {
        if (count1 > count2 && count1 > count3) {
            System.out.println("Player1 Guess the right Number more time !");
        } else if (count2 > count1 && count2 > count3) {
            System.out.println("Player2 Guess the right Number more time !");

        } else if (count3 > count1 && count3 > count2) {
            System.out.println("Player3 Guess the right Number more time !");

        } else {
            System.out.println("Game Draw ! all Player guess the number one one time !");
        }
    }

}

public class GuesserGame {
    public static void main(String[] args) {
        Mediator md = new Mediator();
        int i = 0;
        while (i < 3) {
            md.guesserInput();
            md.verifyingNum();
            md.PlayerInput();
            md.compare();
            i++;

        }
        md.finalWinner();

    }

}
