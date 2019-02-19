import java.util.Scanner;
public class GuessingGame {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int numGuess = 0, playerGuess = -1,done = 0, numTries = 0;
    int gameGuess = (int)(Math.random()*99+1);
    System.out.println("Welcome to the guessing game.");
    while(done == 0){
      System.out.println("Please guess a number between 1-100.");
      playerGuess = scan.nextInt();
      numGuess++;
      
      if(playerGuess == gameGuess){
        System.out.println("Correct! Your guess was: "+playerGuess+", it took you "+numTries+" tries.");
        done++;
      }
      else if(playerGuess < gameGuess){
        System.out.println("That guess was too low");
      }
      else if(playerGuess > gameGuess){
        System.out.println("That guess was too high");
      }
    }
    
  }
}
