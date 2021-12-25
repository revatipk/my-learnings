package enthuware.ParameterTests;

class User{
    Bandwidth bw = new Bandwidth();

    public void consume(int bytesUsed){
//        bw.addUsage(bytesUsed);
    }
//   ... other irrelevant code
}

class Bandwidth {
    private int totalUsage;
    private double totalBill;
    private double costPerByte;

    private void addUsage(int bytesUsed) {
        if (bytesUsed > 0) {
            totalUsage = totalUsage + bytesUsed;
            totalBill = totalUsage * costPerByte;
        }

        //add your code here

//    ...other irrelevant code
    }
}