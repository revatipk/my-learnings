package Command;

public class CommandMain {
    public static void main(String[] args) {
            RemoteControl remoteControl = new RemoteControl();
            SetTopBox setTopBox = new SetTopBox();
            remoteControl.setCommand(new SetTopBoxOn(setTopBox));
            remoteControl.pressbutton();
            remoteControl.setCommand(new SetTopBoxOff(setTopBox));
            remoteControl.pressbutton();
    }
}
