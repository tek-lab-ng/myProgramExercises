package Universities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reading {
    public static void main(String[] args) throws IOException
    {

//        FileInputStream sourceStream = null;
//        FileOutputStream targetStream = null;
//
//        try {
//            sourceStream
//                    = new FileInputStream("sourcefile.txt");
//            targetStream
//                    = new FileOutputStream("targetfile.txt");
//
//            // Reading source file and writing content to target file byte by byte
//            int temp;
//            while ((
//                    temp = sourceStream.read())
//                    != -1)
//                targetStream.write((byte)temp);
//        }
//        finally {
//            if (sourceStream != null)
//                sourceStream.close();
//            if (targetStream != null)
//                targetStream.close();}


        File file = new File("example.txt");

        Path filepath = Paths.get("C:\\Users\\Gabriel.Osaji\\Documents\\Public Class A\\RealLearning\\src\\main\\java\\Universities");


       try {
           long value = Files.walk(filepath)
                   .filter(Files::isRegularFile)
                   .count();
           System.out.println("The value of the files is: " + value);
           Files.walk(filepath).filter(path-> path.toString().endsWith("java")).forEach(System.out::println);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
