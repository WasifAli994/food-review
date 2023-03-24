package dev.foodReviews.Food.exception;

public class RestrauntNotFoundException extends RuntimeException{

    public RestrauntNotFoundException() {
    }

    public RestrauntNotFoundException(String message) {
        super(message);
    }
}
