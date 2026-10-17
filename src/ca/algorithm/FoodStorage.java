package ca.algorithm;

import ca.algorithm.FoodItem;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ddash
 */
public class FoodStorage {

    private static final int CAPACITY = 8;
    private FoodItem[] items;
    private int size;

    public FoodStorage() {
        items = new FoodItem[CAPACITY];
        size = 0;
    }

    public boolean addFood(FoodItem item) {
        if (isFull()) {
            System.out.println("Storage is full!");
            return false;
        }

        items[size] = item;
        size++;

        System.out.println("Food added successfully.");
        return true;
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
