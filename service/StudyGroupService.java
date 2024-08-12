package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroupService {

    /*
    Создать класс УчебнаяГруппаСервис, в котором реализована функция
    (входные параметры - (Teacher, List<Student>)) формирования из
    Студентов и Преподавателя УчебнойГруппы и возвращения его.
     */

    public StudyGroup CreateStudyGroup(Teacher teacher, List<Student> studentList){
        ArrayList<Student> studyGroup = new ArrayList<>();
        studentList.addAll(studentList);
        return new StudyGroup(teacher, studyGroup);
    }

}
