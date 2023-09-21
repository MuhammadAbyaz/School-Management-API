package com.abyaz.dao;

import com.abyaz.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDAO extends JpaRepository <Teacher,Integer>{
}
