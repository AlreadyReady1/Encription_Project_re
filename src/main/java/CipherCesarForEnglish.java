public class CipherCesarForEnglish {

    public String encryptCesarEnglish(Args args) {
        // Зашифровать
        String str = args.getTEXT();
        int offset = Integer.parseInt(args[3]);
        String encriptEnglishText = "";
        for(int i = 0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')// Если символ в строке строчный
            {
                c+=offset%26;// ключ
                if(c<'a')
                    c+=26;// налево
                if(c>'z')
                    c-=26;// направо
            }
            else if(c>='A'&&c<='Z')// Если символ в строке в верхнем регистре
            {
                c+=offset%26;// ключ
                if(c<'A')
                    c+=26;// налево
                if(c>'Z')
                    c-=26;// направо
            }
            encriptEnglishText +=c;// Объединяем  символы
        }
        return encriptEnglishText;
    }

    public static String decryptCesarEnglish(String str, int de) {
        // расшифровываем
        int k = Integer.parseInt("-"+de);
        String decriptEnglishText = "";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')// Если символ в строке строчный
            {
                c+=k%26;// ключ
                if(c<'a')
                    c+=26;// налево
                if(c>'z')
                    c-=26;// направо
            }else if(c>='A'&&c<='Z')// Если символ в строке в верхнем регистре
            {
                c+=k%26;// ключ
                if(c<'A')
                    c+=26;// налево
                if(c>'Z')
                    c-=26;// направо
            }
            decriptEnglishText +=c;// Объединяем  символы в строку
        }
        return decriptEnglishText;
    }
}
