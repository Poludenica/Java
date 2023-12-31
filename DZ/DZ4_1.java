import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

// Вариант 1
// public class DZ4_1 {
//     public static void main(String[] args) throws IOException, InterruptedException {
//         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//         Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(2, 4, 3));
//         Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5, 6, -1));
//         int number1 = getInteger(deque1);
//         int number2 = getInteger(deque2);
//         int sum = sumInt(number1, number2);
//         int mult = multInt(number1, number2);
//         System.out.println(mult);
//         System.out.println(dequeCreate(mult));
//         System.out.println(dequeCreate(sum));
//     }

//     static int getInteger(Deque<Integer> deque) {
//         int number = 0;
//         boolean posNeg = false;
//         while (!deque.isEmpty()) {
//             int n = number;
//             if (!deque.isEmpty()) {
//                 int temp = 0;
//                 temp = deque.pollLast();
//                 if (temp < 0) {
//                     temp *= -1;
//                     posNeg = true;
//                 }
//                 n += temp;
//             }
//             number = n * 10;
//         }
//         number = number / 10;
//         if (posNeg)
//             number *= -1;
//         return number;
//     }

//     static int sumInt(int number1, int number2) {
//         int sum = number1 + number2;
//         return sum;
//     }

//     static int multInt(int number1, int number2) {
//         int mult = number1 * number2;
//         return mult;
//     }


//     static Deque<String> dequeCreate(int num) {
//         Deque<String> resultDeque = new LinkedList<>();
//         int n = 0;
//         boolean negative = false;
//         if (num < 0) {
//             num *= -1;
//             negative = true; 
//         }
//         while (num > 0) {
//             n = num % 10;
//             num = (num - n) / 10;
//             resultDeque.addFirst(Integer.toString(n));
//         }
//         if (negative) {
//             resultDeque.addFirst("-");
//         }
//         return resultDeque;
//     }
// }

// Вариант 2
// -------------------------------
public class DZ4_1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Deque<Integer> deque1 = new ArrayDeque<>(Arrays.asList(2, 4, 3));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(5, 6, -1));
        int number1 = getInteger(deque1);
        int number2 = getInteger(deque2);
        int sum = sumInt(number1, number2);
        int mult = multInt(number1, number2);
        System.out.println(mult);
        Deque<Integer> multDeque = dequeCreate(mult);
        Deque<Integer> sumDeque = dequeCreate(sum);
        System.out.println();
        System.out.println(multDeque);
        System.out.println();
        System.out.println(sumDeque);
    }

    static int getInteger(Deque<Integer> deque) {
        int number = 0;
        boolean posNeg = false;
        while (!deque.isEmpty()) {
            int n = number;
            if (!deque.isEmpty()) {
                int temp = 0;
                temp = deque.pollLast();
                if (temp < 0) {
                    temp *= -1;
                    posNeg = true;
                }
                n += temp;
            }
            number = n * 10;
        }
        number = number / 10;
        if (posNeg)
            number *= -1;
        return number;
    }

    static int sumInt(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }

    static int multInt(int number1, int number2) {
        int mult = number1 * number2;
        return mult;
    }

    static Deque<Integer> dequeCreate(int num) {
        Deque<Integer> resultDeque = new ArrayDeque<>();
        while (num != 0) {
            int n = num % 10;
            String s = Integer.toString(num);
            if (s.length() > 2 && s.charAt(0) == '-') {
                n *= -1;
            }
            resultDeque.push(n);
            num = num / 10;
        }

        return resultDeque;
    }
}