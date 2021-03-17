package springmongodb;

public class Organization {
    private String name;
    private String address;

    public Organization(String name, String address)
    {
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }




}
