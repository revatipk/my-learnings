package Command;

public class SetTopBoxOn implements Command{
    SetTopBox setTopBox;

    public SetTopBoxOn(SetTopBox setTopBox) {
        this.setTopBox = setTopBox;
    }

    public void execute() {
        this.setTopBox.on();
    }
}
