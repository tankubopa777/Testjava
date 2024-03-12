package SF211FinalPractice.src.Q1;

import java.util.Objects;

/* WeatherForecast Class */
class WeatherForecast{
    private double temperature;
    private String skyCondition;

    public WeatherForecast(double temperature, String skyCondition) {
        if (temperature < -50 || temperature > 150){
            this.temperature = 70;
            this.skyCondition = "sunny";
        } else {
            this.temperature = temperature;
            this.skyCondition = skyCondition;
        }
    }
    public double getTemperature() {
        return temperature;
    }

    public WeatherForecast setTemperature(double temperature) {
        this.temperature = temperature;
        return this;
    }

    public String getSky() {
        return skyCondition;
    }

    public WeatherForecast setSky(String skyCondition) {
        this.skyCondition = skyCondition;
        return this;
    }

    public double fahrenheitToCelsius(){
        return ((temperature - 32)*5)/9;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherForecast that = (WeatherForecast) o;
        return Double.compare(that.temperature, temperature) == 0 && Objects.equals(skyCondition, that.skyCondition);
    }

    public boolean isConsistent(){
        if(temperature > 32 && skyCondition.equals("snowy")){
            return false;
        }else if (temperature < 32 && skyCondition.equals("rainy")){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Temperature is " + temperature +
                " Sky condition is " + skyCondition ;
    }
}

