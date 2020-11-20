package picsart.readFile.service;

import picsart.readFile.model.Student;

public class StudentService {

    private static final String MALE = "m";
    private static final String FEMALE = "f";

    private StudentService() {
    }

    public static void printFullNames(Student[] students) {
        System.out.println("\nFull names of students:");
        for (Student student : students) {
            System.out.printf("%s %s%n", student.getFirstName(), student.getLastName());
        }
    }

    public static void printAllMaleStudents(Student[] students) {
        System.out.println("\nAll male students:");
        for (Student student : students) {
            if (student.getGender().equals(MALE)) {
                student.printInfo();
            }
        }
    }

    public static void printFemaleStudentsWhoHasMarkGreaterThenFiftyPointFour(Student[] students) {
        System.out.println("\nAll female students who has mark greater then 50.4:");
        for (Student student : students) {
            if (student.getGender().equals(FEMALE) && student.getMark() > 50.4) {
                student.printInfo();
            }
        }
    }

    public static void printStudentHavingMinMark(Student[] students) {
        System.out.println("\nStudent information having the minimal mark:");
        Student studentWithMinMark = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getMark() < studentWithMinMark.getMark()) {
                studentWithMinMark = students[i];
            }
        }

        studentWithMinMark.printInfo();
    }

    public static void printBiggestMaleStudent(Student[] students) {
        System.out.println("\nBiggest male student:");
        Student biggestMaleStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() > biggestMaleStudent.getYear() && students[i].getGender().equals(MALE)) {
                biggestMaleStudent = students[i];
            }
        }

        biggestMaleStudent.printInfo();
    }

    public static void printStudentsSortedByMark(Student[] students) {
        System.out.println("\nStudents sorted by mark:");
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getMark() > students[j].getMark()) {
                    Student temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
        for (Student student: students) {
            student.printInfo();
        }
    }

    public static void printFemaleStudentsSortedByYear(Student[] students) {
        System.out.println("\nFemale students sorted by year:");
        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j - 1].getYear() > students[j].getYear()) {
                    Student temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }
        for (Student student: students) {
           if (student.getGender().equals(FEMALE)) {
               student.printInfo();
           }
        }
    }

    public static void printAll(Student[] students) {
        for (Student student : students) {
            student.printInfo();
        }
    }
}
