package Adapter;

public class SocketAdapterImplementation  extends Socket implements  SocketAdapter{
    @Override
    public Volt get120Volts() {
        return getVolt();
    }

    @Override
    public Volt get12Volts() {
        return covertVolt(getVolt(),10);
    }

    @Override
    public Volt get3Volts() {
        return covertVolt(getVolt(),40);
    }

    @Override
    public Volt get1Volts() {
        return covertVolt(getVolt(),120);
    }
    private Volt covertVolt(Volt v, int i)
    {
        return new Volt(v.getVolts()/i);
    }
}
