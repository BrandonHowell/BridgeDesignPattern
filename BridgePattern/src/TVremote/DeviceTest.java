package TVremote;

public class DeviceTest {
    public static void main(String[] args){
        RemoteButton TV = new TVRemoteMute(new TVDevice(1, 200));
        RemoteButton TV2 = new TVRemotePause(new TVDevice(1, 200));
        RemoteButton DVD = new DVDRemote(new DVDDevice(1,14));

        System.out.println("Test TV with Mute");

        TV.buttonFivePressed();
        TV.buttonSixPressed();
        TV.buttonNinePressed();
        TV.deviceFeedback();

        System.out.println("\nTest TV with Pause");

        TV2.buttonFivePressed();
        TV2.buttonSixPressed();
        TV2.buttonNinePressed();
        TV2.deviceFeedback();

        System.out.println("\nTest DVD");

        DVD.buttonFivePressed();
        DVD.buttonSixPressed();
        DVD.buttonNinePressed();
        DVD.buttonNinePressed();
    }
}
