//написать код Цезаря так чтобы он работал на русском и английском
// и задавался по ключевой команде
// + возможность менять величину сдвига
//unicode для русского 1040-большие,1078-маленькие буквы (modul=32)
//unicode для английского 65-большие,97-маленькие буквы (modul=26)

public class Launcher {

    public static final String ENCRIPT = "-en";
    public static final String DECRIPT = "-de";
    public static final String RUSSIAN_LANGUAGE = "-rl";
    public static final String ENGLISH_LANGUAGE = "-el";


    public static void main(String[] commandLineArgs) {
        Args args = new Args(commandLineArgs);
        System.out.println("Введена строка " + "<< "+ args.getTEXT() +"  >>");
        if (args.getCIPHER_MODE().equalsIgnoreCase(ENCRIPT)) {
            encript(args);
        }
        if (args.getCIPHER_MODE().equalsIgnoreCase(DECRIPT)) {
            decript(commandLineArgs, "asd");
        }
    }

    private static void encript(Args args) {
        System.out.println("Выбранный режим - режим шифрования");
        CipherCesar caesar = new CipherCesar();
        String result = caesar.encrypt(args);
        System.out.println("Строка << "+args[1]+" >> После шифрования примет следующий вид: "+"<< "+result+" >>");
    }

    private static void decript(String[] args, String text) {
        System.out.println("Выбранный режим - режим дешифрования");
        int keyForDecript = Integer.parseInt(args[2]);
        System.out.println("Ключ = " + keyForDecript);
        if (args[1].equalsIgnoreCase(RUSSIAN_LANGUAGE)) {
            System.out.println("Выбран русский язык");
            CipherCesarForRussian.decriptCesarRussian(text, keyForDecript);
        }
        if (args[1].equalsIgnoreCase(ENGLISH_LANGUAGE)) {
            System.out.println("Выбран англлийский язык");
            CipherCesarForEnglish.decryptCesarEnglish(text, keyForDecript);// Вызываем метод дешифрования
        }
    }
}

