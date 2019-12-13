package by.bsuir.decorator;

import java.util.ArrayList;

public class ListDecorator {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList(){
        return this.list;
    }

    public void addElement(String element){
        this.list.add(element);
    }

    public void deleteElement(String element){
        this.list.remove(element);
    }

    public void deleteElement(int elementId){
        this.list.remove(elementId);
    }
}
