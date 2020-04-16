package ca.monor.week09.W9_20_SensorsAndTemperatureMeasurement;

/**
 * 定义传感器接口
 */
public interface Sensor {
    boolean isOn();  // returns true if the sensor is on  判断传感器是否开启
    void on();       // switches the sensor on  开启传感器
    void off();      // switches the sensor off  关闭传感器
    int measure();  // returns the sensor reading if the sensor is on  判断传感器是否开启，开启则返回数值，否则就报错
    // if the sensor is off, it throws an IllegalStateException

}