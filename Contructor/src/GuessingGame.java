import java.util.Scanner;

class Umpire {

    int guessNumByGusser;
    int guessNumByPlayer1;
    int guessNumByPlayer2;
    int guessNumByPlayer3;

    void collectingNumFromGusser() {
        Gusser obj = new Gusser();
        guessNumByGusser = obj.guessingNumber();
    }

    void collectingNumFromPlayer() {
        Player obj = new Player();
        guessNumByPlayer1 = obj.guessingNumberForP1();
        guessNumByPlayer2 = obj.guessingNumberForP2();
        guessNumByPlayer3 = obj.guessingNumberForP3();
    }

    void verify() {
        if(guessNumByGusser == guessNumByPlayer1) {
            if(guessNumByPlayer1 == guessNumByPlayer2 && guessNumByPlayer1 == guessNumByPlayer3) {
                System.out.println("Match Draw between all Players.");
            } else if (guessNumByPlayer1 == guessNumByPlayer2) {
                System.out.println("Match Draw between Player 1 and Player 2.");
            } else if (guessNumByPlayer1 == guessNumByPlayer3) {
                System.out.println("Match Draw between Player 1 and Player 3.");
            } else {
                System.out.println("Player 1 Wins!!");
            }

        } else if (guessNumByGusser == guessNumByPlayer2) {
            if(guessNumByGusser == guessNumByPlayer3) {
                System.out.println("Match Draw between Player 2 and Player 3.");
            } else {
                System.out.println("Player 2 Wins!!");
            }
        } else {
            System.out.println("Player 3 Wins!!");
        }
    }
}

class Gusser {
    int num;
    Scanner scan = new Scanner(System.in);

    int guessingNumber() {
        System.out.println("Gusser, Guesse the Number between 1 to 10: ");
        num = scan.nextInt();
        return num;
    };

}

class Player {
    int p1Num;
    int p2Num;
    int p3Num;

    Scanner scan = new Scanner(System.in);

    int guessingNumberForP1() {
        System.out.println("Player 1, Guesse the Number between 1 to 10: ");
        p1Num = scan.nextInt();
        return  p1Num;
    };

    int guessingNumberForP2() {
        System.out.println("Player 2, Guesse the Number between 1 to 10: ");
        p2Num = scan.nextInt();
        return  p2Num;
    };

    int guessingNumberForP3() {
        System.out.println("Player 3, Guesse the Number between 1 to 10: ");
        p3Num = scan.nextInt();
        return  p3Num;
    };
}

class Om {
    String hello = "Hello world";
    void Om() {
        System.out.println(hello);
    }
}

public class GuessingGame {
    public static void main(String[] args) {

    Umpire obj = new Umpire();
    obj.collectingNumFromGusser();
    obj.collectingNumFromPlayer();
    obj.verify();
    }
}
