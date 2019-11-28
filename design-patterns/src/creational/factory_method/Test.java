package creational.factory_method;

public class Test {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "4000 GB", "16");
        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
