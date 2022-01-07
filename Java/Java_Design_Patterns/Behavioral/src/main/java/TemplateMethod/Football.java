package TemplateMethod;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }
    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the Football game!");
    }
    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}// End of the Chess clas
