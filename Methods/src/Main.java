public class Main {

    public static void main(String[] args) {
        Employee dmitry = new Employee(
                "Дмитрий Алeлексеев", 6567
        );
        Employee anna = new Employee(
                "Анна Потапова", "anna@smart.ru"
        );
        Employee daria = new Employee(
                "Дарья Савина",
                "daria.savina@smart.ru",
                2442

        );
        dmitry.printInfo();
        anna.printInfo();
        daria.printInfo();
    }
}

