public class Main {
    public static void main(String[] args) {
        int volime = 1200;
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0;
        int hours = 0;

        while (currentVolume <= volime){
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            hours = hours +1;
            if(currentVolume >= volime)
                break;
        }
        System.out.println(hours);
    }
}