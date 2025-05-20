package Facade.State;

public class Controller {
    public static Accounting acct;
    public static Sales sales;
    public static Management mgmt;

    private static Connection con;

    public Controller() {
        acct = new Accounting();
        sales = new Sales();
        mgmt = new Management();
    }
    public void setAcctConnection(){
        con=acct;
    }
    public void setSalesConnection(){
        con=sales;
    }
    public void setManagementConnection(){
        con=mgmt;
    }
    public void open()
    {
        con.open();
    }
    public void close()
    {
        con.close();
    }
    public void log()
    {
        con.log();
    }
    public void update()
    {
        con.update();
    }
}
