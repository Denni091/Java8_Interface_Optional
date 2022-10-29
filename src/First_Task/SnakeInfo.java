public interface SnakeInfo {

    default void animalInfo() {

        System.out.println("Some information about snake: Snakes are elongated, limbless, carnivorous reptiles.\n");
    }

    static void animalSize() {

        System.out.println("Snake size approximately: 10.4 cm-long");
    }

    void animalAge();

    void animalFood();
}
