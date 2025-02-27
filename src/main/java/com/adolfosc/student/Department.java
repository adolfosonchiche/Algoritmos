/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.adolfosc.student;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adolfo-son
 */
public class Department {

    Map<Student, Integer> students = new HashMap<>();

    public void printStudent() {
        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            Student student = entry.getKey();
            Integer mark = entry.getValue();
            System.out.printf("Student %s %s Nota: %s", student.getName(), student.getLastName(), mark.toString());
        }
    }

    public Map<Student, Integer> addStudent(Student student, Integer mark) {

        for (Map.Entry<Student, Integer> entry : students.entrySet()) {
            Student studentAdd = entry.getKey();
            Integer markAdd = entry.getValue();

            if (studentAdd.getLastName().equals(student.getLastName())
                    && studentAdd.getName().equals(student.getName())) {
                students.replace(student, markAdd, mark);
                return students;
            }

        }
        students.put(student, mark);
        return students;
    }
    
    
    // COMPLEJIDAD O(n)

}
