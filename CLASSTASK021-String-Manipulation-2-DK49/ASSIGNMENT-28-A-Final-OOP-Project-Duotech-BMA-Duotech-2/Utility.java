import java.io.*;
import java.io.BufferedReader;
//import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class Utility {
    public static void main(String[] args) {

    }
    public static List<String[]> readFromCSV(String file) throws IOException {
        String read;
        String name = "";
        BufferedReader dr = new BufferedReader(new FileReader(file));
        List<String[]> result = new ArrayList<>();
        try {
        while ((read = dr.readLine()) != null){
            String[] each = read.split(",");
            result.add(each);}
        dr.close();
         }catch (IOException e){
            System.out.println("Error with folder ");
         }
        return result;
    }
}
