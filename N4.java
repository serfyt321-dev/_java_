interface User {
    void handleCredentials(String login, String password);
}

abstract class People implements User {
    protected String fullName;
    protected int age;
    protected String position;

    public People(String fullName, int age, String position) {
        this.fullName = fullName;
        this.age = age;
        this.position = position;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + fullName + " | Возраст: " + age + " | Должность: " + position);
    }
}

class Teacher extends People {
    public Teacher(String fullName, int age, String position) {
        super(fullName, age, position);
    }

    @Override
    public void handleCredentials(String login, String password) {
        System.out.println("Преподаватель " + fullName + " вошел в систему под логином: " + login);
    }
}

class Student extends People {
    public Student(String fullName, int age, String position) {
        super(fullName, age, position);
    }

    @Override
    public void handleCredentials(String login, String password) {
        System.out.println("Студент " + fullName + " авторизован. Логин: " + login);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Александров А. А.", 45, "Профессор");
        Teacher teacher2 = new Teacher("Борисов Б. Б.", 32, "Доцент");

        Student student1 = new Student("Николаев Н. Н.", 20, "Староста");
        Student student2 = new Student("Сергеев С. С.", 19, "Студент");

        System.out.println("--- Информация о пользователях ---");
        teacher1.displayInfo();
        teacher2.displayInfo();
        student1.displayInfo();
        student2.displayInfo();

        System.out.println("\n--- Авторизация пользователей ---");
        teacher1.handleCredentials("alex_prof", "pass123");
        teacher2.handleCredentials("boris_doc", "qwerty");
        student1.handleCredentials("nikola_star", "stud2026");
        student2.handleCredentials("serg_99", "my_secret");
    }
}