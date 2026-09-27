package com.example.CollectionStdAPI.dto;

import com.example.CollectionStdAPI.Student.StudentDetails;
import com.example.CollectionStdAPI.dto.ResposeDto;

public class ResponseDtoConverter {

    public static ResposeDto toResponseDto(StudentDetails student) {
        ResposeDto dto = new ResposeDto();
        dto.setId(student.getId());

        // Split full name into first and last
        String fullName = student.getName();
        if (fullName != null && !fullName.isEmpty()) {
            String[] parts = fullName.split(" ", 2); // split into 2 parts only
            dto.setFirstName(parts[0]); // first word
            dto.setLastName(parts.length > 1 ? parts[1] : ""); // remainder
        }

        // CompanyName is already defaulted to "TCS" in your DTO
        return dto;
    }
}
