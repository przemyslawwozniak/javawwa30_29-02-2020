package pl.sda.javawwa30;

public class Student {

    private String name, address;
    private int[] grades = new int[1];
    private String[] courses = new String[1];
    private int num = 0;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n" + address + "\n" +
                getGradesTxt() + "\n" + calcAvgGrade();
    }

    public String getGradesTxt() {
        if(courses[0] != null) {
            StringBuilder strBldr = new StringBuilder();

            for(int i = 0; i < num; i++) {
                strBldr.append(courses[i]);
                strBldr.append(" - ");
                strBldr.append((grades[i]));
                strBldr.append("; ");
            }

            String gradesTxt = strBldr.toString();
            return gradesTxt.substring(0, gradesTxt.length() - 2);
        }
        else {
            return "[brak ocen]";
        }
    }

    private double calcAvgGrade() {
        if(num > 0) {
            int sum = 0;

            for(int grade : grades)
                sum += grade;

            return sum*1.0/num;
        }
        else {
            return 0.0;
        }
    }

    public void printGrades() {
        System.out.println(getGradesTxt());
    }

    void addCourseGrade(String course, int grade) {
        if(courses.length <= num) {  //...czyli NIE MA miejsca w tablicach
            //utworz nowa tablice o 2x wiekszym rozmiarze
            int[] modGrades = new int[grades.length * 2];
            String[] modCourses = new String[courses.length * 2];
            //przepisz elementy ze starej tablicy do nowej
            for(int i = 0; i < grades.length; i++) {
                modGrades[i] = grades[i];
                modCourses[i] = courses[i];
            }
            //ustaw nowa tablice jako pole tego obiektu
            grades = modGrades;
            courses = modCourses;

            System.out.println("Zwiekszono rozmiar tablic do " + grades.length);
        }

        grades[num] = grade;
        courses[num] = course;
        num++;
    }

}
