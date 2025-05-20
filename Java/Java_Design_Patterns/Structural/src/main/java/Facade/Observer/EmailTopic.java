package Facade.Observer;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements ISubject{
    private List<IObserver> observers;
    private String message;
    public EmailTopic()
    {
        this.observers = new ArrayList<IObserver>();
    }
    public void register(IObserver observer) throws Exception {
        if(observer==null)
            throw new Exception("Invalid Observer");
        if(!observers.contains(observer))
        {
            observers.add(observer);
        }

    }

    public void unregister(IObserver observer) {

        observers.remove(observer);
    }

    public void notifyAllUsers() {
        for (IObserver observer:
             observers) {
            observer.update();

        }
    }

    public Object getUpdate(IObserver observer) {
        return null;
    }
    public void postMessage(String msg){
        System.out.println("Message on my topic:"+msg);
        this.message=msg;
        notifyAllUsers();
    }
}
