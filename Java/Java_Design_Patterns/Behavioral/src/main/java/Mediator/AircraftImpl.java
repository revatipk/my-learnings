package Mediator;

public class AircraftImpl extends AirCraft {
    public AircraftImpl(ACTMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name+" : Sending message : "+msg);
        mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name+" : Receiving message : "+msg);
    }
}
