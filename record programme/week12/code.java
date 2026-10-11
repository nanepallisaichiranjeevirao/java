class Reservation {

    private int seats = 100;

    // Synchronized method
    synchronized void reserve(String person, int seatsRequired) {

        System.out.println(person + " is trying to book "
                           + seatsRequired + " seats.");

        if (seatsRequired <= seats) {

            System.out.println(person + " is booking seats...");

            seats = seats - seatsRequired;

            System.out.println(person + " successfully booked "
                               + seatsRequired + " seats.");

            System.out.println("Seats remaining: " + seats);

        } else {

            System.out.println(person
                               + " - Not enough seats available.");
        }

        System.out.println();
    }
}

class Person extends Thread {

    Reservation reservation;
    String personName;
    int seatsRequired;

    Person(Reservation reservation, String personName,
           int seatsRequired) {

        this.reservation = reservation;
        this.personName = personName;
        this.seatsRequired = seatsRequired;
    }

    public void run() {
        reservation.reserve(personName, seatsRequired);
    }
}

public class MultiThreading {

    public static void main(String[] args) {

        Reservation reservation = new Reservation();

        Person p1 = new Person(reservation, "Person 1", 40);
        Person p2 = new Person(reservation, "Person 2", 30);
        Person p3 = new Person(reservation, "Person 3", 20);
        Person p4 = new Person(reservation, "Person 4", 25);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
