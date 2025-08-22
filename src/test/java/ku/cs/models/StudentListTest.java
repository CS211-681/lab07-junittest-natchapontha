package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    static StudentList studentList;
    @BeforeEach
    void setUp() {
        studentList = new StudentList();
    }

    @Test
    void testAddNewStudent() {
        studentList.addNewStudent("6715844654", "Alex");
        studentList.addNewStudent("6715844444", "Albon");

        ArrayList<Student> students = studentList.getStudents();
        assertEquals("6715844654", students.get(0).getId());
        assertEquals("Alex", students.get(0).getName());
        assertEquals(0, students.get(0).getScore());
        assertEquals(2 , students.size());
    }

    @Test
    void testAddNewStudent2() {
        studentList.addNewStudent("6715844654", "Alex", 40);
        studentList.addNewStudent("6715844444", "Albon", 45.5);

        ArrayList<Student> students = studentList.getStudents();
        assertEquals("6715844654", students.get(0).getId());
        assertEquals("Alex", students.get(0).getName());
        assertEquals(40, students.get(0).getScore());;
        assertEquals(2 , students.size());
    }

    @Test
    void testFindStudentById() {
        studentList.addNewStudent("6715844654", "Alex", 40);
        studentList.addNewStudent("6715844444", "Albon", 45.5);
        assertEquals("6715844654",  studentList.findStudentById("6715844654").getId());
        assertEquals("6715844444", studentList.findStudentById("6715844444").getId());
    }

    @Test
    void testFilterByName() {
        studentList.addNewStudent("6715844654", "Blex", 40);
        studentList.addNewStudent("6715844444", "Blbon", 45.5);
        studentList.addNewStudent("6715844884", "Natchapon", 45.5);

        StudentList filteredList = studentList.filterByName("A");
        for (Student student : filteredList.getStudents()) {
            assertEquals(true, student.isNameContains("A"));
        }
    }

    @Test
    void testGiveScoreToId() {
        studentList.addNewStudent("6715844654", "Alex", 40);
        studentList.giveScoreToId("6715844654", 30);
        assertEquals(70,  studentList.getStudents().get(0).getScore());
    }

    @Test
    void testViewGradeOfId() {
        studentList.addNewStudent("6715844654", "Alex", 80);
        assertEquals("A",  studentList.viewGradeOfId("6715844654"));
    }



}