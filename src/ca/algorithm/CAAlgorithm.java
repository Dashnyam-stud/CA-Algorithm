/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ca.algorithm;

import java.util.Scanner;

/**
 *
 * @author ddash
 */
public class CAAlgorithm {

    public class Main {

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

}
