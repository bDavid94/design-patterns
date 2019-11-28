package creational.builder;

public class Main {

    public static void main(String[] args) {
        User user = new User(new UserBuilder("1").withAddress("address123")
                .withCnp("12345")
                .withEmail("test@test.com")
                .withFirstName("bogdan")
                .withLastName("david")
                .withPhoneNumber("2222")
                .build());

                System.out.println(user.toString());

    }
}
