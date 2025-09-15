public class PasswordGenerator {
    private int numberOfDigits;
    private String passwordPrefix;
    private static int numberOfPasswords = 0;

    public PasswordGenerator(int numDigits, String prefix) {
        numberOfDigits = numDigits;
        passwordPrefix = prefix;
    }

    public PasswordGenerator(int numDigits) {
        numberOfDigits = numDigits;
        passwordPrefix = "A";
    }

    public String pwGen() {
        String password = passwordPrefix + ".";
        for(int i = 0; i < numberOfDigits; i++) {
            password += (int)(Math.random() * 10);
        }
        numberOfPasswords++;
        return password;
    }

    public int pwCount() {
        return numberOfPasswords;
    }
}