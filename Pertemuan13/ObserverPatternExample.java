import java.util.ArrayList;
import java.util.List;

// Subject Class
abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer); // Add observer to the list
    }

    public void detach(Observer observer) {
        observers.remove(observer); // Remove observer from the list
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this); // Notify all observers about state change
        }
    }
}

// Concrete Subject Class
class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(); // Notify observers when state changes
    }
}

// Observer Interface
interface Observer {
    void update(Subject subject); // Method to update the state
}

// Concrete Observer Class
class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        // React to the state change of the subject
        System.out.println(name + ": State changed to: " + ((ConcreteSubject) subject).getState());
    }
}

// Main Class with Example Usage
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Create the subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        // Attach observers to the subject
        subject.attach(observer1);
        subject.attach(observer2);

        // Change state and notify observers
        System.out.println("Setting state to 'Active'");
        subject.setState("Active");

        System.out.println("\nSetting state to 'Inactive'");
        subject.setState("Inactive");

        // Detach an observer and update state
        System.out.println("\nDetaching Observer 1 and setting state to 'Idle'");
        subject.detach(observer1);
        subject.setState("Idle");
    }
}
