package Facade.Observer;

public interface ISubject
{
    public void register(IObserver observer) throws Exception;
    public void unregister(IObserver observer);
    public void notifyAllUsers();
    public Object getUpdate(IObserver observer);
}
