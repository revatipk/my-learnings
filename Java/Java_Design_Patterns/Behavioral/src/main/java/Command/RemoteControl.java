package Command;

public class RemoteControl {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void pressbutton()
    {
        command.execute();
    }
}
