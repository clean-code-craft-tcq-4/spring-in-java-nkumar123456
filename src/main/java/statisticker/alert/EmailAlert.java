package statisticker.alert;

public class EmailAlert implements IAlerter {

    public boolean emailSent;

    @Override
    public void sendAlert() {
        this.emailSent = true;
    }
}
