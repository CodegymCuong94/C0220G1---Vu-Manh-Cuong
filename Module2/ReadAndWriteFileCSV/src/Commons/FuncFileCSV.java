package Commons;

import Models.Student;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER_STUDENT = "name, grade, address";
    private static final String fileNameStudent = "Data/Student.scv";

//    public static void writeStudentToFileCSV(ArrayList<Student> ListStudent) {
//        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter(fileNameStudent);
//            fileWriter.append(FILE_HEADER_STUDENT);
//            fileWriter.append(NEW_LINE_SEPARATOR);
//        } catch (Exception ex) {
//            System.out.println("Error in FileWriter CVS");
//        } finally {
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            }
//        }catch(Exception ) {
//                System.out.println("Error when flush / close");
//        }
//    }



}
