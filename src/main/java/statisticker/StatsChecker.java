package statisticker;

import statisticker.alert.IAlerter;


public class StatsChecker {

    private float maxThreshold;
    private IAlerter alerters[];

    public StatsChecker(float maxThreshold, IAlerter alerters[]) {
        this.maxThreshold = maxThreshold;
        this.alerters = alerters;
    }

    public void checkAndAlert(Float[] numbers) {

        for (Float numbr : numbers) {
            if (numbr > this.maxThreshold) {
                this.alerters[0].sendAlert();
                this.alerters[1].sendAlert();
            }
            }

        }


}
