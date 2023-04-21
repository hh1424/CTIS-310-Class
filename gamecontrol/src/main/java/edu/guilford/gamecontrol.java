package edu.guilford;

/**
 * Hello world!
 *
 */
public class gamecontrol 
{
    public static void main( String[] args )
    {

    //Instantiate a gamestate object
    gamestate gameState = new gamestate();

    //Initialize the game, then start it, wait 3 seconds, pause the game, wait 5 seconds, 
    //then change to running, wait 4 more seconds, and end the game. print out the banner
    //after each state change
    gameState.startGame();
    System.out.println(gameState.getBanner());
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    gameState.pauseGame();
    System.out.println(gameState.getBanner());
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    gameState.resumeGame();
    System.out.println(gameState.getBanner());
    try {
        Thread.sleep(4000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    gameState.endGame();
    System.out.println(gameState.getBanner());



    }

}
