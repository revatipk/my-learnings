package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

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

    @Override
    public void addNewCharacterToTheGame() {
        System.out.println("Adding new Character..");

    }

    @Override
    public boolean addNewGameCharacter() {
        String retValue = getUserInput();
        if(retValue.toLowerCase(Locale.ROOT).contains("y"))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String answer = "n";
        System.out.println("Do you want to add new character (y/n):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer =  reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return answer;

    }

}// End of the Chess clas
