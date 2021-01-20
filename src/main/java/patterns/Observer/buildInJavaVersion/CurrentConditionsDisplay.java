package patterns.Observer.buildInJavaVersion;



import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) arg;
            this.humidity = weatherData.getHumidity();
            this.temperature = weatherData.getTemperature();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current conditions:  " + temperature + "F degrees and " + humidity + "% humidity");


    }
}
