//написать код Цезаря так чтобы он работал на русском и английском
// и задавался по ключевой команде
// + возможность менять величину сдвига
//unicode для русского 1040-большие,1078-маленькие буквы (modul=32)
//unicode для английского 65-большие,97-маленькие буквы (modul=26)

import java.util.Scanner;

public class Launcher {

    public static final String ENCRIPT = "-en";
    public static final String DECRIPT = "-de";
    public static final String RUSSIAN_LANGUAGE = "-rl";
    public static final String ENGLISH_LANGUAGE = "-el";


    public static void main(String[] args) {

        System.out.println("аргументы: ");
        System.out.println(args[0]);
        System.out.println(args[1]);

        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("введите текст:");
        String text = scan.nextLine();
     //   System.out.println("Выберите вид шифрования (шифр Цезаря,шифр перестановки и тд.)");


        if (args[0].equalsIgnoreCase(ENCRIPT)) {
            // Определяем, равны ли переменные, игнорируя регистр
            System.out.println("Выбранный режим - режим шифрования");
            System.out.println("Введена строка " + "<< "+text+" >>");
            System.out.println("введите ключ:");
            int keyForEncript = scan.nextInt();
            System.out.println("Ключ = " + keyForEncript);

            if (args[1].equalsIgnoreCase(RUSSIAN_LANGUAGE)) {
                System.out.println("Выбран русский язык");
                CipherCesarForRussian.encriptCesarRussian(text, keyForEncript);
            }
            if (args[1].equalsIgnoreCase(ENGLISH_LANGUAGE)) {
                System.out.println("Выбран англлийский язык");
                CipherCesarForEnglish.encryptCesarEnglish(text, keyForEncript);// Вызываем метод шифрования
            }
            if (args[0].equalsIgnoreCase(DECRIPT)) {
                System.out.println("Выбранный режим - режим дешифрования");
                System.out.println("Введена строка " + "<< "+text+"  >>");
                System.out.println("введите ключ:");
                int keyForDecript = scan.nextInt();
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
    }
}

