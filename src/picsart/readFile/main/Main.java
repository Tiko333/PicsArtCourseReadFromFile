package picsart.readFile.main;

import picsart.readFile.model.Student;
import picsart.readFile.service.ConverterService;
import picsart.readFile.service.FileService;
import picsart.readFile.service.StudentService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] strings = FileService.readStudentsFile();
        Student[] students = ConverterService.convertToStudent(strings);

        StudentService.printFullNames(students);
        StudentService.printAllMaleStudents(students);
        StudentService.printFemaleStudentsWhoHasMarkGreaterThenFiftyPointFour(students);
        StudentService.printFemaleStudentsSortedByYear(students);
        StudentService.printStudentsSortedByMark(students);
        StudentService.printBiggestMaleStudent(students);
        StudentService.printStudentHavingMinMark(students);
    }
}

