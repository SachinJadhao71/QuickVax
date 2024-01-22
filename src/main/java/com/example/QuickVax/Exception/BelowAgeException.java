package com.example.QuickVax.Exception;

public class BelowAgeException extends RuntimeException{

    public BelowAgeException(String message){
        super(message);
    }
}
