import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        int count = 0;
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int userin = 0;
        int sysin = 0;

        while (count < 5) {
            System.out.println("Select any one of the following options : ");
            System.out.println("0. Rock");
            System.out.println("1. Paper");
            System.out.println("2. Scissors");

            System.out.print("\nEnter your choice : \n");
            userin = Integer.parseInt(sc.nextLine());
            sysin = ran.nextInt(3);

            switch (userin) {
                case 0:
                    System.out.println(" You chose Rock");
                    break;
                case 1:
                    System.out.println("You chose Paper");
                    break;
                case 2:
                    System.out.println("You chose Scissor");
                    break;
                default:
                    break;
            }

            if (userin >= 3) {
                System.out.println("Invalid choice. Please try again");
                continue;
            }
            switch (sysin) {
                case 0:
                    System.out.println("The computer chose Rock");
                    break;
                case 1:
                    System.out.println("The computer chose Paper");
                    break;
                case 2:
                    System.out.println("The computer chose Scissors");
                    break;
                default:
                    break;
            }
            if (userin == 1 && sysin == 1 || userin == 2 && sysin == 2 || userin == 3 && sysin == 3) {
                System.out.println("\n-----------This round was a TIE !!-----------\n");
            } else if (userin == 1 && sysin == 2 || userin == 2 && sysin == 3 || userin == 3 && sysin == 1) {
                System.out.println("\n-----------You LOSE !! Better luck next time.-----------\n");
            } else {
                System.out.println("\n------------You WON !!!-----------\n");
            }
            count++;
        }
    }
}


