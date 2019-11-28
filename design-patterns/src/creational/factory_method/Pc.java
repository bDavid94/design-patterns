package creational.factory_method;

public class Pc extends Computer {

    private String ram;
    private String hdd;
    private String cpu;

    public Pc(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return "Pc ram: " + ram;
    }

    @Override
    public String getHdd() {
        return "Pc hdd: " + hdd;
    }

    @Override
    public String getCpu() {
        return "Pc cpu: " + cpu;
    }
}
