package com.antaladrien;

import java.util.ArrayList;

public class GroceryList {
    /*1. We need to actually tell it now what type of data is going into the ArrayList
    The array list is actually a class. So therefore it can have it's own constructor.*/
    private ArrayList<String> groceryList = new ArrayList<String>();

    /*2. We need to call a method that is part of the array's class to our
    the array list has got all the functionality to actually would determine
    where to save it, the amount of space to allocate*/
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    /*3. Size will return how many elements I've currently stored in the array list.*/
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    /*4. The next method we want is how to modify it. So in other words,
    how to replace an item as opposed to adding it.*/
    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }
    /*Here I'm using position + 1 when we're printing it out to the screen
    because humans obviously start counting from 1,
    but obviously the computer, always starts at 0 with its count.*/

    /*5. The last thing we need to know how to do is to remove an item.
    we're going to retrieve the item first so we can actually output it.*/
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position); /*That removes that item first automatically at that position */
    }

    /*6. The method is going to be find item so down here and type*/
    public String findItem(String searchItem) {
//        boolean exits = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}
