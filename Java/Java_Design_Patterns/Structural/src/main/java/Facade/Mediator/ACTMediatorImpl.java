package Facade.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ACTMediatorImpl implements  ACTMediator{
    private List<AirCraft> airCrafts;

    public ACTMediatorImpl() {
        airCrafts=new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, AirCraft aircraft) {
        for(AirCraft a:airCrafts)
        {
            if(a!=aircraft)
                a.receive(msg);
        }
    }

    @Override
    public void addAirCraft(AirCraft airCraft) {
        airCrafts.add(airCraft);
    }
}
