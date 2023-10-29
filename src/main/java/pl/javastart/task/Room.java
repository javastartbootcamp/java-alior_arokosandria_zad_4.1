package pl.javastart.task;

public class Room {
    private double temperature;
    private double size;
    private boolean hasAirConditioner;
    private double minTemperature;

    public Room(double temperature, double size, boolean hasAirConditioner, double minTemperature) {
        this.temperature = temperature;
        this.size = size;
        this.hasAirConditioner = hasAirConditioner;
        this.minTemperature = minTemperature;
    }

    public boolean lowerTemperature() {
        if (hasAirConditioner == true && temperature - minTemperature > 1) {
            temperature = temperature - 1;
            return true;
        } else if (hasAirConditioner == true && temperature - minTemperature < 1 && temperature - minTemperature > 0) {
            temperature = minTemperature;
            return true;
        }
        return false;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getSize() {
        return size;
    }

    public boolean isHasAirConditioner() {
        return hasAirConditioner;
    }

    public double getMinTemperature() {
        return minTemperature;
    }
}