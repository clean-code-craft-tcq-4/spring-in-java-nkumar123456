package statisticker.alert;

public class LEDAlert implements  IAlerter{

    public boolean ledGlows;

    @Override
    public void sendAlert() {
        this.ledGlows = true;
    }

}
