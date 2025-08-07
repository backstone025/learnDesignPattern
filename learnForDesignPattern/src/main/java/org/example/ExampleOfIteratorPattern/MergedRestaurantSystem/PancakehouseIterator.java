package org.example.ExampleOfIteratorPattern.MergedRestaurantSystem;

import java.util.ArrayList;

public class PancakehouseIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position = 0;

    public PancakehouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size())
            return false;
        else return true;
    }
}
