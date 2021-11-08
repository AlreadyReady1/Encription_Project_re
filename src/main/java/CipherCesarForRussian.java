public class CipherCesarForRussian {
    public String encryptCesarRussian(Args args) {
        String str = args.text();
        int offset = Integer.parseInt(args.options()[1]);
        String encriptRussianText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'а' && c <= 'я') {
                c += offset % 32;
                if (c < 'а') c += 32;
                if (c > 'я') c -= 32;
            } else if (c >= 'А' && c <= 'Я') {
                c += offset % 32;
                if (c < 'А') c += 32;
                if (c > 'Я') c -= 32;
            }
            encriptRussianText += c;
        }
        return encriptRussianText;
    }

    public String decryptCesarRussian(Args args) {
        int offset = Integer.parseInt(args.options()[1]);
        String str = args.options()[1];
        String decriptRussianText = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'а' && c <= 'я')// Если символ в строке строчный
            {
                c += offset % 32;// ключ
                if (c < 'а')
                    c += 32;// налево
                if (c > 'я')
                    c -= 32;// направо
            } else if (c >= 'А' && c <= 'Я')// Если символ в строке в верхнем регистре
            {
                c += offset % 32;// ключ
                if (c < 'А')
                    c += 32;// слева налево
                if (c > 'Я')
                    c -= 32;// направо
            }
            decriptRussianText += c;// Объединяем дешифрованные символы в строку
        }
        return decriptRussianText;
    }
}
