/*
 * $Header$
 * $Revision$
 * $Date$
 */
package com.example.demo1;

import java.util.List;
import java.util.Optional;

/**
 * 概略
 * <p>概要・説明</p>
 * 
 * @author $Author$
 * @version $Revision$ $Date$
 */
public interface IStudent {
    List<Student> getAllStudents();
    Optional<Student> findById(int id);
    Optional<Student> findByEmail(String email);
    Student save(Student std);
    void deleteById(int id);
}
