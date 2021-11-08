public class PairwiseSwap {
    static Logger logger= new Logger("Launcher");

    public String permutation(Args args){
        String string =args.text();
        String str ="";
        char [] cmass =string.toCharArray();
        for (int i =0;i<cmass.length;i+=2){ //попарная перестановка
            if (i+1>=cmass.length) break;
            char temp = cmass[i];
            cmass[i]=cmass[i+1];
            cmass[i+1]=temp;
                        }

//        for (int i=0;i<cmass.length;i++){
//            str+=cmass[i];
//        }
        for (int i = cmass.length-1;i>=0;i--){  //реверс
            str+=cmass[i];
        }
        logger.logg("В результате попарной перестановки с реверсом строка \"" +args.text()+ "\" примет следующий вид: "+str);
        return str;
    }
}
