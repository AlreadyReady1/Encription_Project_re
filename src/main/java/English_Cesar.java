public class English_Cesar {

    public static void Encrypt_English(String str, int ee) {
        // Зашифровать
        String encript_english_text = "";
        for(int i = 0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')// Если символ в строке строчный
            {
                c+=ee%26;// ключ
                if(c<'a')
                    c+=26;// налево
                if(c>'z')
                    c-=26;// направо
            }
            else if(c>='A'&&c<='Z')// Если символ в строке в верхнем регистре
            {
                c+=ee%26;// ключ
                if(c<'A')
                    c+=26;// налево
                if(c>'Z')
                    c-=26;// направо
            }
            encript_english_text +=c;// Объединяем  символы
        }
        System.out.println("Строка "+str+" После шифрования: "+encript_english_text);
    }

    public static void Decrypt_English(String str, int de) {
        // расшифровываем
        int k = Integer.parseInt("-"+de);
        String decript_english_text = "";
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
            decript_english_text +=c;// Объединяем  символы в строку
        }
        System.out.println("Строка "+str+" После дешифрования: "+decript_english_text);
    }
}
