public class CipherCesarForEnglish {

    public String encryptCesarEnglish(Args args) {
        // Зашифровать
        String str = args.text();
        int offset = Integer.parseInt(args.options()[1]);
        String encriptEnglishText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')// Если символ в строке строчный
            {
                c += offset % 26;// ключ
                if (c < 'a')
                    c += 26;// налево
                if (c > 'z')
                    c -= 26;// направо
            } else if (c >= 'A' && c <= 'Z')// Если символ в строке в верхнем регистре
            {
                c += offset % 26;// ключ
                if (c < 'A')
                    c += 26;// налево
                if (c > 'Z')
                    c -= 26;// направо
            }
            encriptEnglishText += c;// Объединяем  символы
        }
        return encriptEnglishText;
    }

    public String decryptCesarEnglish(Args args) {
        // расшифровываем
        String str = args.text();
        int offset = Integer.parseInt(args.options()[1]);
        String decriptEnglishText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')// Если символ в строке строчный
            {
                c += offset % 26;// ключ
                if (c < 'a')
                    c += 26;// налево
                if (c > 'z')
                    c -= 26;// направо
            } else if (c >= 'A' && c <= 'Z')// Если символ в строке в верхнем регистре
            {
                c += offset % 26;// ключ
                if (c < 'A')
                    c += 26;// налево
                if (c > 'Z')
                    c -= 26;// направо
            }
            decriptEnglishText += c;// Объединяем  символы в строку
        }
        return decriptEnglishText;
    }
}
