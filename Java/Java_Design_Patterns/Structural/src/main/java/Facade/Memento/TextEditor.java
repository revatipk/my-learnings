package Facade.Memento;

public class TextEditor {
    private TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }
    private TextWindowState savedTextWindow;

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }
    public void write(String info)
    {
        textWindow.addText(info);
    }
    public String print()
    {
        return textWindow.getText();
    }
}
