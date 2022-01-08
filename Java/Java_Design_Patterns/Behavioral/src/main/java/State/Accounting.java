package State;

public class Accounting implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for accounting");
    }

    @Override
    public void close() {
        System.out.println("Close the Accounting Database");
    }

    @Override
    public void log() {
        System.out.println("Log activities for Accounting");
    }

    @Override
    public void update() {
        System.out.println("Updating the Accounting Database");

    }
}
