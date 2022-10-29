package First_Task;

public interface SpiderInfo {

    default void animalInfo() {

        System.out.println("Some information about spider: Spiders are air-breathing arthropods that have eight legs\n" +
                "------------------------------");
    }

    static void animalSize() {

        System.out.println("Spider size approximately: 0.5 to about 90 mm");
    }

    void animalAge();

    void animalFood();
}
