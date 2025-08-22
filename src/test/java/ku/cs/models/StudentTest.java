package ku.cs.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static Student s;


//    @BeforeAll
//    static void initial() {
//        s = new Student("6715844654", "Alex");
//    }

    @BeforeEach
    void setup() {
        s = new Student("6715844654", "Alex");
    }

    @Test
    @DisplayName("ทดสอบการเพิ่มคะแนน 40")
    void testAddScore() {
        s.addScore(40);
        assertEquals(40, s.getScore());
    }

    @Test
    void testCalculateGrade() {
        s.addScore(85.2);
        assertEquals("A", s.getGrade());
    }

    @Test
    void testChangeName() {
        s.changeName("Albon");
        assertEquals("Albon", s.getName());
    }

    @Test
    void testIsId() {
        assertEquals(true, s.isId(s.getId()));
    }

    @Test
    void testIsNameContains() {
        assertEquals(true, s.isNameContains(s.getName()));
    }
}