package Universities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class UniversityFileProcessor {

    public static List<String> findFiles(Path directory, String extension){
        try {
            List<String> outcome = Files.walk(directory).filter(Files::isRegularFile).filter(path -> path.toString().endsWith(extension)).map(Path::toString).toList();
            return outcome;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<String> readFile(Path file){
        List<String> outcome = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file.toFile()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.trim().isEmpty()) { // optional: skips empty lines
                    outcome.add(line);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println("error reading from file");
        }

        return outcome;

    }

    //Student(int id, String name, int age, String course, String libraryCardNumber, String email)
    public static Student convertToStudent(String record){
       String[] inputParam = record.split(",");
       Student st = new Student(Integer.parseInt(inputParam[0]), inputParam[1], Integer.parseInt(inputParam[2]), inputParam[3], inputParam[4], inputParam[5]  );
       return st;
    }

    public static List<Student> convertStudents(List<String> records){
        return records.stream().map(UniversityFileProcessor::convertToStudent).toList();
    }

    public static List<Student> findStudentsByCourse(List<Student> students, String course){
       return students.stream().filter(n->n.getCourse().equals(course)).toList();
    }
}
