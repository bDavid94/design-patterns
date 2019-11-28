package creational.builder;

public class User {

    private final String id;
    private final String firstName;
    private final String lastName;
    private final String cnp;
    private final String address;
    private final String phoneNumber;
    private final String email;

    public User(UserBuilder builder) {
        this.id = builder.getId();
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.cnp = builder.getCnp();
        this.address = builder.getAddress();
        this.phoneNumber = builder.getPhoneNumber();
        this.email = builder.getEmail();
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getCnp() { return cnp; }

    public String getAddress() { return address; }

    public String getPhoneNumber() { return phoneNumber; }

    public String getEmail() { return email; }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "SUser{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cnp='" + cnp + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
