public class MultimediaDevice {
    String brand;
    String model;
    int yearOfManufacture;
    public MultimediaDevice(String brand, String model, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }
    public void displayInfo(){
        System.out.println("Brand: " + brand + "Model: " + model + "Year of Manufacture: " + yearOfManufacture);
    }
}
