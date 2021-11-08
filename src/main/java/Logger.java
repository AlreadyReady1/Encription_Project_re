import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {
    private final String name;



    public Logger(String name) {
        this.name = name;

    }

    public void logg (String str )  {
        Date date = new Date();
        System.out.println(str);
        try (FileWriter fw = new FileWriter("test.txt",true)){

            fw.write(str+"\n    Время запроса операции: "+date+"\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //создать метод для FW sout в одном  + время добавления



}
