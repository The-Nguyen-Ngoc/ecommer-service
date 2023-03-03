package com.vn.ecommerservice.exception;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class ErrorDTO {
    private Date timestamp;
    private int status;
    private String path;
    private List<String> errors = new ArrayList<>();

    public void addErrors(String error){
        this.errors.add(error);
    }

}
