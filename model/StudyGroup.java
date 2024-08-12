package model;

import java.util.List;

public class StudyGroup {

    //Создать класс УчебнаяГруппа содержащая в себе поля Преподаватель и список Студентов.

    private Teacher teacher;
    private List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Учебная группа {" +
                "Преподаватель = " + teacher +
                ", Список студентов = " + studentList +
                '}';
    }
}
