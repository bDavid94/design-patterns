package creational.factory_method;

public class Server extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return "Server ram: " + ram;
    }

    @Override
    public String getHdd() {
        return "Server hdd: " + hdd;
    }

    @Override
    public String getCpu() {
        return "Server cpu: " + cpu;
    }
}
