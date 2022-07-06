/*
 * $Header$
 * $Revision$
 * $Date$
 */
package com.example.demo1;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 概略
 * <p>概要・説明</p>
 * 
 * @author $Author$
 * @version $Revision$ $Date$
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // Query method
    Optional<Student> findByEmail(String email);
}