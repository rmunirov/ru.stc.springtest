package ru.innopolis.stc.springtest.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.ui.Model;
import ru.innopolis.stc.springtest.entity.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

class StudentControllerTest {
    private StudentController studentController;
    @Mock private Student student;
    @Mock private Model model;

    @BeforeEach
    void setUp() {
        initMocks(this);
        studentController = new StudentController();
    }

    @Test
    void student() {
        assertNotNull(studentController.student());
    }

    @Test
    void addStudent() {
        when(student.getAge()).thenReturn(15);
        when(student.getId()).thenReturn(1);
        when(student.getName()).thenReturn("Vasya");
        when(model.addAttribute(any())).thenReturn(model);
        assertEquals("result", studentController.addStudent(student, model));
    }
}