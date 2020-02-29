package pl.sda.javawwa30;

public class StudentRunner {

    public static void main(String[] args) {
        Student s1 = new Student("PW", "Wwa");  //courses = {}; grades = {};
        s1.calcAvgGrade;    //0.0
        s1.printGrades; //""

        s1.addCourseGrade("Mat", 5); //courses = {"Mat}; grades = {5};
        s1.calcAvgGrade;    //5.0
        s1.printGrades; //"Mat - 5"
        /*
        PW
        Wwa
        Mat - 5
        5.0
         */
        s1.toString;

        s1.addCourseGrade("Fiz", 4);//courses = {"Mat", "Fiz"}; grades = {5, 2};
        s1.addCourseGrade("Inf", 3);//courses = {"Mat", "Fiz", "Inf"}; grades = {5, 2, 3};
        s1.calcAvgGrade;    //12 / 3 = 4.0
        s1.printGrades; //"Mat - 5; Fiz - 4; Inf - 3"
    }

}
