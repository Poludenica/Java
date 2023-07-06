import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


// //     1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// // 1 Расширение файла: txt
// // 2 Расширение файла: pdf
// // 3 Расширение файла:
// // 4 Расширение файла: jpg
//  public class DZ2 {
//      public static void main(String[] args) throws SecurityException, IOException {

//         String dirPath = System.getProperty("user.dir") + ("\\DZ2Dir"); // путь к тестовой директории
//         System.out.println(dirPath);
//         String[] catalog = getFileList(dirPath);
//         definitionOfAnExtension(catalog);
//     }

//      static String[] getFileList(String dirPath) {
//          File currentList = new File(dirPath);
//          return currentList.list();
//      }

//      static void definitionOfAnExtension(String[] fileList) {
//         for (int i = 0; i < fileList.length; i++) {
//             int index = fileList[i].indexOf(".");
//             String result = i + 1 + ") Расширение файла: " + fileList[i].substring(index);
//             System.out.println(result);
//         }
//      }

// }
// ----------------------------------------
//2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class DZ2 { 

    public static void main(String[] args) throws SecurityException, IOException {
         
        int[] numbers = { 7, 4, 9, 3, 13, 8 };
        System.out.println(Arrays.toString(Sorting(numbers)));
       
    }
    static void addingToFile(String filePath, int numbers){
    try {
        File myFile = new File(filePath);
        FileWriter writer = new FileWriter(myFile, true);
    
        writer.write(numbers);
        writer.close();
        } 
    catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
    static int[] Sorting(int[] listForSort) throws SecurityException, IOException{
        String pathFile = System.getProperty("user.dir") + "\\DZ2.txt";
        for (int j = listForSort.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (listForSort[i] > listForSort[i + 1]) {
                    int temp = listForSort[i];
                    listForSort[i] = listForSort[i + 1];
                    listForSort[i + 1] = temp;
                }
                addListToFile(listForSort, pathFile);
            }
        }
        return listForSort;
    }

    static void addListToFile(int[] list, String pathToLogFile) throws SecurityException, IOException {
        try {
            File myFile = new File(pathToLogFile);
            FileWriter writer = new FileWriter(myFile, true);

            writer.write(Arrays.toString(list) + "\n");

            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}