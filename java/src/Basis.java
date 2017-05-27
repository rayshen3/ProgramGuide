/**
 * Created by ray on 17/5/11.
 */

import java.util.*;


/**
 * @author ray
 * @date 17/5/22
 *
 */
public class Basis {
    public static final double PRICE = 18000.1;
    public static void main(String[] args) {
        /**
         * string operation
         */
        int a = 110000;
        int b = a * 10 / 2;
        int years = 0;
        double salary = 100000.8;

        String name = String.join("+","ray","shen");
        String water = "";
        StringBuilder charbuild = new StringBuilder();

        charbuild.append("first");
        charbuild.append(" second\nthird");
        System.out.println(b);
        System.out.println("My Tag is: ray\u2122");
        System.out.println("My name is: " + name);
        System.out.println("My first name is: " + name.substring(0,3));
        System.out.println("[water] length is: " + water.length());
        System.out.println(charbuild.toString());
        System.out.println(charbuild.toString());
        System.out.println("charbuild obj length is:" + charbuild.length());

        System.out.printf("10 / 3 is: %(,.2f\n", (-10000.0/3));


        /**
         * date operation
         *
         */
        System.out.printf("%1$tY-%1$tm-%1$td %1$tT,%2$s", new Date(), "is my datetime.\n");
        System.out.printf("%1$tY-%1$tm-%1$td %1$tT.%1$tL.%1$tN\n", new Date());


        /**
         *input output
         *
         */
/*
        Scanner in = new Scanner(System.in);
        System.out.printf("hi, what's your name?");
        String user_name = in.nextLine();

        System.out.printf("how old are you:");
        int user_age = in.nextInt();

        System.out.printf("hello %s. Next year, you'll be %d", user_name, (user_age+1));
 */


        /**
         * control flow
         *
         */
        //if (name.substring(0,3) == "ray") {
        if (name.substring(0,3).equalsIgnoreCase("ray")) {
            System.out.println("ray is your english name");
        }
        else if (name.substring(0,3).equalsIgnoreCase("shen")) {
            System.out.println("shen is your chinese name");
        }
        else {
            System.out.println("false");
        }

        while(salary < 1000000) {
            salary *= 1.05;
            years++;
        }

        System.out.printf("after %d years, your salary is: %.3f\n", years, salary);

        //int i;
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d * %d = %d ", j, i, (i*j));
            }
            System.out.println();
        }

/*

        Scanner select_in = new Scanner(System.in);
        System.out.printf("please select an option (1, 2):");
        int choice = select_in.nextInt();
        switch (choice) {
            case 1:
                System.out.printf("your choice is %d\n", choice);
                break;
            case 2:
                System.out.printf("your choice is %d\n", choice);
                break;
            default:
                System.out.printf("your choice is error: %d\n", choice);
                break;

        }
*/


        /**
         * array
         *
         */
        int[] order = new int[3];
        int[] order1 = {0,1,2};
        String[] letter = new String[100];

        int[] order2 = order1;
        int[] order3 = Arrays.copyOf(order1, order1.length);
        int[] order4 = Arrays.copyOf(order1, order1.length+2);

        order2[2]=20;
        order3[2]=30;

        System.out.println("order1 index 2 is: " + order1[2]);
        System.out.println("order2 index 2 is: " + order2[2]);
        System.out.println("order3 index 2 is: " + order3[2]);
        System.out.println("order4 is: " + Arrays.toString(order4));

        for (int i = 0; i <3; i++) {
            order[i] = (i*i);
        }

        for (int i = 0; i < order.length; i++) {
            System.out.println(order[i]);
        }

        for (int i : order) {
            System.out.println(i);
        }

        //random and sort with array, choise 9 numbers from 0-100
        int max = 100;
        int[] members = new int[max];
        int[] result = new int[9];
        for (int i = 0; i <members.length; i++) {
            members[i] = i + 1;
        }

        for (int i = 0; i <result.length; i++) {
            int r = (int) (Math.random() * max);
            result[i] = members[r];
            members[r] = members[max-1];
            max--;
        }

        Arrays.sort(result);
        System.out.println("congratulation the nums: " + Arrays.toString(result));

        //2D array
        double[] rate = new double[6];
        for (int i = 0; i <rate.length; i++) {
            rate[i] = (10 + i) / 100.0;
        }

        double[][] balances = new double[10][6];
        for (int i = 0; i <balances[0].length; i++) {
            balances[0][i] = 10000;
        }

        for (int i = 1; i <balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                balances[i][j] = balances[i-1][j] * (1+rate[j]);
            }
        }

        for (double i : rate ) {
            System.out.printf("%9.0f%%",i*100);
        }
        System.out.println();

        for (double[] row: balances) {
            for (double i : row) {
                System.out.printf("%10.2f", i);
            }
            System.out.println();
        }

        int[][] nonstandard = new int[3][];
        nonstandard[0] = new int[1];
        nonstandard[1] = new int[2];
        nonstandard[2] = new int[3];
        for (int i = 0; i <nonstandard[2].length; i++) {
           nonstandard[2][i] = i*i;
        }
        System.out.printf("%s\n", Arrays.deepToString(nonstandard));


        /**
         * access variables and functions from Basis.class
         *
         */
        //static variables
        System.out.println(People.englishname);

        //non-static variables
        People ray = new People("rayshen", "shijiazhuang", 29);
        People dongbo = new People("zhangdongbo", "Wuhan", 26);
        People shen = new People("shenlei", "beijing");

        System.out.println(ray.sayRun("plz take care of yourself!"));
        System.out.println(shen.readBook("Core java"));
        System.out.println(dongbo.runEat(1000));



    }
}
