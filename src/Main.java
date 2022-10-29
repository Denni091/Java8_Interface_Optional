import First_Task.Feline;
import First_Task.PoisonousAnimals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Feline feline = new Feline();
        feline.animalInfo();
        feline.animalAge();
        feline.animalFood();
        PoisonousAnimals poisonousAnimals = new PoisonousAnimals();
        poisonousAnimals.animalInfo();
        poisonousAnimals.animalAge();
        poisonousAnimals.animalFood();

        WorkWithOption workWithOption = new WorkWithOption();
        workWithOption.workWithOptional("qwerty@gmail.com");
        workWithOption.workWithOptional(null);
    }
}
