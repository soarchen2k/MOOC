package monor.week04.c22_RandomnessDemo;

import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = random;
    }

    public String forecastWeather() {
        double probability = random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) {
            return "Snow";
        } else {
            return "Sunny";
        }
    }

    public int forecastTemperature() {
        return (int) (4 * this.random.nextGaussian() - 3);
    }
}
