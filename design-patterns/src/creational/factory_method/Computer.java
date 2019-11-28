package creational.factory_method;

public abstract class Computer {

    public abstract String getRam();
    public abstract String getHdd();
    public abstract String getCpu();

    public String toString() {
        return "RAM= " + getRam() + ", HDD=" + getHdd() + ", CPU=" + getCpu();
    }
}
