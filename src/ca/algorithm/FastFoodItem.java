package ca.algorithm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ddash
 */

public class FastFoodItem extends FoodItem {
    private String foodType;

    public FastFoodItem(String name, double weight,
                        java.time.LocalDate bestBeforeDate,
                        String foodType) {
        super(name, weight, bestBeforeDate);
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Food type: " + foodType);
    }
}

