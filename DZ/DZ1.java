// package DZ;

// import java.util.Scanner;

// public class DZ1 {
//     //1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите n: ");
//         int n = scanner.nextInt();
//         scanner.close();
//         int sum = triangular_number(n);
//         int factorial = factorial(n);
//         System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
//         System.out.println(n + "! = " + factorial);

//     }

//     static int triangular_number(int number) {
//         int sum = 0;
//         for (int i = 1; i <= number; i++) {
//             sum += i;
//         }
//         return sum;
//     }

//     static int factorial(int number) {
//         int factorial = 1;
//         for (int i = 1; i <= number; i++) {
//             factorial *= i;
//         }
//         return factorial;
//     }
// }

// -----------------------------
// package DZ;

// public class DZ1 {
//     // Вывести все простые числа от 1 до 1000
//     public static void main(String[] args) {
//         int i, j;
//         boolean Prime;

//         System.out.println("Простые числа от 1 до 1000:");

//         for (i = 2; i <= 1000; i++) {
//         Prime = true;

//             for (j = 2; j < i; j++) {
//                 if (i % j == 0) {
//                     Prime = false;
//                     break;
//                 }
//             }

//             if (Prime) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// ----------------

// package DZ;

// import java.util.Scanner;

// public class DZ1 {
//       // реализовать простой калькулятор
//      public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Введите оператор (+, -, *, /): ");
//         char operator = input.next().charAt(0);

//         System.out.print("Введите первое число: ");
//         double num1 = input.nextDouble();
//         System.out.print("Введите второе число: ");
//         double num2 = input.nextDouble();

//         double result;

//         switch (operator) {
//             case '+':
//                 result = num1 + num2;
//                 break;
//             case '-':
//                 result = num1 - num2;
//                 break;
//             case '*':
//                 result = num1 * num2;
//                 break;
//             case '/':
//                 result = num1 / num2;
//                 break;
//             default:
//                 System.out.println("Ошибка! Неправильный оператор.");
//                 return;
//         }

    
//         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
//     }
// }




