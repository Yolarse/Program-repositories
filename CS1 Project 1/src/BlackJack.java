import java.util.*;

public class BlackJack {
    public static int menuOption() {
        Scanner input = new Scanner(System.in);
        String menuInput = "";
        boolean validMenu = true;
        int chosenOption = 0;

        while (validMenu) {
            menuInput = input.nextLine();
            if (menuInput.equals("1") || menuInput.equals("2") || menuInput.equals("3") || menuInput.equals("4")) {
                if (menuInput.equals("1")) {
                    chosenOption = 1;
                    break;
                } else if (menuInput.equals("2")) {
                    chosenOption = 2;
                    break;
                } else if (menuInput.equals("3")) {
                    chosenOption = 3;
                    break;
                } else if (menuInput.equals("4")) {
                    chosenOption = 4;
                    break;
                }
            }
            else {
                chosenOption = 0;
                break;
            }
        }
    return chosenOption;
}

    public static int drawCard(int yourHand) {

        Random generateCard = new Random();
        int nextCard = generateCard.nextInt(13) + 1;

        switch (nextCard) {
            case 1:
                System.out.println("Your card is an ACE!");
                yourHand += 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Your card is a " + nextCard + "!");
                yourHand += nextCard;
                break;
            case 11:
                System.out.println("Your card is a JACK!");
                yourHand += 10;
                break;
            case 12:
                System.out.println("Your card is a QUEEN!");
                yourHand += 10;
                break;
            case 13:
                System.out.println("Your card is a KING!");
                yourHand += 10;
                break;
            default:
                System.out.println("Your card is a JOKER!");
                break;
        }
        return yourHand;
    }

    public static void main(String args[]) {


        boolean playAgain = true;
        boolean gamePlay = true;
        boolean stopDraw = true;
        int chosenOption = 0;
        int gameNumber = 0;
        int yourHand = 0;
        int dealerHand = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int draws = 0;

        //Scanner input = new Scanner(System.in);
        Random generateCard = new Random();


        while (playAgain) {

            gamePlay = true;
            yourHand = 0;
            gameNumber += 1;
            System.out.println("START GAME #" + gameNumber + "\n");

            while (gamePlay) {
                yourHand = drawCard(yourHand);
                System.out.println("Your hand is: " + yourHand + "\n");
                stopDraw = true;

                while (stopDraw) {

                    if (yourHand > 21) {
                        System.out.println("You exceeded 21! You lose :(\n");
                        dealerWins += 1;
                        gamePlay = false;
                        break;
                    } else if (yourHand == 21) {
                        System.out.println("BLACKJACK! You win!\n");
                        playerWins += 1;
                        gamePlay = false;
                        break;
                    }
                    else {
                        System.out.println("1. Get another card" + "\n2. Hold hand" + "\n3. Print game statistics" + "\n4. Exit \n");
                        chosenOption = menuOption();
                    }

                    if (chosenOption == 1) {
                        break;
                    }
                    if (chosenOption == 2) {
                        dealerHand = generateCard.nextInt(11) + 16;
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + yourHand);

                        if (dealerHand > 21) {
                            System.out.println("\nYou win!\n");
                            playerWins += 1;
                            gamePlay = false;
                            break;
                        } else if (dealerHand > yourHand) {
                            System.out.println("\nDealer wins!\n");
                            dealerWins += 1;
                            gamePlay = false;
                            break;
                        } else if (yourHand > dealerHand) {
                            System.out.println("\nYou win!\n");
                            playerWins += 1;
                            gamePlay = false;
                            break;
                        } else if (dealerHand == yourHand) {
                            System.out.println("\nIt's a tie! No one wins!\n");
                            draws += 1;
                            gamePlay = false;
                            break;
                        }
                    } else if (chosenOption == 3) {
                        System.out.println("Number of Player wins: " + playerWins);
                        System.out.println("Number of Dealer wins: " + dealerWins);
                        System.out.println("Number of tie games: " + draws);
                        System.out.println("Total # of games played is: " + (gameNumber - 1));
                            if ((gameNumber - 1) == 0) {
                                System.out.println("Percentage of Player wins: 0.0%\n");
                            }
                            else {
                                System.out.println("Percentage of Player wins: " + ((playerWins / ((gameNumber * 1.0) - 1) * 100.0)) + "%\n");
                            }

                    } else if (chosenOption == 4) {
                        playAgain = false;
                        gamePlay = false;
                        break;
                    } else if (chosenOption == 0) {
                        System.out.println("Invalid input! \nPlease enter an integer value between 1 and 4.\n");
                    }
                }
            }
        }
    }
}



