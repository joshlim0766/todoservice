package com.kakaopay.todolist.exception;

public class ContentNotFoundException extends Exception {
    public ContentNotFoundException () {
        super();
    }

    public ContentNotFoundException (String message) {
        super(message);
    }
}