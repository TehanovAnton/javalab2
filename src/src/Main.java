package src;
import by.belstu.it.tehanov.TextWork;
import by.belstu.it.tehanov.WrapperString;
import java.nio.charset.StandardCharsets;
import static java.lang.Math.*;
public class Main
{
    static int sint;
    public final int CONST = 1;
    public final static int CONST_ST = 2;

    public static void main(String[] args)
    {
        //TODO start
        TextWork work = new TextWork();
        work.OnCreate();

        WrapperString wrapp = new WrapperString("strvalue");
        wrapp.replace('s', 'e');

        /** labwork
         * @author Anton
         * @vaersion 1.0*/

        char character = 'a', utf =  '\u0061', ch = 97;
        System.out.println(character + " " + utf + " " + ch);
        System.out.println(character + utf + ch);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println("окгуглённое число ПИ: " + Math.round(PI));
        System.out.println("окгуглённое число E: " + Math.round(E));
        System.out.println("минимальное из чисел E, PI" + Math.min(E, PI));
        System.out.println("случайное число из промежутка [0, 1):" + Math.random());

        //TODO переменные простых типов и действия над ними
        int intNumber = 100_000;
        short shortNumber = 10;
        byte byteNumber = 5;
        double doubleNumber = 100.123;
        long longNumber = 100_000_000;
        boolean bool = true;
        String str = "anton";
        System.out.println(str + intNumber);
        System.out.println(str + character);
        System.out.println(str + longNumber);
        byteNumber += intNumber;
        intNumber += doubleNumber + longNumber;
        longNumber = intNumber + 2147483647;
        System.out.println(sint);
        bool = bool && !bool;
        bool = bool ^ !bool;
//        bool = bool + !bool;
        long longBigNumber = 9_223_372_036_854_775_807L;
        double doubleBigNumber = 0x7fff_ffff_fffL;

        Boolean boolBoxed = true;
        Integer intBoxed = 7;
        Byte byteboxed = 8;
        Double doubleBoxed = 10.13;
        Short shortBoxed = 0;
        Long longBoxed = Long.MAX_VALUE;

        System.out.println(intBoxed >>> 1);
        System.out.println(byteboxed >> 1);
        System.out.println(~shortBoxed);
        System.out.println(shortBoxed * 2 + 1);
        System.out.println(shortBoxed * 2 + 1);
        System.out.println(longBoxed + " " + Double.MIN_VALUE);
        System.out.println(Integer.parseInt("123", 10) + " " +Integer.toHexString(123456789) +
                Integer.compare(10, 9) + Integer.toString(987) + " " + Integer.bitCount(100) +
                Float.isNaN(3 / 2));

        String s34 = "2345";
        intNumber = Integer.parseInt(String.valueOf(s34));

        byte[] s34Bytes = s34.getBytes(StandardCharsets.UTF_8);
        s34 = new String(s34Bytes);

        boolean s34Bool = s34 == s34;
        s34Bool = Boolean.valueOf(s34);

        String fr = "hello", sc = "hello";
        System.out.println(fr == sc + " " + fr.equals(sc));
        System.out.println(s34.split("") + " " + s34.contains("5") + " " + s34.hashCode() + " " +
                s34.indexOf("2") + s34.length() + s34.replace("2", "7"));

        char c[][];
        char[][] c1 = new char[3][];
        c1[0] = new char[1];
        c1[1] = new char[2];
        c1[2] = new char[3];
        for(int i = 0; i < c1.length; i++)
            System.out.println(c1[i].length);

        char[] c2[] = new char[1][1];
        c2[0] = new char[]{' '};
        c2[1] = new char[]{'q'};

        char c3[][] = new char[1][1];
        c2[0] = new char[]{' '};
        c2[1] = new char[]{'q'};

        boolean comRez = c2 == c3;
        c2 = c3;

        for(char el : c2[0])
        {
            System.out.println(el);
        }

        for(int i = 0; i < c2[1].length + 1; i++)
        {
            System.out.println(c2[1][i]);
        }
    }

    WrapperString anonym = new WrapperString("hello"){
        @Override
        public void replace(char oldChar, char newChar) {
            System.out.println("overriden method");
            replace(oldChar, newChar);
        }
    };
//    Main generalModule = new Main() {
//        @Override
//        public void replace(char oldChar, char newChar) {
//            System.out.println("replace");
//        }
//    };
}
