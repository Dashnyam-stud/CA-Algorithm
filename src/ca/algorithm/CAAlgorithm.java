/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.algorithm;
import java.time.LocalDateTime;
/**
 *
 * @author ddash
 */
public class CAAlgorithm {

    public class FoodItem {
    private String name;
    private double weight; // by gram
    private String bestBeforeDate; // maximium 2 weeks
    private LocalDateTime timeAdded;

    // Байгуулагч (Constructor)
    public FoodItem(String name, double weight, String bestBeforeDate) {
        this.name = name;
        this.weight = weight;
        this.bestBeforeDate = bestBeforeDate;
        this.timeAdded = LocalDateTime.now();
    }

    // Getter болон Setter методууд
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    public LocalDateTime getTimeAdded() {
        return timeAdded;
    }

    @Override
    public String toString() {
        return "FoodItem [Name=" + name + ", Weight=" + weight + "g, Best Before=" + bestBeforeDate + ", Time Added=" + timeAdded + "]";
    }
}
    
}
