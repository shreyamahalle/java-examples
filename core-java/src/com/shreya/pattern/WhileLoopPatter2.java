package src.com.shreya.pattern;
public class WhileLoopPatter2 {

    public static final int patternSize = 5;
    public static void main(String[] args) {
        int row = 0;
        while (row <patternSize ){

        int index = patternSize-row;
        while (index > 0){
            //System.out.print("*[row:"+row +",index:"+index+"]\t");
            System.out.print("* \t");
            index--;
        }
            System.out.println();
            row++;
        }

//        int row = -1;
//        while (++row < 5 ){
//
//            int index = -1;
//            while (++index <= row){
//                System.out.print(" * \t");
//            }
//            System.out.println();
//        }
    }
}
