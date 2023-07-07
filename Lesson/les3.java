package Lesson;
// коллекции Java
// тип данных object - "всему голова"
// упаковка - любой тип можно положить в переменную типа object
// Распаковка - преобразование object-переменной в нужный тип
// Иерархия типов - любой тип "ниже" Object'а



// public class les3 {
//     public static void main(String[] args) {
//         Object o = 1; GetType(o); // java.lang.Integer
//         o = 1.2; GetType(o); // java.lang.Double
//     }

//     static void GetType(Object obj){
//         System.out.println(obj.getClass().getName());
//     }
// }
// ------
// public class les3 {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }
//     static Object Sum(Object a, Object b) {
//         if (a instanceof Double && b instanceof Double) {
//             return (Object)((Double)a + (Double)b);
//         } else if (a instanceof Integer && b instanceof Integer) {
//             return (Object)((Integer)a + (Integer)b);
//         } else return 0;
//     }
// }

// --------------------
// массивы
// как увеличить размер массива?
// public class les3 {
//     public static void main(String[] args) {
//         int[] a = new int[] {1, 9};
//         int[] b = new int[3];
//         System.arraycopy(a, 0, b, 0, a.length); 

//         for (int i : a) {System.out.printf("%d", i);} //19

//         for (int j : b) {System.out.printf("%d", j);} // 090000000
        
//     }
// }

// ----------------
// иерархия Коллекций
// --------
// Интерфейс ArrayList
// List - пронумерованный набори элементов
// Пользователь этого интерфейса имеет точный контроль над тем.ю где в списке вставляется каждый элемент. 
// Пользователь может обращаться к элементам по их целочисленному индексу(позиции в списке) и искать элементы в списке
// ArrayList, LinkedList(Vector, Stark - устаревшее)
// import java.util.List;
// import java.lang.reflect.Array;
// import java.util.ArrayList;

// public class les3 {
//     public static void main(String[] args) {
//         // ArrayList list = new ArrayList();
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         list.add(2809);
//         // list.add("1234")

//         for (Object o : list) {
//             System.out.println(o);
//         }
        
//     }
// }
// -------------------
// Коллекции Функционал


// Итератор
import java.util.*;
public class les3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);
        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
            col.next();
            col.remove();
        }
    }
}