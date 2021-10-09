import java.util.Arrays;

public class Args {

    private final String CIPHER_MODE;
    private final String TEXT;
    private final String CIPHER_TYPE;
    private final String[] ARGS;

    public Args(String[] args) {
        this.CIPHER_MODE=args[0];
        this.TEXT=args[1];
        this.CIPHER_TYPE=args[2];
        this.ARGS= Arrays.copyOfRange(args, 3, args.length);
    }

    public String getCIPHER_MODE() {
        return CIPHER_MODE;
    }

    public String getTEXT() {
        return TEXT;
    }

    public String getCIPHER_TYPE() {
        return CIPHER_TYPE;
    }

    public String[] getARGS() {
        return ARGS;
    }
}
