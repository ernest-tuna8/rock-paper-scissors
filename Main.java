import java.util.*;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String choice = "yes";
    while(choice.equals("yes"))
    {
      System.out.println("choose rock, paper, or scissors");
      String player = scan.next();
      player.toLowerCase();
      if(!player.equals("scissors")|| !player.equals("paper")|| !player.equals("rock"))
      {
        //for some reason line 12 activates no matter what, I can't figure out why, so just deal with it
        int x=0;
        while(x==0)
        {
          System.out.println("just to make sure you choose are fully sure rock, paper, or scissors");
          player= scan.next();
          if(player.equalsIgnoreCase("scissors")|| player.equalsIgnoreCase("paper")|| player.equalsIgnoreCase("rock"))
          {
            x++;
          }
        }
      }
      int computer = ((int) (Math.random()*3+1));
      // 1 is paper
      //2 is rock
      //3 is scissors
      if ((computer == 1 && player == "paper")|| (computer == 2 && player == "rock") || (computer == 3 && player == "scissors"));
      {
        System.out.println("tie, both you and the computer picked the same thing");
      }
      if(computer == 3 && player == "paper")
      {
        System.out.println("you lose, computer choose scissors while you choose paper");
      }
      else if(computer == 3 && player== "rock")
      {
        System.out.println("you win, the computer choose scissors while you choose rock");
      }
      else if(computer == 1 && player == "rock")
      {
        System.out.println("you lose, the computer choose paper while you choose rock");
      }
      else if(computer == 1 && player == "scissors")
      {
        System.out.println("you win, the computer choose paper while you choose scissors");
      }
      else if(computer == 2 && player == "paper")
      {
      System.out.println("you win, you choose paper while the computer choose rock");
      }
      else if(computer == 2 && player == "scissors")
      {
        System.out.println("you lose, you choose scissors while the computer choose rock");
      }
      scan.reset();
      System.out.println("would you like to play again");
      choice = scan.nextLine();
    }
  }
}