package TVremote;

public abstract class RemoteButton {

    private EntertainmentDevice device;

    public RemoteButton(EntertainmentDevice newDevice){
        device = newDevice;
    }

    public void buttonFivePressed() {
        device.buttonFivePressed();
    }

    public void buttonSixPressed() {
        device.buttonSixPressed();
    }

    public void deviceFeedback() {
        device.deviceFeedback();
    }

    public abstract void buttonNinePressed();

}
