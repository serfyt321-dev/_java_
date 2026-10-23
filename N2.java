class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    public Reader(String fullName, int ticketNumber, String faculty, String birthDate, String phone) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void takeBook(int count) {
        System.out.println(this.fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... bookNames) {
        System.out.print(this.fullName + " взял книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void returnBook(int count) {
        System.out.println(this.fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookNames) {
        System.out.print(this.fullName + " вернул книги: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Петров В. В.", 101, "ИВТ", "12.05.2005", "+79991112233");
        readers[1] = new Reader("Иванов И. И.", 102, "Экономический", "23.08.2004", "+79994445566");
        readers[2] = new Reader("Сидоров С. С.", 103, "Юридический", "01.01.2005", "+79997778899");

        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");

        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");

        System.out.println("\n--- Проверка для других читателей из массива ---");
        readers[1].takeBook(2);
        readers[2].returnBook("Философия");
    }
}