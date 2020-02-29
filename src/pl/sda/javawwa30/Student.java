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

    void addCourseGrade(String course, int grade) {
        if(courses.length > num) {  //...czyli jest miejsce w tablicach
            courses[num] = course;
            grades[num] = grade;
        }
        else {  //...brak miejsca, trzeba rozszerzyc tablice
            //utworz nowa tablice o 2x wiekszym rozmiarze
            int[] modGrades = new int[grades.length * 2];
            //przepisz elementy ze starej tablicy do nowej

            //dodaj nowe dane kursu
            modGrades[num] = grade;
            //ustaw nowa tablice jako pole tego obiektu
            grades = modGrades;
        }

        num++;
    }

}
