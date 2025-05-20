package Facade.Observer;

public class Main {
    public static void main(String[] args) throws Exception {
        EmailTopic topic = new EmailTopic();

        //Create Observer
        IObserver first = new EmailTopicSubscriber("FirstObserver");
        IObserver second = new EmailTopicSubscriber("SecondObserver");
        IObserver third = new EmailTopicSubscriber("ThirdObserver");

        //Register Observer
        topic.register(first);
        topic.register(second);
        topic.register(third);

        //Attach subject to observer
        first.setSubject(topic);
        second.setSubject(topic);
        third.setSubject(topic);

        first.update();
        topic.postMessage("Hello");
    }
}
