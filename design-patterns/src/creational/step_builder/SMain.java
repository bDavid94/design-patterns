package creational.step_builder;

public class SMain {

    public static void main(String[] args) {
//        SUser SUser = new SUser(SUserBuilder.aUser().withId("1")
//                .withAddress("address123")
//                .withCnp("12345")
//                .withEmail("test@test.com")
//                .withFirstName("bogdan")
//                .withLastName("david")
//                .withPhoneNumber("2222")
//                .build());
//
//                System.out.println(SUser.toString());

        SUser sUser = new SUser(SUserBuilder.aUser().withId("1").withFirstName("123").withLastName("35").build());
        System.out.println(sUser.toString());

    }
}
