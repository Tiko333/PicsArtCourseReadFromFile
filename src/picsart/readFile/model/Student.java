package picsart.readFile.model;

public class Student {
    private String firstName;
    private String lastName;
    private int year;
    private String gender;
    private double mark;

    public Student() {
    }

    public Student(String firstName, String lastName, int year, String gender, double mark) {
        setFirstName(firstName);
        setLastName(lastName);
        setYear(year);
        setGender(gender);
        setMark(mark);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && firstName.length() > 2) {
            this.firstName = firstName;
            return;
        }
        System.err.println("First name must have at least 2 characters");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null && lastName.length() > 2) {
            this.lastName = lastName;
            return;
        }
        System.err.println("Last name must have at least 2 characters");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1900 && year <= 2020) {
            this.year = year;
            return;
        }
        System.err.println("Year must be from 1901 to 2020");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && gender.length() == 1) {
            this.gender = gender;
            return;
        }
        System.err.println("gender must have 1 character or 'f' or 'm'");
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark > 0 && mark < 100) {
            this.mark = mark;
            return;
        }
        System.err.println("Mark must be from 1 to 100");
    }

    public void printInfo() {
        System.out.println(
                "\nFirst name: " + firstName + " \n" +
                "Last name: " + lastName + " \n" +
                "Year of birth: " + year + " \n" +
                "Gender: " + (gender.equals("f") ? "female" : "male") + " \n" +
                "Mark: " + mark + " \n");
    }
}
