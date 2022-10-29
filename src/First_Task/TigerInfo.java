public interface TigerInfo {

    default void animalInfo() {

        System.out.println("Some information about Tiger: The tiger (Panthera tigris) is the largest living cat species\n" +
                "------------------------------");
    }

    static void animalSize() {

        System.out.println("Spider size approximately: 80 – 110 cm");
    }

    void animalAge();

    void animalFood();
}
