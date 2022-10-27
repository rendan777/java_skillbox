public class Main {

    public static void main(String[] args) {
        int max = max(300, 200);
        System.out.println(max);
    }
    static int max(int a, int b) {
        return a>=b ? a : b;
    }
}