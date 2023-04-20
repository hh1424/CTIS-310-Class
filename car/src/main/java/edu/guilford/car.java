package edu.guilford;

public class car {
    
    //Attributes
    private String make;
    private String model;
    private String trim;
    private int year;
    private String bodyStyle;
    private double price;
    private String color;
    private String vin;
    private String engine;
    private int mileage;
    private String transmission;
    private String driveTrain;
    private String licensePlate;
    private String owner;
    // private String ownerPhone;
    // private String ownerEmail;
    // private String ownerAddress;
    // private String ownerCity;
    // private String ownerState;
    // private String ownerZip;
    
    //Constructors
    // public car() {
    //     make = "Ford";
    //     model = "F-150";
    //     trim = "XLT";
    //     year = 2018;
    //     bodyStyle = "Truck";
    //     price = 30000.00;
    //     color = "White";
    //     vin = "1FTFW1ET2JFA12345";
    //     engine = "5.0L V8";
    //     mileage = 0;
    //     transmission = "Automatic";
    //     driveTrain = "4WD";
    //     licensePlate = "ABC123";
    //     owner = "John Doe";
    //     // ownerPhone = "555-555-5555";
    //     // ownerEmail = "jdoe@mail.com";
    // }

    public car(String make, String model, String trim, int year, String bodyStyle, double price, String color, String vin, String engine, int mileage, String transmission, String driveTrain, String licensePlate, String owner) {
        this.make = make;
        this.model = model;
        this.trim = trim;
        this.year = year;
        this.bodyStyle = bodyStyle;
        this.price = price;
        this.color = color;
        this.vin = vin;
        this.engine = engine;
        this.mileage = mileage;
        this.transmission = transmission;
        this.driveTrain = driveTrain;
        this.licensePlate = licensePlate;
        this.owner = owner;
        // this.ownerPhone = ownerPhone;
        // this.ownerEmail = ownerEmail;
        // this.ownerAddress = ownerAddress;
        // this.ownerCity = ownerCity;
        // this.ownerState = ownerState;
        // this.ownerZip = ownerZip;
    }

    //Getters and Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDriveTrain() {
        return driveTrain;
    }

    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // public toString() {
    //     return "Make: " + make + "Model: " + model + "Trim: " + trim + "Year: " + year + 
    //     "Body Style: " + bodyStyle + "Price: " + price + "Color: " + color + "VIN: " + vin + 
    //     "Engine: " + engine + "Mileage: " + mileage + "Transmission: " + transmission + 
    //     "Drive Train: " + driveTrain + "License Plate: " + licensePlate + "Owner: " + owner;
    // }

}
