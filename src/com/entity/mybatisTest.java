package com.entity;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.entity.Student;

/**
 * Created by wei on 2020/4/15.com/entity/config.xml
 */
public class mybatisTest {
    public static void main(String[] args) throws IOException {
        queryByStuAndCardootest();
        //queryByStuAndCardName();
        //queryByStuNo();
        //queryByNameorAgeHashMap();
        //queryByAddress();
       // queryByNameorAge();
      //  querystudentByColumn();
        //addStudentwithConvert();
        //updateStudent();
        //delstudent();
        //addStudent();
        //  queryAll();
        // query();
        /*Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        String statement = "com.entity.studentMapper."+"updateStudent";
        System.out.println(statement);
        //List<Student> student = sqlSession.selectList(statement,1);
        // Student student = sqlSession.selectOne(statement,1);
        // List<Student> student = sqlSession.selectList(statement);
        Student student = new Student(2,"xs",3,"11");
        // int insert = sqlSession.insert(statement,student);
        //  int delete = sqlSession.delete(statement, 3

        int update = sqlSession.update(statement, student);
        System.out.println(update);
        sqlSession.commit();
        // System.out.println(student.size());*/
    }
    public  static void query() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        Student student = studentMapper.queryStudentByStuno(1);
        System.out.println(student);
    }
    public static void queryAll() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        List<Student> stulist = (List<Student>) studentMapper.queryAllStudent();
        for (int i = 0; i <stulist.size() ; i++) {
            Student student = stulist.get(i);
            System.out.println(student);
        }
    }
    public static void addStudent() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
       // Student student = new Student(3,"xs",3,"11");
       // studentMapper.addStudent(student);
        sqlSession.commit();
    }
    public static void delstudent() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
       // Student student = new Student(3,"xs",3,"11");
       // studentMapper.deleteStudent(student);
        sqlSession.commit();
    }
    public static void updateStudent() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        //Student student = new Student(2,"xs",3,"15");
        //studentMapper.updateStudent(student);
        sqlSession.commit();
    }

    public static void addStudentwithConvert() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        //Student student = new Student(3,"xs",3,"11");
       // student.setStusex(true);
      //  studentMapper.addStudentwithConvert(student);
        sqlSession.commit();
    }

    public static  void querystudentByColumn() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
       // Student student = new Student(3,"xs",3,"11");
      //  student.setStusex(true);
        List<Student> stulist = studentMapper.querystudentByColumn("stuno");
        System.out.println(stulist);
        // sqlSession.commit();
    }

    public static  void queryByNameorAge() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        Student student = new Student();
        student.setStuage(11);
        student.setStuname("%z%");
        List<Student> stulist = studentMapper.queryByNameorAge(student);
        System.out.println(stulist);
        // sqlSession.commit();
    }
    public static  void queryByAddress() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        //Student student = new Student();
     //   Address address = new Address("ssjy", "hz");
        Student student = new Student();
        Address address = new Address();
        address.setHomeAddress("ssjy");
        address.setSchoolAddress("hz");
        student.setAddress(address);
        List<Student> stulist = studentMapper.queryByAddress(student);
        System.out.println(stulist);
        // sqlSession.commit();
    }
    public static  void queryByNameorAgeHashMap() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("stuage",11);
        map.put("stuname","zs");
        List<Student> students = studentMapper.queryByNameorAgeHashMap(map);
        System.out.println(students);
    }
    public static  void queryByStuNo() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
     //   HashMap<String, Object> map = new HashMap<String, Object>();
     //   map.put("stuage",11);
     //  map.put("stuname","zs");
       // List<Student> students = studentMapper.queryByNameorAgeHashMap(map);
        Grade grade = new Grade();
       // List<Integer> list = new A<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        grade.setStuNos(list);
        List<Student> students = studentMapper.queryByStuNo(grade);
        System.out.println(students);
        //System.out.println(students);
    }

    public static  void queryByStuAndCardName() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        //   HashMap<String, Object> map = new HashMap<String, Object>();
        //   map.put("stuage",11);
        //  map.put("stuname","zs");
        // List<Student> students = studentMapper.queryByNameorAgeHashMap(map);

        List<StudentBusiness> StudentBusiness = studentMapper.queryByStuAndCard(2);
        System.out.println(StudentBusiness);
        //System.out.println(students);
    }
    public static  void queryByStuAndCardootest() throws IOException{
        Reader resourceAsReader = Resources.getResourceAsReader("com/entity/config.xml");
        System.out.println(resourceAsReader);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        //SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        studentMapper studentMapper = sqlSession.getMapper(studentMapper.class);
        List<Student> students = studentMapper.queryByStuAndCardoo(2);
        System.out.println(students);
    }

}
