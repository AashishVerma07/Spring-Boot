package com.sttry.learnspringframework.game;

public class GameRunner {
    // Constructor for MarioGame Class.
//     MarioGame game ;
//     public GameRunner(MarioGame game){
//         this.game = game;
//     }

//     Constructor for superContra class.
//    SuperContra game;
//    public GameRunner(SuperContra game){
//        this.game = game;
//    }

    //Here we create a interface with aal methods which are present in both class and implements in both classes.
    GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole){
        this.gamingConsole = gamingConsole;
    }
    public void run() {
        System.out.println("Running game: " + gamingConsole);
        gamingConsole.up();
        gamingConsole.right();
        gamingConsole.left();
        gamingConsole.down();
    }
}
