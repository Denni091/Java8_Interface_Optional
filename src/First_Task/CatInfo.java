public interface CatInfo {

    default void animalInfo() {

        System.out.println("Some information about cat: is a domestic species of small carnivorous mammal.\n");
    }

    static void animalSize() {
        System.out.println("Cat size approximately: 23-25 cm");
    }

    void animalAge();

    void animalFood();
}
