//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

import static java.lang.IO.print;

public class Main {
    public static int[] getNumbers(){

        return new int[]{1, 2, 3, 4, 5};
    }

    /*public static int[] filterEvenNumbers(int[] v) {
        int count = 0;
        for (int k : v) {
            if (k % 2 == 0) {
                count++;
            }
        }
        int[] even = new int[count];

        int j = 0;
        for (int k : v) {
            if (k % 2 == 0) {
                even[j++] = k;
            }
        }

        return even;
    }*/

    /*public static int[] filterOddNumbers(int[] v) {
        int count = 0;
        for (int k : v) {
            if (k % 2 != 0) {
                count++;
            }
        }
        int[] odd = new int[count];

        int j = 0;
        for (int k : v) {
            if (k % 2 != 0) {
                odd[j++] = k;
            }
        }

        return odd;
    }*/
    public static void main(String[] args){
        int[] numbers = getNumbers();


        System.out.println(Arrays.toString(numbers));


        Arrays.stream(numbers).forEach(System.out::println);


        Arrays.stream(numbers)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        Arrays.stream(numbers)
                .filter(i -> i % 2 !=0)
                .forEach(System.out::println);

    }
}
