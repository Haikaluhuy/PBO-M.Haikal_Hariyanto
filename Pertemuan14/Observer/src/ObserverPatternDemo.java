

import java.util.ArrayList;
import java.util.List;


interface Observer {
    void update(String berita);
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}

class AgensiBerita implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String berita;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(berita);
        }
    }

    public void setBerita(String berita) {
        this.berita = berita;
        notifyObservers();
    }
}

class SaluranBerita implements Observer {
    private String nama;

    public SaluranBerita(String nama) {
        this.nama = nama;
    }

    @Override
    public void update(String berita) {
        System.out.println(nama + " menerima berita: " + berita);
    }
}

public class ObserverPatternDemo {
    public static void main(String[] args) {
        AgensiBerita agensiBerita = new AgensiBerita();


        SaluranBerita metro = new SaluranBerita("MetroTV");
        SaluranBerita kompas = new SaluranBerita("KompasTV");
        

        agensiBerita.attach(metro);
        agensiBerita.attach(kompas);


        System.out.println("Mengirim berita pertama:");
        agensiBerita.setBerita("Breaking News: Java adalah bahasa pemrograman populer!");

        agensiBerita.detach(metro);
        
        System.out.println("\nMengirim berita kedua setelah MetroTV berhenti berlangganan:");
        agensiBerita.setBerita("Update: Spring Framework sangat membantu development Java!");
    }
}