public class CurrentConditionDisplay implements DisplayElement,Observer{
    private float temperature;
    private float humidity;
    private WeatherDataObservable weatherDataObservable;
    public CurrentConditionDisplay(WeatherDataObservable weatherDataObservable){
        this.weatherDataObservable=weatherDataObservable;
        weatherDataObservable.registerObserver((Observer) this);
    }

    @Override
    public void display() {
        System.out.println("Current condiyion: "+temperature+" F degrress and "
                +humidity+"% humidity");
    }




    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}