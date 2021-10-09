import java.util.Locale;
import java.util.Scanner;

public class PermutationCipher {


    //задаем матрицу n*m
    //считываем строку
    //разбиваем ее на символы
    //считываем построчно справа-налево сверху-вниз
    //пустые места заполняем "-"


    public static void encriptPermutation(String str){

        Scanner scan2 = new Scanner(System.in);
        String inputMessage = scan2.nextLine();
        int collums = scan2.nextInt();
        int lines = scan2.nextInt();
        String [][] matrixMessages = new  String[lines][collums];
        int keyCollums = scan2.nextInt(); //ключ перестановки столбцов
        int keyLiness = scan2.nextInt();    //ключ перестановки строк
        inputMessage = inputMessage.replace("\\s+","").toUpperCase(Locale.ROOT);
        for (int i = inputMessage.length();i<keyCollums*keyLiness;i++){
            inputMessage+='_';
        }
    }
//
//
//
//
//    int lines =
//    String Matrix[][]= new String[lines][collums];



}
