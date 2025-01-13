//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WeatherApp {
    public static void main(String[] args) {
        WeatherDataObservable weatherDataObservable=new WeatherDataObservable();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherDataObservable);
        weatherDataObservable.SetMeasurements(80,65,30.4f);
        weatherDataObservable.SetMeasurements(90,65,30.4f);
    }
}