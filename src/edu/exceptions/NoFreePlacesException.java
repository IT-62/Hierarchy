package edu.exceptions;

public class NoFreePlacesException extends Exception{
    public NoFreePlacesException(String message) {
        super(message);
    }
}
