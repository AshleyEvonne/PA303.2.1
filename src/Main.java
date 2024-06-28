//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 95;
        int num2 = 10;
        int sum = num1 + num2;
        System.out.println(sum);

        double size = 5.5d;
        double size2 = 12.0d;
        double sizeSum = size2 + size;
        System.out.println(sizeSum);

        int age = 29;
        double dec = 3.3d;
        double add = age + dec;
        System.out.println(add);

        int ten = 10;
        int five = 5;
        int divided = ten / five;
        System.out.println(divided);
        // if you change a number to a decimal then you ave to change the data type

        double nine = 9.0d;
        double three = 3.0d;
        double div = (int) nine / three;

        System.out.println(div);

        int x = 5;
        int y = 6;
        double q = (double) y /x;
        System.out.println(q);

         q = (double) y;
        System.out.println(q);

        final int two = 2;
        System.out.println(two + 1);

        double coffee = 2.50d;
        double cap = 3.25d;
        double tea = 1.75d;

        double subTotal = (coffee * 3) + (cap * 4) + (tea * 2);
        final double salesTax = subTotal * 0.08d;
        double totalSales = subTotal + salesTax ;

        System.out.println(totalSales);

        }
    }
