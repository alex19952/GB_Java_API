import java.util.function.Supplier;

public class Laptop implements Comparable<Laptop> {
    private String brand;
    private Double price;

    private String CPUName;
    private String GraphicsCardName;
    private String SSDName;
    private String HDDName;

    private Double CPUFrequency;
    private Double MaxCPUFrequency;
    private Integer CPUCores;
    private Integer RAM;
    private Integer SSD;
    private Integer HDD;
    private Integer VideoMemoryCapacity;

    private Integer DisplaySize;
    private Double Weight;
    private String OS;

    Laptop(String brand) {
        this.brand = brand;
        this.price = 0.0;

        this.CPUName = "";
        this.GraphicsCardName = "";
        this.SSDName = "";
        this.HDDName = "";

        this.CPUFrequency = 0.0;
        this.MaxCPUFrequency = 0.0;
        this.CPUCores = 0;
        this.RAM = 0;
        this.SSD = 0;
        this.HDD = 0;
        this.VideoMemoryCapacity = 0;

        this.DisplaySize = 0;
        this.Weight = 0.0;
        this.OS = "";
    }

    @Override
    public String toString() {
        String lptp = brand + '\n';
        lptp += "price: " + price + '\n';
        lptp += "CPU frequency: " + CPUFrequency + '\n';
        lptp += "SSD: " + SSD + '\n';
        lptp += "HDD: " + HDD + '\n';
        return lptp;
    }

    @Override
    public int compareTo(Laptop o) {
        return brand.compareTo(o.brand);
    }

    public Supplier execMethod(Integer numMethods) {
        return switch (numMethods) {
            case 1:
                yield this::getBrand;
            case 2:
                yield this::getPrice;
            case 3:
                yield this::getCPUFrequency;
            case 4:
                yield this::getSSD;
            case 5:
                yield this::getHDD;
            default: yield this::getBrand;
        };
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean setCPUCores(Integer CPUCores) {
        if (CPUCores < 1) {
            return false;
        }
        this.CPUCores = CPUCores;
        return true;
    }

    public boolean setCPUFrequency(Double CPUFrequency) {
        if (CPUFrequency <= 0) {
            return false;
        }
        this.CPUFrequency = CPUFrequency;
        return true;
    }

    public void setCPUName(String CPUName) {
        this.CPUName = CPUName;
    }

    public boolean setDisplaySize(Integer displaySize) {
        if (displaySize < 1) {
            return false;
        }
        DisplaySize = displaySize;
        return true;
    }

    public void setGraphicsCardName(String graphicsCardName) {
        GraphicsCardName = graphicsCardName;
    }

    public boolean setHDD(Integer HDD) {
        if (HDD < 1) {
            return false;
        }
        this.HDD = HDD;
        return true;
    }

    public void setHDDName(String HDDName) {
        this.HDDName = HDDName;
    }

    public boolean setMaxCPUFrequency(Double maxCPUFrequency) {
        if (maxCPUFrequency <= 0) {
            return false;
        }
        MaxCPUFrequency = maxCPUFrequency;
        return true;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean setPrice(Double price) {
        if (price <= 0) {
            return false;
        }
        this.price = price;
        return true;
    }

    public boolean setRAM(Integer RAM) {
        if (RAM < 1) {
            return false;
        }
        this.RAM = RAM;
        return true;
    }

    public boolean setSSD(Integer SSD) {
        if (SSD < 1) {
            return false;
        }
        this.SSD = SSD;
        return true;
    }

    public void setSSDName(String SSDName) {
        this.SSDName = SSDName;
    }

    public boolean setVideoMemoryCapacity(Integer videoMemoryCapacity) {
        if (videoMemoryCapacity < 1) {
            return false;
        }
        VideoMemoryCapacity = videoMemoryCapacity;
        return true;

    }

    public boolean setWeight(Double weight) {
        if (weight <= 0) {
            return false;
        }
        Weight = weight;
        return true;

    }

    public Double getCPUFrequency() {
        return CPUFrequency;
    }

    public Double getMaxCPUFrequency() {
        return MaxCPUFrequency;
    }

    public Double getPrice() {
        return price;
    }

    public Double getWeight() {
        return Weight;
    }

    public Integer getCPUCores() {
        return CPUCores;
    }

    public Integer getDisplaySize() {
        return DisplaySize;
    }

    public Integer getHDD() {
        return HDD;
    }

    public Integer getRAM() {
        return RAM;
    }

    public Integer getSSD() {
        return SSD;
    }

    public Integer getVideoMemoryCapacity() {
        return VideoMemoryCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getCPUName() {
        return CPUName;
    }

    public String getGraphicsCardName() {
        return GraphicsCardName;
    }

    public String getHDDName() {
        return HDDName;
    }

    public String getOS() {
        return OS;
    }

    public String getSSDName() {
        return SSDName;
    }
}

