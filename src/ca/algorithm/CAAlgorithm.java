/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.algorithm;

import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author ddash
 */
public class CAAlgorithm {

    

         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FoodStorage storage = new FoodStorage();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Fast Food Storage ===");
            System.out.println("1. Add food item");
            System.out.println("2. Remove food item");
            System.out.println("3. Display food items");
            System.out.println("4. Peek top food item");
            System.out.println("5. Search food item");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    if (storage.isFull()) {
                        System.out.println("Storage is full!");
                        break;
                    }

                    System.out.print("Enter food name: ");
                    String name = input.nextLine();

                    System.out.print("Enter weight in grams: ");
                    double weight;

                    try {
                        weight = Double.parseDouble(input.nextLine());

                        if (weight <= 0) {
                            System.out.println(
                                "Weight must be greater than zero."
                            );
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid weight.");
                        break;
                    }

                    System.out.print(
                        "Enter best-before date (YYYY-MM-DD): "
                    );
                    LocalDate date;

                    try {
                        date = LocalDate.parse(input.nextLine());
                    } catch (Exception e) {
                        System.out.println(
                            "Invalid date. Use YYYY-MM-DD."
                        );
                        break;
                    }

                    System.out.print("Enter food type: ");
                    String type = input.nextLine();

                    FastFoodItem food = new FastFoodItem(
                        name, weight, date, type
                    );

                    storage.addFood(food);
                    break;

                case "2":
                    FoodItem removed = storage.removeFood();

                    if (removed != null) {
                        System.out.println("Removed food: "
                                + removed.getName());
                    }
                    break;

                case "3":
                    storage.displayFoodItems();
                    break;


                case "4":
                    System.out.println(
                        
                    );
                    break;

                case "5":
                    System.out.println(
                        
                    );
                    break;

                case "6":
                    running = false;
                    System.out.println("Application closed.");
                    break;

                default:
                    System.out.println(
                        "Invalid option. Try again."
                    );
            }
        }

        input.close();
    }
}