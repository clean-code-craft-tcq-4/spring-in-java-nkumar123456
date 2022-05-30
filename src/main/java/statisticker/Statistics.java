package statisticker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        Float avg;
        Float max;
        Float min;
        Statistics.Stats testStats = new Stats();

        if(Objects.isNull(numbers)  || numbers.size() == 0 ) {
           avg = Float.NaN;
           max = Float.NaN;
           min = Float.NaN;
        } else {
            //find avg of float array
            Float total = 0.0f;
            for (Float value : numbers) {
                total += value;
            }
            avg = total / numbers.size();

            //find max of float array
            max = Collections.max(numbers);

            //find min of float array
            min = Collections.min(numbers);
        }
        //set below one by one
        testStats.setAverage(avg);
        testStats.setMax(max);
        testStats.setMin(min);

        return testStats;
    }


    public static class Stats{
        private float average;
        private float min;
        private float max;

        public float getAverage() {
            return average;
        }

        public void setAverage(float average) {
            this.average = average;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }
    }
}
