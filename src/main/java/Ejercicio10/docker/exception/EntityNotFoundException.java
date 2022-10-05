package Ejercicio10.docker.exception;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class EntityNotFoundException extends RuntimeException{

    Date timeStamp;
    private HttpStatus httpStatus;

    public EntityNotFoundException(String message, HttpStatus httpStatus, Date timeStamp ){
        super(message);


    }


}
