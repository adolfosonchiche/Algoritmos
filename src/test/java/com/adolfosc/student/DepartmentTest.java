package com.adolfosc.student;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author adolfo-son
 */
public class DepartmentTest {
    
    public DepartmentTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of printStudent method, of class Department.
     */
    @Test
    public void testPrintStudent() {
        System.out.println("printStudent");
        Department instance = new Department();
        instance.printStudent();
    }

    /**
     * Test of addStudent method, of class Department.
     */
    @Test
    public void testAddStudent() {
        System.out.println("addStudent");
        String name = "Hector";
        String lastName = "Son";
        Integer mark = 10;
        Department instance = new Department();
        
        Student stuendAdd = new Student(name, lastName);
        Map<Student, Integer> expResult = new HashMap<>();
        expResult.put(stuendAdd, mark);
        
        
        Map<Student, Integer> result = instance.addStudent(stuendAdd, mark);
        
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAddStudentMore() {
        System.out.println("addStudent");
        String name = "Hector";
        String lastName = "Son";
        Integer markOne = 10;
        Department instance = new Department();
        
        Integer markTwo = 20;
        
        Student studentOne = new Student(name, lastName);
        Student studentTwo = new Student(name, lastName);
        Map<Student, Integer> expResult = new HashMap<>();
        expResult.put(studentTwo, markTwo);
        
        
        Map<Student, Integer> result = instance.addStudent(studentOne, markOne);
        Map<Student, Integer> result2 = instance.addStudent(studentTwo, markTwo);
        
        
        assertEquals(expResult, result2);
    }
    
    
    
    
    
}
