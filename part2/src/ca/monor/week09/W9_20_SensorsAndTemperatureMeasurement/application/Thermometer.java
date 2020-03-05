package ca.monor.Week09.W9_20_SensorsAndTemperatureMeasurement.application;
/**
 * 生产一个温度计
 */

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn = false;  //题目要求温度计初始状态是关闭
    private Random random = new Random();

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;
    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        return random.nextInt(61) - 30;  //返回 -30 ~ 30之间的一个温度值
    }
}
