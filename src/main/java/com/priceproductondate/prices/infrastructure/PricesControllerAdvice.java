package com.priceproductondate.prices.infrastructure;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.UUID;

@ControllerAdvice
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
@Slf4j
public class PricesControllerAdvice {

    @ExceptionHandler(Throwable.class)
    @ApiResponse(responseCode = "500",description = "Unexpected error")
    public ResponseEntity<Problem> problem(final Throwable e) {

        String message = e.getMessage();
        UUID uuid = UUID.randomUUID();
        String logRef = uuid.toString();
        log.error("logRef=" + logRef, message, e);

        return new ResponseEntity<>(new Problem(logRef, message), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    @ApiResponse(responseCode = "400",description = "Bad request")
    public ResponseEntity<ErrorMessage> handleIllegalArgumentException(MethodArgumentTypeMismatchException ex) {

        Throwable mostSpecificCause = ex.getCause();
        ErrorMessage errorMessage;
        if (mostSpecificCause != null) {
            String exceptionName = mostSpecificCause.getClass().getName();
            String message = mostSpecificCause.getMessage();
            errorMessage = new ErrorMessage(exceptionName, message);
        } else {
            errorMessage = new ErrorMessage(ex.getMessage());
        }
        return new ResponseEntity(errorMessage,  HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(PriceNotFoundException.class)
    @ApiResponse(responseCode = "404",description = "Price not found")
    public ResponseEntity<Problem> handlePriceNotFound(PriceNotFoundException ex) {

        String message = ex.getMessage();
        UUID uuid = UUID.randomUUID();
        String logRef = uuid.toString();
        log.error("logRef=" + logRef, message, ex);

        return new ResponseEntity(new Problem(logRef, message),HttpStatus.NOT_FOUND);

    }
}
