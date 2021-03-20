import java.util.Scanner;

public class updatedRockPaperScissors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int playerCount = 0;
        int botCount = 0;
        String[] array = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock Paper Scissors");
        String answer = "";

        while (!answer.equalsIgnoreCase("exit")){
            int rand = (int) (Math.random() * 3 + 0.0);
            String randomAnswer = array[rand];

            System.out.print("\nChoose between Rock, Paper, or Scissors " +
                    " or type exit to leave: ");
            answer = input.next();

            if (answer.equalsIgnoreCase("rock")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Paper beats rock.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Rock beats scissors.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("paper")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Paper beats rock.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Scissors beat paper.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
            else if (answer.equalsIgnoreCase("scissors")){
                if (randomAnswer.equalsIgnoreCase("rock")){
                    System.out.println("Rock beats scissors.");
                    botCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("paper")){
                    System.out.println("Scissors beats paper.");
                    playerCount += 1;

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
                else if (randomAnswer.equalsIgnoreCase("scissors")){
                    System.out.println("Tied.");

                    if (playerCount == 1){
                        System.out.println("You: " + playerCount + " point      " +
                                "    Bot: " + botCount + " points");
                    }
                    else if (botCount == 1){
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " point");
                    }
                    else {
                        System.out.println("You: " + playerCount + " points      " +
                                "    Bot: " + botCount + " points");
                    }
                }
            }
        }
        if (playerCount > botCount){
            System.out.println("\nCongrats! You Win!");
        }
        else if (botCount > playerCount){
            System.out.println("\nGame Over. You Lose.");
        }
        else {
            System.out.println("\nIt's Tied. Nobody Wins!");
        }
    }
}
