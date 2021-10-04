//написать код Цезаря так чтобы он работал на русском и английском
// и задавался по ключевой команде
// + возможность менять величину сдвига
//unicode для русского 1040-большие,1078-маленькие буквы (modul=32)
//unicode для английского 65-большие,97-маленькие буквы (modul=26)
import java.util.Scanner;

public class Launcher {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите вид задачи: A- шифрование / B- дешифрование");
        String task_type = scan.nextLine();
        System.out.println("Выберите язык: R- русский / E- английский");
        String language = scan.nextLine();
        System.out.println("go");

        if(task_type.equalsIgnoreCase("A"))
        {// Определяем, равны ли переменные s1 и A, игнорируя регистр
            System.out.println("Выбран режим шифрования");
            System.out.println("введите текст:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println("введите ключ:");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();
            System.out.println("Ключ = "+key);

            if (language.equalsIgnoreCase("R"))
            {
                System.out.println("Выбран русский язык");
                Russian_Cesar.Encript_Russian(s,key);
            }
            if (language.equalsIgnoreCase("E"))
            {
                System.out.println("Выбран англлийский язык");
                English_Cesar.Encrypt_English(s,key);// Вызываем метод шифрования
            }

        }else if(task_type.equalsIgnoreCase("B"))
        {
            System.out.println("Выбран режим дешифрования");
            System.out.println("введите зашифрованный текст:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println("введите ключ:");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();
            System.out.println("Ключ = "+key);
            if (language.equalsIgnoreCase("R"))
            {
                System.out.println("Выбран русский язык");
                Russian_Cesar.Decript_Russian(s,key);
            }
            if (language.equalsIgnoreCase("E"))
            {
                System.out.println("Выбран англлийский язык");
                English_Cesar.Decrypt_English(s,key);// Вызываем метод дешифрования
            }
        }
    }
}

