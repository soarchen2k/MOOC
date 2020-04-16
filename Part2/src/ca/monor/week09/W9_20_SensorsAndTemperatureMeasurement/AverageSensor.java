package ca.monor.week09.W9_20_SensorsAndTemperatureMeasurement;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensorList = new ArrayList<Sensor>();
    private List<Integer> readings = new ArrayList<Integer>();
    public List<Integer> readings() {
        return readings;
    }

    public void addSensor(Sensor additional) {
        this.sensorList.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : this.sensorList) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor s :
                this.sensorList) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s :
                this.sensorList) {
            s.off();
        }
    }

    @Override
    public int measure() {
        int totalTemperature = 0;
        if (!this.isOn() || this.sensorList.isEmpty()) {
            throw new IllegalStateException();
        } else {
            for (Sensor s :
                    sensorList) {
                totalTemperature += s.measure();
            }
        }
        this.readings.add(totalTemperature / this.sensorList.size());
        return totalTemperature / this.sensorList.size();
    }
}