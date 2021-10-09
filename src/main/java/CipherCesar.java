import java.util.Arrays;

public class CipherCesar {

    private final CipherCesarForEnglish englishCaesar = new CipherCesarForEnglish();
    private final CipherCesarForRussian russianCaesar = new CipherCesarForRussian();

    public String encrypt(Args args){
        String language = args.getARGS()[0];
        switch (language){
            case Launcher.ENGLISH_LANGUAGE:{
                System.out.println("Выбран русский язык");
                return englishCaesar.encryptCesarEnglish(args);
            }
            case Launcher.RUSSIAN_LANGUAGE:{
                System.out.println("Выбран англлийский язык");
                return russianCaesar.encriptCesarRussian(args);
            }
            default: {
                throw new UnsupportedOperationException("Неизвестный язык: "+args[2]);
            }
        }
    }
}
