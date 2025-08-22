package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {

    @Test
    void testReadData() {
        StudentHardCodeDatasource ds = new StudentHardCodeDatasource();
        StudentList list = ds.readData();
        assertEquals(4, list.getStudents().size());
    }

}