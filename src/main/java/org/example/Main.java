import org.example.Validator;

public class Main {
    public static void main(String[] args) {
        String s = String.format(" Число: %d", 12);
        System.out.println(s);

        {
            boolean result = Validator.validate("teSt_1234", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            if (result) {
                System.out.println("Логин и пароль корректные");
            } else {
                System.out.println("Логин и/или пароль некорректные");
            }
        }
    }
}


