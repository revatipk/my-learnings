package Facade.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        ACTMediator mediator = new ACTMediatorImpl();

        AirCraft boing1 = new AircraftImpl(mediator,"Boing1");
        AirCraft boing2 = new AircraftImpl(mediator,"Boing2");
        mediator.addAirCraft(boing1);
        mediator.addAirCraft(boing2);
        boing1.send("Hell0");
        boing2.send("Hi");
    }
}
