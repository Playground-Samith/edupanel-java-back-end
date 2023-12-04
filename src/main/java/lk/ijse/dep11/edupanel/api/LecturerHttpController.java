package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class LecturerHttpController {

    @PostMapping
    public void createNewLecturer(){
        System.out.println("createNewLecturer()");
    }


    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("updateLecturerDetails()");
    }


    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("deleteLecturer()");

    }

    @GetMapping
    public void getAllLecturers(){
        System.out.println("getAllLecturers()");

    }


}
