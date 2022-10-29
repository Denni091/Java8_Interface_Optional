package First_Task;

import java.util.Random;

public class Feline implements CatInfo, TigerInfo {
    @Override
    public void animalInfo() {
        CatInfo.super.animalInfo();
    }

    @Override
    public void animalAge() {
        Random random = new Random();
        int randomAge = random.nextInt(30);
        if (randomAge >= 15) {
            System.out.println("High chance that the animal will not be able to live");
        } else {
            System.out.println("The animal lives");
        }
    }

    @Override
    public void animalFood() {
        System.out.println("Animals love to eat meat.\n" +
                "------------------------------");
    }

}
