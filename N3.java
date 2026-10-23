class Human {
    private String name;
    private String lastName;
    private int birthYear;

    public Human(String name, String lastName, int birthYear) {
        this.name = name;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Человек: " + name + " " + lastName + ", Год рождения: " + birthYear);
    }

    public void readAboutCar(Book book, Car car) {
        System.out.println(this.name + " читает книгу \"" + book.getTitle() +
                "\" про машину \"" + car.getBrand() + "\".");
    }
}

class Car {
    private String brand;
    private int releaseYear;
    private double engineVolume;

    public Car(String brand, int releaseYear, double engineVolume) {
        this.brand = brand;
        this.releaseYear = releaseYear;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Автомобиль: " + brand + ", Год выпуска: " + releaseYear + ", Объем двигателя: " + engineVolume + "л");
    }
}

class Book {
    private String title;
    private String author;
    private int releaseYear;

    public Book(String title, String author, int releaseYear) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void printInfo() {
        System.out.println("Книга: \"" + title + "\", Автор: " + author + ", Год издания: " + releaseYear);
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иван", "Иванов", 1995);
        Car car = new Car("BMW", 2021, 3.0);
        Book book = new Book("История скорости", "Д. Смит", 2023);

        human.printInfo();
        car.printInfo();
        book.printInfo();

        System.out.println("\n--- Вызов связывающего метода ---");
        human.readAboutCar(book, car);
    }
}