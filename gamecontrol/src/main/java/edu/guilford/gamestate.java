package edu.guilford;

import java.lang.Thread.State;

public class gamestate {
    // Use an enum for a game state with initializing, running, paused, and game over states
    public enum State {
        INITIALIZING, RUNNING, PAUSED, GAMEOVER
    }

    // enum is a collection of public static final values
    // behind the scenes, each o fthese has an associated integer value, the ordinal
    // the first one is 0, the second is 1, etc.

    //Declare a method of type state to hold the current game state
    private State currentState;

    //Declare a method of type state to hold the current score and the current level
    private int currentScore;
    private int currentLevel;

    //Declare a constructor that initializes the game state to INITIALIZING
    public gamestate() {
        currentState = State.INITIALIZING;
        //State.INITIALIZING is the INITIALIZING value of the enum State
        currentScore = 0;
        currentLevel = 1;
    }

    //Constructor to set all the values to user defined values
    public gamestate(State currentState, int currentScore, int currentLevel) {
        this.currentState = currentState;
        this.currentScore = currentScore;
        this.currentLevel = currentLevel;
    }


    //declare a method to get the current game state
    public State getCurrentState() {
        return currentState;
    }

    //declare a method to set the current game state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    //declare a method to get the current score
    public int getCurrentScore() {
        return currentScore;
    }

    //declare a method to set the current score
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    //declare a method to get the current level
    public int getCurrentLevel() {
        return currentLevel;
    }

    //declare a method to set the current level
    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    // Provide methods to start, resume, pause, and end the game
    public void startGame() {
        currentState = State.INITIALIZING;
        // currentState is a variable of type State and can hove only of the four values in the enum
        // currentState = 1; doesn't work because currentState is not an int; it's a State variable
    }

    public void pauseGame() {
        currentState = State.PAUSED;
    }

    public void resumeGame() {
        currentState = State.RUNNING;
    }

    public void endGame() {
        currentState = State.GAMEOVER;
    }

    // Write a getBanner method that uses a switch statement to generate a banner based on the value of currentState
    public String getBanner() {
        String banner = "";
        switch (currentState) {
            case INITIALIZING:
                banner = "Initializing...";
                break;
            case RUNNING:
                banner = "Running...";
                break;
            case PAUSED:
                banner = "Paused...";
                break;
            case GAMEOVER:
                banner = "Game Over...";
                break;
        }
        return banner;
    }

    

    



}
