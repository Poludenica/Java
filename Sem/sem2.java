package Sem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class sem2 {
    public static void main(String[] args) throws SecurityException, IOException {
        // System.out.println(longStringBuilding(11, 'a', 'b'));
        // System.out.println(stringCompress("dfdgdg"));
         String pathProject = System.getProperty("user.dir");
         String pathFile = pathProject.concat("\\seminar2-1.txt");
        //  addingToFile(pathFile, longStringCreate("World", 5));
         String pathFile2 = pathProject.concat("\\seminar2-2.txt");
         addListToFile(pathFile2, showCurrentFiles(pathProject));        
          
    }
// Дано четное число N (>0) и символы c1 и c2. Написать метод, 
// который вернет строку длины N, которая состоит из 
// чередующихся символов c1 и c2, начиная с c1.
static String longStringBuilding(int n, char c1, char c2){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            newStr.append(c1);
            newStr.append(c2);
        }
        return newStr.toString();
    }
    
// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd. Результат - a4b3cd2 для примера.
static String stringCompress(String str){
        StringBuilder newStr = new StringBuilder();
        char symbol = str.charAt(0);
        newStr.append(symbol);
        int count = 0;

        for (char letter: str.toCharArray()){
            if(letter == symbol) count++;
            else{
                if(count !=1) newStr.append(count);
                newStr.append(letter);
                symbol = letter;
                count = 1;
            }
        }
        if(count !=1) newStr.append(count); 
        return newStr.toString();
    }

// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение).
public static Boolean isPalindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }

public static Boolean isPalindrome2(String str) {
    StringBuilder res = new StringBuilder("");

    for (int i = str.length()-1; i >= 0; i--) 
        res.append(str.charAt(i));
    return str.equals(res.toString());
    }
      
// Напишите метод, который составит строку, состоящую из 100 повторений 
// слова TEST и метод, который запишет эту строку в простой текстовый файл,
//  обработайте исключения
static String longStringCreate(String word, int iters){
    StringBuilder newStr = new StringBuilder();

    for (int i = 0; i < iters; i++) {
        newStr.append(word);
    }
    return newStr.toString() + "\n";
}

static void addingToFile(String filePath, String text){
    try {
        File myFile = new File(filePath);
        FileWriter writer = new FileWriter(myFile, true);
    
        writer.write(text);
        writer.close();
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, 
// оно должно записаться в лог-файл.

static String[] showCurrentFiles(String dirPath){
    File currentDir = new File(dirPath);
    return currentDir.list();
}


static void addListToFile( String filePath, String[] list) throws SecurityException, IOException{
    Logger logger = Logger.getLogger(sem2.class.getName());
    FileHandler fh = new FileHandler("seminar2-3(log).txt");

    logger.addHandler(fh);

    SimpleFormatter simple = new SimpleFormatter();
    fh.setFormatter(simple);

    try {
        File myFile = new File(filePath);
        FileWriter writer = new FileWriter(myFile);

        for (String str : list){
            writer.write(str+ "\n");
        } writer.close();

    } catch (Exception e) {
        logger.warning(e.getMessage());
    }
}

}




