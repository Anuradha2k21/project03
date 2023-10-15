package com.example.restdbdemo2.service;

import com.example.restdbdemo2.data.Lecturer;
import com.example.restdbdemo2.data.LecturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LecturerService {
    @Autowired
    private LecturerRepository lecRepo;
    public List<Lecturer> getAllLecturers(){
        return lecRepo.findAll();
    }
    public Lecturer getLecturerById(int id){
        Optional<Lecturer> lecObj=lecRepo.findById(id);
        if(lecObj.isPresent()){
            return lecObj.get();
        }
        return null;
    }
    public Lecturer createLecturer(Lecturer lecturer){
        return lecRepo.save(lecturer);
    }
    public Lecturer updateLecturer(Lecturer lecturer){
        return lecRepo.save(lecturer);
    }
    public void deleteLecturerById(int id){
        lecRepo.deleteById(id);
    }
    public List<Lecturer> findLecturerByName(String name){
        return lecRepo.findLecturerByName(name);
    }
}
