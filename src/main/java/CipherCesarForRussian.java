public class CipherCesarForRussian {
    public String encriptCesarRussian(String[] args){
        String str = args[1];
        int offset = Integer.parseInt(args[3]);
        String encriptRussianText = "";
        for (int i = 0;i<str.length();i++){
            char c=str.charAt(i);
            if (c>='а'&&c<='я'){
                c+=offset%32;
                if (c<'а')c+=32;
                if (c>'я')c-=32;
            }
            else if(c>='А'&&c<='Я'){
                c+=offset%32;
                if (c<'А')c+=32;
                if (c>'Я')c-=32;
            }
            encriptRussianText +=c;
        }
        return encriptRussianText;
    }

    public static String decriptCesarRussian(String str, int dr){
        int r = Integer.parseInt("-"+dr);
        String decriptRussianText="";
        for(int i = 0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='а'&&c<='я')// Если символ в строке строчный
            {
                c+=r%32;// ключ
                if(c<'а')
                    c+=32;// налево
                if(c>'я')
                    c-=32;// направо
            }else if(c>='А'&&c<='Я')// Если символ в строке в верхнем регистре
            {
                c+=r%32;// ключ
                if(c<'А')
                    c+=32;// слева налево
                if(c>'Я')
                    c-=32;// направо
            }
            decriptRussianText +=c;// Объединяем дешифрованные символы в строку
        }
        return decriptRussianText;
    }
}
