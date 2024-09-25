import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      while(true) {
          System.out.print("Choose device to interact with:");
          System.out.println("1.Basic Media Player");
          System.out.println("2.Smart Tv");
          System.out.println("3.home theater system");
          System.out.println("4.Exit");
          int choice = scanner.nextInt();
          switch(choice) {
              case 1:BasicMediaPlayer mediaPlayer=new BasicMediaPlayer("Sony","XYZ-100",2022,"MP3,AVI");
              mediaPlayer.play();
              mediaPlayer.displayInfo();
              break;
              case 2:SmartTv smartTv=new SmartTv("LG","123-SMART",2023,55,"Youtube,Netflix");
              smartTv.displayInfo();
              smartTv.adjustVolume();
              smartTv.changeChannel();
              break;
              case 3:HomeTheaterSystem homeTheaterSystem=new HomeTheaterSystem("samsung","HTS-5000",2022,75,"Amazon Prime",true,true);
              homeTheaterSystem.displayInfo();
              homeTheaterSystem.adjustVolume();
              homeTheaterSystem.changeChannel();
              homeTheaterSystem.adjustBass();
              homeTheaterSystem.adjustTreble();
              break;
              case 4:System.out.println("Exit");
              System.exit(0);
              default:System.out.println("Invalid choice");
          }
      }
        }
    }
