package State;

public class Sales implements Connection{
    @Override
    public void open() {
        System.out.println("Open database for Sales");
    }

    @Override
    public void close() {
        System.out.println("Close the Sales Database");
    }

    @Override
    public void log() {
        System.out.println("Log activities for Sales");
    }

    @Override
    public void update() {
        System.out.println("Updating the Sales Database");
    }
}
