package com.stayfinderWebsite.exception;

public class InvalidBookingRequestException extends RuntimeException {
    public InvalidBookingRequestException(String s) {
        super(s);
    }
}
