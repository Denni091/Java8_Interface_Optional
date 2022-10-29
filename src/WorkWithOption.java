import java.util.Optional;

public class Helper {


    public static void workWithOptional(String string) {

//        Optional<String> optional = Optional.ofNullable(string);
////        Optional optional = Optional.ofNullable(string);
//        if (string == null) {
//
//        }
//        if (string.equals("email")) {
//            Optional.of(string);
//        }
//        return optional;

        if (string.equals("email")){
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
