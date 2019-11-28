package creational.step_builder;

public class SUserBuilder implements IdUserBuilder, FirstNameUserBuilder, LastNameUserBuilder{

    private String id;
    private String firstName;
    private String lastName;
    private String cnp;
    private String address;
    private String phoneNumber;
    private String email;

    private SUserBuilder() {}

    public static IdUserBuilder aUser() {
        return new SUserBuilder();
    }

    public FirstNameUserBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public LastNameUserBuilder withFirstName(String fistName) {
        this.firstName = fistName;
        return this;
    }

    public SUserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public SUserBuilder withCnp(String cnp) {
        this.cnp = cnp;
        return this;
    }

    public SUserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public SUserBuilder withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SUserBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    public SUserBuilder build() {
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

