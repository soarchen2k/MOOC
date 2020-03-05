package monor.week04.exercise081_PasswordRandomizer;
import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        for (int i = 0; i < length; i++) {
            password += (char) (random.nextInt(26) + 97);
        }
        return password;
    }
}
