package Exceptions_Homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData(); 
        String newFileName = null;
        WriteAsTxt writeFile = new WriteAsTxt();

        HashMap<String, Object> data = parsData.parsInputData(); 
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        } 

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String folderPath = "Homework_3/data";
        File folder = new File(folderPath);
        if (!folder.exists()) {
        folder.mkdirs();
        }
        String filePath = folderPath + File.separator + newFileName;
        System.out.println(filePath);
        try (FileWriter writer = new FileWriter(filePath)) {
         writer.write(sb.toString());
         System.out.println("Файл успешно записан.");
        } catch (IOException e) {
         System.out.println("Произошла ошибка при записи файла: " + e.getMessage());
        } 

    }
}

