import java.util.Scanner;
import java.io.*;
import java.util.*;
public class WriteToAFile {

    public static void main(String[] args) {

        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        // using StringBuilder() constructor
        StringBuilder input = new StringBuilder();
        String word = "";

        System.out.println("Enter your name: ");
        try {
            while(!word.equals("exit")){
               word = reader.readLine();
                input.append(word);
                input.append(" ");
            }

            System.out.println(input.toString());
        }

         catch (Exception e) {
            System.out.println("Error!");
        }
        FileWriter fWriter = null;
        BufferedWriter writer = null;

        try {
            StringTokenizer stringTokenizer = new StringTokenizer(input.toString(), " ");
            File fout = new File("out.txt");
            FileOutputStream fos = new FileOutputStream(fout);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            while (stringTokenizer.hasMoreTokens()) {
                bw.write(stringTokenizer.nextToken());
                bw.newLine();
            }

            bw.close();
        } catch (Exception e) {
        System.out.println("Error!");
    }
  }
}
