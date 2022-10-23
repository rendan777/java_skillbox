public class Main {
    public static void main(String[] args) {
        int vasyaAge = 33;
        int katyaAge = 22;
        int mishaAge = 14;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        // find maximal age
        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= vasyaAge && mishaAge >= katyaAge) {
            max = mishaAge;
        }

        // find minimal age
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
            min = mishaAge;
        }

        // find middle age
        if ((vasyaAge >= katyaAge && vasyaAge <= mishaAge) || (vasyaAge <= katyaAge && vasyaAge >= mishaAge)) {
            middle = vasyaAge;
        }
        if ((katyaAge >= vasyaAge && katyaAge <= mishaAge) || (katyaAge <= vasyaAge && katyaAge >= mishaAge)) {
            middle = katyaAge;
        }
        if ((mishaAge >= katyaAge && mishaAge <= vasyaAge) || (mishaAge <= katyaAge && mishaAge >= vasyaAge)) {
            middle = mishaAge;
        }


        //out in console Minimal, Maximal and Middle age
        System.out.println("Minimal age:" + min);
        System.out.println("Middle age:" + middle);
        System.out.println("Maximal age:" + max);
    }
}
