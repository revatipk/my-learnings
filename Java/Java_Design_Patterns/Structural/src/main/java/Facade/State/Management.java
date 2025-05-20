package Facade.State;

public class Management implements Connection{

    @Override
    public void open() {
        System.out.println("Open database for Management");
    }

    @Override
    public void close() {
        System.out.println("Close the Management Database");
    }

    @Override
    public void log() {
        System.out.println("Log activities for Management");
    }

    @Override
    public void update() {
        System.out.println("Updating the Management Database");
    }
}
