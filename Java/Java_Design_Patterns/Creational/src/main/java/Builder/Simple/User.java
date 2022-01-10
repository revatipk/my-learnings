public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phoneNumber;
    private final String address;

    public User(UserBuilder userBuilder)
    {
        firstName=userBuilder.firstName;
        lastName=userBuilder.lastName;
        age=userBuilder.age;
        phoneNumber=userBuilder.phoneNumber;
        address=userBuilder.address;

    }
    @Override
    public String toString()
    {
        return "Name:"+this.firstName+" "+this.lastName+
                " age:"+this.age+" Phone Number: "+this.phoneNumber+" Address: "+this.address;
    }
    public static class UserBuilder
    {
        private final String firstName;
        private final String lastName;
        private  int age;
        private  String phoneNumber;
        private  String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }
        public User build()
        {
            return new User(this);
        }
    }
}
