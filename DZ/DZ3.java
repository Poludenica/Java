import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение
/* 
public class DZ3 {


    public static void main(String[] args) {
        ArrayList<Integer> randomList = randomArrayList(20, 20);
        System.out.println(randomList.toString());
        removEvenNum(randomList);
        System.out.println(randomList.toString());
        int min = minValue(randomList, maxValue(randomList));
        System.out.println(min);
        int max = maxValue(randomList);
        System.out.println(max);
        double middle = middleValue(randomList);
        System.out.printf("%.2f", middle);
        

    }

    static ArrayList<Integer> randomArrayList(int size, int maxValue) 

    {
        Random randNum = new Random();
        ArrayList<Integer> newRandomArray = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            newRandomArray.add(randNum.nextInt(maxValue + 1));
        }
        return newRandomArray;
    }

    static void removEvenNum(ArrayList<Integer> randomArray) { 
        Iterator<Integer> iter = randomArray.iterator();
        while (iter.hasNext()) {
            if (iter.next() % 2 == 0) {
                iter.remove();
            }
        }
    }

    static int minValue(ArrayList<Integer> randomArray, int maxValue) {

        int minimum = maxValue + 1;
        for (int i = 0; i < randomArray.size(); i++) {
            if (randomArray.get(i) < minimum)
                minimum = randomArray.get(i);
        }
        return minimum;
    }

    static int maxValue(ArrayList<Integer> randomArray) {

        int maximum = -1;
        for (int i = 0; i < randomArray.size(); i++) {
            if (randomArray.get(i) > maximum)
                maximum = randomArray.get(i);
        }
        return maximum;
    }

    static double middleValue(ArrayList<Integer> randomArray) {
        Iterator<Integer> iter = randomArray.iterator();
        int amount1 = 0;
        
        while (iter.hasNext()) {
            amount1 += iter.next();
        }
    

        double average = ((double)amount1)/randomArray.size();
        return average;
    }

}
*/

// -----------------------------------

// Для списка из задачи про Солнечную систему удалить все повторяющиеся элементы.12
/* 
public class DZ3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество планет:");
        int n = input.nextInt();
        input.close();

        ArrayList<String> planet = new ArrayList<>() {
            {
                add("Меркурий");
                add("Венера");
                add("Земля");
                add("Марс");
                add("Юпитер");
                add("Сатурн");
                add("Уран");
                add("Нептун");
            }
        };

        ArrayList<String> morePlanet = randomStringArray(planet, n);
        System.out.println(morePlanet.toString());
        Set<String> newSet = withoutRepeats(morePlanet);
        System.out.println(newSet.toString());


    }

    static ArrayList<String> randomStringArray(ArrayList<String> sourceArray, int n) {
        Random rand = new Random();
        ArrayList<String> myNewArray = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int randomIndex = rand.nextInt(sourceArray.size());
            String temp = sourceArray.get(randomIndex);
            myNewArray.add(temp);
        }
        return myNewArray;
    }

    static Set<String> withoutRepeats(ArrayList<String> sourceArray){
        Set<String> unicSet = Set.copyOf(sourceArray);
        return unicSet;
    }
    
}
*/
