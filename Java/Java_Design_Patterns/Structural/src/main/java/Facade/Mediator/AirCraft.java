package Facade.Mediator;

public abstract class AirCraft {
    protected ACTMediator mediator;
    protected  String name;

    public AirCraft(ACTMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
