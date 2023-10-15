package com.example.restdbdemo2.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,Integer> {
    @Query("select lec from Lecturer lec where name=?1")
    public List<Lecturer> findLecturerByName(String name);
}
