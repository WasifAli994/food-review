package dev.foodReviews.Food.exception;

public class FoodNotFoundException extends RuntimeException {
    public FoodNotFoundException() {
    }

    public FoodNotFoundException(String message) {
        super(message);
    }
}
