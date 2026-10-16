/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.algorithm;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Scanner;

/**
 *
 * @author ddash
 */
public class CAAlgorithm {

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

    public class FoodStorage {

        private static final int CAPACITY = 8;
        private FoodItem[] items;
        private int size;

        public FoodStorage() {
            items = new FoodItem[CAPACITY];
            size = 0;
        }

        public boolean isFull() {
            return size == CAPACITY;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int getSize() {
            return size;
        }

        public int getCapacity() {
            return CAPACITY;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println(" Fast Food Storage Application");
        System.out.println("================================");

        boolean running = true;

        while (running) {
            System.out.println("\n1. Add food item");
            System.out.println("2. Remove food item");
            System.out.println("3. Display food items");
            System.out.println("4. Peek top food item");
            System.out.println("5. Search food item");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Add operation will be added.");
                    break;

                case "2":
                    System.out.println("Remove operation will be added.");
                    break;

                case "3":
                    System.out.println("Display operation will be added.");
                    break;

                case "4":
                    System.out.println("Peek operation will be added.");
                    break;

                case "5":
                    System.out.println("Search operation will be added.");
                    break;

                case "6":
                    running = false;
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        input.close();
    }

}
