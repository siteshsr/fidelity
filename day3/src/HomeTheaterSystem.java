public class HomeTheaterSystem extends SmartTv{
    boolean surroundSound;
    boolean subwoofer;
    public HomeTheaterSystem(String brand,String model,int yearOfManufacture,int screenSize,String smartFeatures,boolean surroundSound,boolean subwoofer) {
        super(brand,model,yearOfManufacture,screenSize,smartFeatures);
        this.surroundSound = surroundSound;
        this.subwoofer = subwoofer;
    }
    public void adjustBass(){
        System.out.println("Adjust Bass in the home theater system");
    }
    public void adjustTreble(){
        System.out.println("Adjust Treble in the home theater system");
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Surround Sound: " + (surroundSound ? "YES" : "NO")+", Subwoofer: " + (subwoofer ? "YES" : "NO"));

    }
}
