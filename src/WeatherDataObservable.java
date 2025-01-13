import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservable implements SubjectObservable{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable(){
        observers =new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }

    }
    public void measurementsChanged(){
        notifyObserver();

    }
    //testing method to set measurements
    public void SetMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }

}
