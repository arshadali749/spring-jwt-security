package com.jwt.sercurity.dto;


import lombok.*;

import javax.persistence.Entity;
@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
@Builder
public class ResponseDto {
    private Object object;
    private String description;

}
