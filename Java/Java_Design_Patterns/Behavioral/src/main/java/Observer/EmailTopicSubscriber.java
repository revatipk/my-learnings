package Observer;

public class EmailTopicSubscriber implements IObserver {
    private String name;
    private ISubject topic;
    public EmailTopicSubscriber(String name)
    {
        this.name=name;
    }
    public void update() {

        String msg = (String)topic.getUpdate(this);
        if(msg==null)
            System.out.println(this.name+" No new messages on this topic");
        else
            System.out.println(this.name+" Received message "+msg);
    }

    public void setSubject(ISubject subject) {
        this.topic=subject;

    }
}


