package dev.foodReviews.Food.exception;

public class ReviewNotFoundException extends RuntimeException{

    public ReviewNotFoundException() {
    }

    public ReviewNotFoundException(String message) {
        super(message);
    }
}
