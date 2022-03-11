import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String greetingMsg = "You r in a land full of dragons. In front of you,\n" +
                "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and hungry and will eat you on sight.";

        //Get a random number between 1 or 2
        int randNum = getRandNum();

        //print greeting msg, ask for and scan in player input
        System.out.println(greetingMsg);
        int opt = getUserInput();
        System.out.println("Your input: " + opt);

        //substitute player input with auto-generated random number, 1 (LIVE) or 2 (DEAD)
        //print game output
        opt = randNum;
        fetchLuck(opt);
    }
    //Method: getRandNumber
    public static int getRandNum() {
        //auto-generate a random integer between 1 and 2, 50% chance for each
        return (Math.random() <= 0.5) ? 1 : 2;
    }

    //Method: getUserInput
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which cave will you go into (1 or 2) >> ");
        return scanner.nextInt();
    }

    //Method:
    public static void fetchLuck(int luckNum) {
        final String retMsgDead = "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you! He opens his jaws and..." +
                "Gobbles you down in one bite!\n";
        final String retMsgLive = "You approach the cave...\n" +
                "It is dim but warm ...\n" +
                "A dragon dances out! He opens his jaws and drops down treasures in front of you!\n";
        switch (luckNum) {
            case 1: System.out.println(retMsgLive); break;
            case 2: System.out.println(retMsgDead); break;
            default: System.out.println(retMsgLive); break;
        }
    }
}
