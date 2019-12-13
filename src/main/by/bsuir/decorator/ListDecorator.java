package by.bsuir.decorator;

import java.util.ArrayList;

public class ListDecorator {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList(){
        return this.list;
    }

    public int getAmountOfSymbols(){
       return this.list.stream().mapToInt(String::length).sum();
    }
}
