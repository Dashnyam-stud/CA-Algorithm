package ca.algorithm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 *
 * @author ddash
 */
public class FoodItem {

    private String name;
    private double weight;
    private LocalDate bestBeforeDate;
    private LocalDateTime timeAdded;

    public FoodItem(String name, double weight,
            LocalDate bestBeforeDate) {

        this.name = name;
        this.weight = weight;
        this.bestBeforeDate = bestBeforeDate;
        this.timeAdded = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }

    public void displayInfo() {
        System.out.println("Food name: " + name);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Best before: " + bestBeforeDate);
        System.out.println("Time added: " + timeAdded);
    }
}

