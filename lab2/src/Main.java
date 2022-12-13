import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> str=new ArrayList<>();
        String line = new String();
        BufferedReader bufferedReader = null; //read from file
        Scanner in = new Scanner(System.in);
        System.out.println("Input txt File name: ");
        String v = in.nextLine();
        try {
            File file = new File(v);
            if(!file.exists())
                file.createNewFile();
            bufferedReader = new BufferedReader(new FileReader(v));
            while((line=bufferedReader.readLine())!=null){ //поки рядок щось містить то воно зчитує рядки
                System.out.println(line);
                str.add(line);
            }
            bufferedReader.close(); //save text in file
            CreateNewFileTXT(str);
        }catch(IOException e) {
            System.out.println("ERROR1");
        }finally{
            try {
                bufferedReader.close();
            }catch (IOException e){
            }
        }

    }
    public static void CreateNewFileTXT(ArrayList<String> list) throws IOException {
        Scanner in = new Scanner(System.in);
        String str;
        System.out.println("Input txt File name: ");
        String v = in.nextLine();
        int strs=list.size(); //save number of lines in file
        File file = new File(v);
        if(!file.exists()){
            file.createNewFile();}
        PrintWriter printWriter = new PrintWriter(file); // write to file
        for(int i=0;i<strs;i++){
            printWriter.println(list);
        }
        printWriter.close();
    }
}