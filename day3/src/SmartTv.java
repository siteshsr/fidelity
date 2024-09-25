public class SmartTv extends MultimediaDevice{
    int screenSize;
    String smartFeatures;
    public SmartTv(String brand,String model,int yearOfManufactured,int screenSize,String smartFeatures){
        super(brand,model,yearOfManufactured);
        this.screenSize = screenSize;
        this.smartFeatures = smartFeatures;
    }
    public void adjustVolume(){
        System.out.println("Adjusting volume on the smart tv:");
    }
    public void changeChannel(){
        System.out.println("Changing channel on the smart tv:");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size: "+screenSize + "inches,Smart features: "+smartFeatures);
    }
}
