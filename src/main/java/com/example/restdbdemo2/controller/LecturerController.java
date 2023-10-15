package com.example.restdbdemo2.controller;

import com.example.restdbdemo2.data.Lecturer;
import com.example.restdbdemo2.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LecturerController {
    @Autowired
    private LecturerService lec_service;
    @GetMapping(path = "/lecturers")
    public List<Lecturer> getAllLecturers(){
        return lec_service.getAllLecturers();
    }
    @GetMapping(path="/lecturers/{id}")
    public Lecturer getLecturerById(@PathVariable int id){
        return lec_service.getLecturerById(id);
    }
    @PostMapping(path = "/lecturers")
    public Lecturer createLecturer(@RequestBody Lecturer lecturer){
        return lec_service.createLecturer(lecturer);
    }
    @PutMapping(path = "/lecturers")
    public Lecturer updateLecturer(@RequestBody Lecturer lecturer){
        return lec_service.updateLecturer(lecturer);
    }
    @DeleteMapping(path = "/lecturers/{id}")
    public void deleteLecturerById(@PathVariable int id){
        lec_service.deleteLecturerById(id);
    }
    @GetMapping(path = "/lecturers", params="name")
    public List<Lecturer> findStudentByName(@RequestParam String name){
        return lec_service.findLecturerByName(name);
    }
}
