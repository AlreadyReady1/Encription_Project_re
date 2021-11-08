import java.util.Arrays;

public class Args {

    private final String CIPHER_MODE;
    private final String TEXT;
    private final String CIPHER_TYPE;
    private final String[] ARGS;

    public Args(String[] args) {
        this.CIPHER_MODE = args[0];
        this.TEXT = args[1];
        this.CIPHER_TYPE = args[2];
        this.ARGS = Arrays.copyOfRange(args, 3, args.length);
    }

    public String cipherMode() {
        return CIPHER_MODE;
    }

    public String text() {
        return TEXT;
    }

    public String cipherType() {
        return CIPHER_TYPE;
    }

    public String[] options() {
        return ARGS;
    }
}