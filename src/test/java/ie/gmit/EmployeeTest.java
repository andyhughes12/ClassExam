package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee e1;

    @BeforeEach
    void init() {
        e1 = new Employee("Mr","Andy",123456,"1234567","Full Time",18);
    }

    // 5 Passes

    @Test
    void testConstructorTitlePass(){
        assertEquals((e1.getTitle()),"Mr");
    }
    @Test
    void testConstructorNamePass(){
        assertEquals((e1.getName()),"Andy");
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

    // 5 Fails
}
