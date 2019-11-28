package creational.step_builder;

public class SMain {

    public static void main(String[] args) {

        SUser sUser = new SUser(SUserBuilder.aUser().withId("1").withFirstName("123").withLastName("35").build());
        System.out.println(sUser.toString());

    }
}
