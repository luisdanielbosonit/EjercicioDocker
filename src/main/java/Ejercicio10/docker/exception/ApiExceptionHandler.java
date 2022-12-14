package Ejercicio10.docker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class ApiExceptionHandler {
    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomError hadlerEntytyNotFoutException(EntityNotFoundException e) {
        return new CustomError(e.getMessage(), HttpStatus.FOUND);
    }

    @ExceptionHandler(value = {UnprocessableEntityException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public CustomError handleUnprocessableEntityException(EntityNotFoundException e) {
        return new CustomError(e.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);

    }
}




