import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;


public class MatrixPermutation {
    static Logger logger= new Logger("Launcher");

    //задаем матрицу n*m
    //считываем строку
    //разбиваем ее на символы
    //считываем построчно справа-налево сверху-вниз

//////////////////////////////////////////////////////////////////
    public String encryptPer(Args args) {
        String string1 = args.text();
        String probe="";
        int offsetPermutation = Integer.parseInt(args.options()[1]);
        for (int i=0;i<string1.length();i++){
            char c=string1.charAt(i);
            c+=offsetPermutation;
            probe+=c;
        }

        char[] str = probe.toCharArray();
        String collums = args.options()[1];
        String lines = args.options()[2];
        logger.logg("Создана матрица, состоящая из "+collums+ " столбцов "+" и "+lines+" строк");
       int col = 0, lin = 0;
        logger.logg("Матрица после сдвига \""+offsetPermutation+"\" примет следующий вид: ");


        col = Integer.parseInt(collums);
        lin = Integer.parseInt(lines);

//        String down = "_";
//        char[] downn =down.toCharArray();/////////////////////
        int swicher = 0;
        char[][] matrix = new char[col][lin];
        String sborka = "";//для сборки строки матрицы
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < lin; j++) {
                if (swicher >= str.length) break;       //экстренный выход из цикла
                matrix[i][j] = str[swicher];
                swicher++;
                sborka += matrix[i][j]+" ";
            }
            sborka = "";                    //сброс строки,чтобы матрицу выдавало построчно
        }
        int buf=0;
        buf=swicher;
        swicher=0;                          //сброс счетчика
        for (int i = 0; i < col; i++) {                             //цикл для заполнения пустых ячеек матрицы
            for (int j = 0; j < lin; j++) {
                if (matrix[i][j]==0) {
                    if (swicher==buf) swicher = 0;
                    matrix[i][j] = str[swicher];

                }
                swicher++;
                sborka += matrix[i][j]+" ";
            }
            System.out.println(sborka);

            sborka="";
        }
        return sborka;
    }
}

