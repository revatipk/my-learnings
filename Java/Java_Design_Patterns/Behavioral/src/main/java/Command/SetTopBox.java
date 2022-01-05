package Command;

public class SetTopBox {
    public void on(){
        System.out.println("SetTopBox ON");
    }
    public void off(){
        System.out.println("SetTopBox OFF");
    }
    public void setChannel(int channelNo){
        System.out.println("SetTopBox channel number: "+channelNo);
    }
    public void setVolume(int volume){
        System.out.println("SetTopBox volume : "+volume);
    }
}
