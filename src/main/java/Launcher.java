import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Launcher {

    public static final String ENCRIPT = "-en";
    public static final String DECRIPT = "-de";
    public static final String RUSSIAN_LANGUAGE = "-rl";
    public static final String ENGLISH_LANGUAGE = "-el";

    static Logger logger= new Logger("Launcher");

    public static void main(String[] commandLineArgs) {



        Args args = new Args(commandLineArgs);

        logger.logg("Введена строка \"" + args.text() + "\"");

       // System.out.println("Введена строка \"" + args.text() + "\"");

        if (args.cipherMode().equalsIgnoreCase(ENCRIPT)) {
            encrypt(args);
        }
        if (args.cipherMode().equalsIgnoreCase(DECRIPT)) {
            decrypt(args);
        }


    }

    private static void encrypt(Args args) {
        logger.logg("Выбранный режим - \"режим шифрования\"");
        CipherCesar caesar = new CipherCesar();
        String resultEncrypt = caesar.encrypt(args);

//        MatrixPermutation x =new MatrixPermutation();///////////////////
//        String res = x.encryptPer(args);///////////////////////////////

        logger.logg("Строка \"" + args.text() + "\" После шифрования примет следующий вид: \"" + resultEncrypt + "\"");
//        System.out.println("Строка \"" + args.text() + "\" После шифрования примет следующий вид: \"" + res + "\"");/////////////////////////////

        PairwiseSwap per = new PairwiseSwap();
        per.permutation(args);
    }

    private static void decrypt(Args args) {
        logger.logg("Выбранный режим - \"режим дешифрования\"");
        CipherCesar caesar = new CipherCesar();
        String resultDecrypt = caesar.decrypt(args);
        logger.logg("Строка \"" + args.text() + "\" После дешифрования примет следующий вид: \""  + resultDecrypt + "\"");
    }


}