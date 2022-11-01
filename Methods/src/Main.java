public class Main {

    public static void main(String[] args) {
        User dmitry = new User("Дмитрий", 45);
        printUserInfo(dmitry);

        User olga = new User("Ольга", 24);
        printUserInfo(olga);

        User alexey = new User("Алексей", 33);
        printUserInfo(alexey);
    }

    public static void printUserInfo(User user) {
        int age = user.getAge();
        String label = "";
        boolean isExclusion = (age % 100 >= 11) &&
                (age % 100 <= 14);
        int ageLastDigit = age % 10;
        if (ageLastDigit == 1) {
            label = "год";
        } else if(ageLastDigit == 0 ||
                ageLastDigit >= 5 && ageLastDigit <= 9) {
            label = "лет";
        } else if(ageLastDigit >= 2 && ageLastDigit <= 4) {
            label = "года";
        }
        if (isExclusion) {
            label = "лет";
        }

        System.out.println("Пользователь: " + user.getName() +
                ", " + age + " " + label);
    }
}
