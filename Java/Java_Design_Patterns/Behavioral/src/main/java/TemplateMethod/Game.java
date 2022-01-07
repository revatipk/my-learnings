package TemplateMethod;

public abstract class Game {
    abstract void initialize();
    abstract void start();
    abstract void end();

    public final void play(){
        //load user data
        loadData();
        //initialize the game
        initialize();
        //start game
        start();
        //Hook-On template
        if(addNewGameCharacter())
        {
            addNewCharacterToTheGame();
        }
        //end game
        end();
    }

    public abstract void addNewCharacterToTheGame() ;

    public boolean addNewGameCharacter() {
        return false;
    }

    //default implementation common for all the subclasses
    public void loadData() {
        System.out.println("Loading Data..");
    }
}// End of the Game abstract class.
