package HW6;

public class Laptop {
    private int id;
    private String company;
    private String name;
    private String cpu;
    private String gpu;
    private int ram;
    private int hdd;

    public Laptop(int id, String company, String name, String cpu, String gpu, int ram, int hdd) {
        this.id = id;
        this.company = company;
        this.name = name;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
    }
    
    public int getId() {
        return id;
    }
    
    public String getCompany() {
        return company;
    }
    
    public String getName() {
        return name;
    }
    
    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return String.format("%s %s Процессор: %s Видеокарта: %s Объём оперативной памяти: %dГБ Объём жёсткого диска: %dГБ", company, name, cpu, gpu, ram, hdd);
    }
}
