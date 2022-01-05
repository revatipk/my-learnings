package Command;

public class SetTopBoxOff  implements Command {
    SetTopBox setTopBox;

    public SetTopBoxOff(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    public void execute() {
        this.setTopBox.off();
    }
}