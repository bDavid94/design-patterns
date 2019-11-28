package creational.builder;

public class UserBuilder {

    private String id;
    private String firstName;
    private String lastName;
    private String cnp;
    private String address;
    private String phoneNumber;
    private String email;

    public UserBuilder(String id) {
        this.id = id;
    }

    public UserBuilder withFirstName(String fistName) {
        this.firstName = fistName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withCnp(String cnp) {
        this.cnp = cnp;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder build() {
        return this;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}