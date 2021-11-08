public class CipherCesar {
    static Logger logger= new Logger("Launcher");
    private final CipherCesarForEnglish englishCaesar = new CipherCesarForEnglish();
    private final CipherCesarForRussian russianCaesar = new CipherCesarForRussian();

    public String encrypt(Args args) {
        String language = args.options()[0];
        switch (language) {
            case Launcher.ENGLISH_LANGUAGE: {
                logger.logg("Выбран англлийский язык");
                return englishCaesar.encryptCesarEnglish(args);
            }
            case Launcher.RUSSIAN_LANGUAGE: {
                logger.logg("Выбран русский язык");
                return russianCaesar.encryptCesarRussian(args);
            }
            default: {
                throw new UnsupportedOperationException("Неизвестный язык: " + args.options()[2]);
            }
        }
    }

    public String decrypt(Args args) {
        String language = args.options()[0];
        switch (language) {
            case Launcher.ENGLISH_LANGUAGE: {
                logger.logg("Выбран англлийский язык");
                return englishCaesar.encryptCesarEnglish(args);
            }
            case Launcher.RUSSIAN_LANGUAGE: {
                logger.logg("Выбран русский язык");
                return russianCaesar.encryptCesarRussian(args);
            }
            default: {
                throw new UnsupportedOperationException("Неизвестный язык: " + args.options()[2]);
            }
        }
    }
}