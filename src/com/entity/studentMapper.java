package com.entity;

import java.util.HashMap;
import java.util.List;

/**
 * Created by wei on 2020/4/19.
 */
public interface studentMapper {
    public abstract  Student queryStudentByStuno(int stuno);
    public abstract List<Student> queryAllStudent();
    public abstract  void addStudent(Student stu);
    public abstract  void deleteStudent(Student stu);
    public abstract  void updateStudent(Student stu);
    public abstract  void addStudentwithConvert(Student stu);
    public abstract  List<Student> querystudentByColumn(String column);
    public abstract  List<Student> queryByNameorAge(Student stu);
    public abstract  List<Student> queryByAddress(Student stu);
    public abstract  List<Student> queryByNameorAgeHashMap(HashMap<String, Object> map);
    public abstract  List<Student> queryByStuNo(Grade grade);
    public abstract  List<StudentBusiness> queryByStuAndCard(int stuno);
    public abstract  List<Student> queryByStuAndCardoo(int stuno);
}

