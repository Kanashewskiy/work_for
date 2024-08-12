package Controller;

import View.StudentView;
import model.*;
import service.DataService;
import service.StudyGroupService;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();

    private final StudentView view = new StudentView();

    private final StudyGroupService studyGroupService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<User> userList = service.getAllStudent();
        for(User user: userList){
            Student student = (Student) user;
            view.printConsole(student);
        }
    }
            /*
        Создать метод в Контроллере, в котором агрегируются функции получения списка студентов
        (их id) и преподавателя (его id) и формирования учебной группы, путем вызова метода из сервиса.
        */

    public StudyGroup createGroup(Teacher teacher, List<Student> studentList){
        return studyGroupService.CreateStudyGroup(teacher, studentList);
    }

}
