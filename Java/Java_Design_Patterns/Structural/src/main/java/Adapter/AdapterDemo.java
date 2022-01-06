package Adapter;

public class AdapterDemo {
    public static void main(String[] args) {

        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v120 = getVolt(socketAdapter,120);
        Volt v12 = getVolt(socketAdapter,12);

        System.out.println("V12 volts : "+v12.getVolts());
        System.out.println("V120 volts : "+v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int volts)
    {
        switch (volts){
            case 120:
            default:
                return socketAdapter.get120Volts();
            case 12:
                return socketAdapter.get12Volts();
            case 3:
                return socketAdapter.get3Volts();
            case 1:
                return socketAdapter.get1Volts();
        }


    }
}
