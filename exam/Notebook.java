public class Notebook {
    private String name;
    private String cpu;
    private int ram;
    private int memoryCapacity;
    private String operatingSystem;
    private double screenDiagonal;
    private String color;
    private String manufacturer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Integer getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Варианты конструкторов.
    public Notebook() {
    }

    public Notebook(String name) {
        this.name = name;
    }

    public Notebook(String name, String cpu) {
        this.name = name;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Notebook {" +
                "name= " + name +
                ",\n cpu= " + cpu +
                ",\n RAM= " + ram +
                ",\n memory capacity= " + memoryCapacity +
                ",\n operating system= " + operatingSystem +
                ",\n screen diagonal= " + screenDiagonal +
                ",\n color= " + color +
                ",\n manufacturer= " + manufacturer +
                "}";
    }
}
