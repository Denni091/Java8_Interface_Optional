import java.util.Optional;

public class WorkWithOption {
    public Optional<String> workWithOptional(String string) {
        Optional<String> optionalForString = Optional.ofNullable(string);
        String email = "qwerty@gmail.com";

        if (string == null){
            System.out.println(optionalForString.get());
        } else if (string.equals(email)){
            System.out.println(optionalForString.get());
        }
        return Optional.of(string);
    }
}
