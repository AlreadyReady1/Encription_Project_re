public class Russian_Cesar {
    public static void Encript_Russian(String str,int er){
        String encript_russian_text = "";
        for (int i = 0;i<str.length();i++){
            char c=str.charAt(i);
            if (c>='а'&&c<='я'){
                c+=er%32;
                if (c<'а')c+=32;
                if (c>'я')c-=32;
            }
            else if(c>='А'&&c<='Я'){
                c+=er%32;
                if (c<'А')c+=32;
                if (c>'Я')c-=32;
            }
            encript_russian_text +=c;
        }
        System.out.println("Строка "+str+" После шифрования примет следующий вид: "+encript_russian_text);
    }

    public  static void Decript_Russian(String str,int dr){
        int r = Integer.parseInt("-"+dr);
        String decript_russian_text="";
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
            decript_russian_text +=c;// Объединяем дешифрованные символы в строку
        }
        System.out.println("Строка "+str+" После дешифрования примет следующий вид: "+decript_russian_text);
    }
}
