package picsart.readFile.service;

import picsart.readFile.model.Student;

public class ConverterService {

    private static final String COMMA = ",";
    private static final int FIRST_NAME_INDEX = 0;
    private static final int LAST_NAME_INDEX = 1;
    private static final int YEAR_INDEX = 2;
    private static final int GENDER_INDEX = 3;
    private static final int MARK_INDEX = 4;

    private ConverterService() {
    }

    public static Student[] convertToStudent(String[] students) {
        Student[] studentsArray = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            String student = students[i];
            String[] split = student.split(COMMA);
            String firstName = String.valueOf(split[FIRST_NAME_INDEX]);
            String lastName = String.valueOf(split[LAST_NAME_INDEX]);
            int year = Integer.parseInt(split[YEAR_INDEX]);
            String gender = String.valueOf(split[GENDER_INDEX]);
            double mark = Double.parseDouble(split[MARK_INDEX]);

            studentsArray[i] = new Student(firstName, lastName, year, gender, mark);
        }

        return studentsArray;
    }
}
