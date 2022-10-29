import java.util.Random;

public class PoisonousAnimals implements SnakeInfo, SpiderInfo {

    @Override
    public void animalInfo() {
        SnakeInfo.super.animalInfo();
    }

    @Override
    public void animalAge() {
        Random random = new Random();
        int randomAge = random.nextInt(15);

        if (randomAge >= 7) {
            System.out.println("High chance that the animal will not be able to live");
        } else {
            System.out.println("The animal maybe lives");
        }
    }

    @Override
    public void animalFood() {
        System.out.println("Animals love to eat meat.");
    }
}
