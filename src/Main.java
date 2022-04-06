import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("""
                Введите нужный вам пункт
                1.Перевод из 10-тичной сс в 16-ричную и 2-ичную сс
                2.Перевод из 2-ичной сс в 10 ричную сс
                """);
        int punkt = in.nextInt();
        switch (punkt) {
            case (1):

                System.out.println("Введите число в 10-ричной системе счисления");
                // перевод в 16-ричную сс
                String strout = "";
                int firstNum = in.nextInt();
                int firstnum16 = firstNum;
                int firstNum2 = firstNum;
                int chastno;
                do {
                    chastno = firstnum16 / 16;
                    strout = strout + conv(firstnum16 - 16 * chastno);
                    firstnum16 = chastno;
                } while ((chastno / 16) != 0);
                strout = strout + conv(chastno);

                if (strout.endsWith("0")) {
                    strout = strout.substring(0, strout.length() - 1);
                    System.out.println(reverse(strout));
                } else {
                    System.out.println(reverse(strout));
                }
                // перевод в 2-ичнкю сс
                strout = "";
                do {
                    chastno = firstNum2 / 2;
                    strout = strout + conv(firstNum2 - 2 * chastno);
                    firstNum2 = chastno;
                } while ((chastno / 2) != 0);
                strout = strout + conv(chastno);
                System.out.println(reverse(strout));
                break;
            case (2):
                System.out.println("Введите число в 2-ичной системе счисления");
                int secondNumb = in.nextInt();
                double sum10 = 0;
                String secondOut = String.valueOf(secondNumb);


                for (int i=secondOut.length()-1 ; i >= 0 ;i--){
                    int sim = secondOut.charAt(secondOut.length()-i-1);
                    if(sim ==49 || sim ==48) {
                        if (sim == 49) {
                            sum10 = sum10 + Math.pow(2, i);

                        }
                    }else {
                        System.out.println("Некоректный ввод");
                    }
                }
                System.out.println(sum10);

                break;

            default:
                System.out.println("Некоректный пункт");

        }

    }

    //перевод цифр в вид букв и строк
    public static String conv(int a){
        String num;
        switch (a){
            case (10): num = "A";
                break;
            case (11): num = "B";
                break;
            case (12): num = "C";
                break;
            case (13): num = "D";
                break;
            case (14): num = "E";
                break;
            case (15) : num ="F";
                break;
            default: num = String.valueOf(a);
        }

        return num;
    }
    // развернуть строчку
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}
