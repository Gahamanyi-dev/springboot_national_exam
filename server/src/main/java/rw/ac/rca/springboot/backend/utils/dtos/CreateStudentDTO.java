package rw.ac.rca.springboot.backend.utils.dtos;

import lombok.Data;

@Data
public class CreateStudentDTO {

    private String names;

    private String nationalId;

    private String phoneNumber;

    private String email;
}
