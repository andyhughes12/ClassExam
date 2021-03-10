package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee e1;

    @BeforeEach
    void init() {
        e1 = new Employee("Mr","Andrew",123456,"1234567","Full Time",18);
    }

    // 6 Passes

    @Test
    void testConstructorTitlePass(){
        assertEquals((e1.getTitle()),"Mr");
    }
    @Test
    void testConstructorNamePass(){
        assertEquals((e1.getName()),"Andrew");
    }
    @Test
    void testConstructorIDPass(){
        assertEquals((e1.getID()),123456);
    }
    @Test
    void testConstructorPhonePass(){
        assertEquals((e1.getPhone()),"1234567");
    }
    @Test
    void testConstructorEmploymentPass(){
        assertEquals((e1.getEmployment()),"Full Time");
    }

    @Test
    void testConstructorAgePass(){
        assertEquals((e1.getAge()),18);
    }

    // 6 Fails

    @Test
    void testConstructorTitleFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","Andrew",123456,"1234567","Full Time",18));
        assertEquals("Invalid Title", e.getMessage());
    }

    @Test
    void testConstructorNameFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Mr","A",123456,"1234567","Full Time",18));
        assertEquals("Invalid Name", e.getMessage());
    }

    @Test
    void testConstructorIDFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","Andrew",1234567,"1234567","Full Time",18));
        assertEquals("Invalid ID", e.getMessage());
    }

    @Test
    void testConstructorPhoneFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","Andrew",123456,"12345678","Full Time",18));
        assertEquals("Invalid Phone", e.getMessage());
    }

    @Test
    void testConstructorEmploymentFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","Andrew",123456,"12345678","1 day",18));
        assertEquals("Invalid Employment", e.getMessage());
    }

    @Test
    void testConstructorAgeFail()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Employee("Sir","Andrew",123456,"12345678","1 day",16));
        assertEquals("Invalid Age", e.getMessage());
    }
}
