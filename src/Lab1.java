public class Lab1 {
    public static void main(String[] args) {
        byte b1 =-20;
        short sh1=25000;
        int z=3658542;
        long l=2475125385545l;
        float f=12.5f;
        double d=85.6;
        char c='w';
        boolean type=true;
        String New="Rifnur";
        System.out.println("Задание 2:");
        System.out.println("byte: "+b1);
        System.out.println("short: "+sh1);
        System.out.println("int: "+z);
        System.out.println("long: "+l);
        System.out.println("float: "+f);
        System.out.println("double: "+d);
        System.out.println("char: "+c);
        System.out.println("boolean: "+type);
        System.out.println("String: "+New);

        double sum3 =zadanie3(2.5,3.5,7.5,10);
        System.out.println("Задание 3: "+ sum3);

        boolean g =zadanie4(2.5,7.5);
        System.out.println("Задание 4: "+g);

        String Number =zadanie5(0);
        System.out.println("Задание 5: "+Number);

        boolean Number1 =zadanie6(-10);
        System.out.println("Задание 6: "+Number1);

        String Name =zadanie7("Рифнур");
        System.out.println("Задание 7: "+Name);

        String Year1 =zadanie8(2001);
        System.out.println("Задание 8: "+Year1);

    }
    /*задание 3 */
    static double zadanie3 (double a, double b, double c, double d) {
       if (d==0){
           System.out.println("Нельзя делить на ноль");
           return 0;
       }
        return a * (b + (c / d));
    }
    /*задание 4 */
    static boolean zadanie4 (double a , double b){
        if ((a+b)>=10 & (a+b)<=20){
         return   true ;
        }
        return  false ;
    }
    /*задание 5 */
    static String zadanie5 (int a){
        if (a>=0) {
          return a +" - положительное число!";
        }
        return a +" - отрицательное число!";
    }
    /*задание 6 */
    static boolean zadanie6 (int a){
        if (a>=0) {
            return false;
        }
        return true;
    }
    /*задание 7 */
    static String zadanie7 (String Name){
        return "Привет "+Name;
    }
    /*задание 8 */
    static String zadanie8 (int year1){
        if ((((year1%4)==0 & (year1%100)!=0)) ||(year1%400)==0) {
                 return year1+" год является високосным годом."; }
        return year1+" год является невисокосным годом.";

    }



}
