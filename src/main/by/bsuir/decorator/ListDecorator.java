package by.bsuir.decorator;

import java.util.ArrayList;

public class ListDecorator {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList(){
        return this.list;
    }

    public ArrayList<String> search(String searchString){
        ArrayList<String> foundElements = new ArrayList<>();
        this.list.forEach(element->{
            if(element.startsWith(searchString)){
                foundElements.add(element);
            }
        });
        System.out.println("Found " + foundElements.size()+ " matches");
        return foundElements;
    }
}
