package gui;

public class Laptop {

    // variables
    private String brand;
    private String model;
    private String type;
    private double price;
    private int qualityRating;
    private String cpuBrand;
    private String cpuType;
    private String cpuModel;
    private int cpuCores;
    private double cpuSpeed;
    private int speedRating;
    private int memory;
    private int storage;
    private int memoryRating;
    private String gpuBrand;
    private String gpuModel;
    private String connectivity;
    private String operatingSystem;
    private double displaySize;
    private String resolution;
    private boolean touchscreen;
    private double weight;
    private int portabilityRating;
    private String hyperlink;
    private int score;

    public Laptop(String brand, String model, String type, double price, int qualityRating, String cpuBrand,
            String cpuType, String cpuModel, int cpuCores, double cpuSpeed, int speedRating, int memory, int storage,
            int memoryRating, String gpuBrand, String gpuModel, String connectivity, String operatingSystem,
            double displaySize, String resolution, boolean touchscreen, double weight, int portabilityRating,
            String hyperlink, int score) {

        // assignments
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.qualityRating = qualityRating;
        this.cpuBrand = cpuBrand;
        this.cpuType = cpuType;
        this.cpuModel = cpuModel;
        this.cpuCores = cpuCores;
        this.cpuSpeed = cpuSpeed;
        this.speedRating = speedRating;
        this.memory = memory;
        this.storage = storage;
        this.memoryRating = memoryRating;
        this.gpuBrand = gpuBrand;
        this.gpuModel = gpuModel;
        this.connectivity = connectivity;
        this.operatingSystem = operatingSystem;
        this.displaySize = displaySize;
        this.resolution = resolution;
        this.touchscreen = touchscreen;
        this.weight = weight;
        this.portabilityRating = portabilityRating;
        this.hyperlink = hyperlink;
        this.score = score;
    }

    // getters + setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQualityRating() {
        return qualityRating;
    }

    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public String getCpuType() {
        return cpuType;
    }

    public void setCpuType(String cpuType) {
        this.cpuType = cpuType;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(int speedRating) {
        this.speedRating = speedRating;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getMemoryRating() {
        return memoryRating;
    }

    public void setMemoryRating(int memoryRating) {
        this.memoryRating = memoryRating;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPortabilityRating() {
        return portabilityRating;
    }

    public void setPortabilityRating(int portabilityRating) {
        this.portabilityRating = portabilityRating;
    }

    public String getHyperlink() {
        return hyperlink;
    }

    public void setHyperlink(String hyperlink) {
        this.hyperlink = hyperlink;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
