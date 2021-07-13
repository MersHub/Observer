import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{

    List<String> vacancies = new ArrayList<>();
    List<Observer> observers = new ArrayList<>();

    public void addVacancies(String vacancies){
        this.vacancies.add(vacancies);
        notifyObserveds();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObserveds();
    }

    @Override
    public void addObserved(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserved(Observer observer) {

        this.observers.remove(observer);
    }

    @Override
    public void notifyObserveds() {

        for (Observer observed: observers){

            observed.handleEvent(this.vacancies);
        }
    }

}
