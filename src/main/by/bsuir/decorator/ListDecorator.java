package by.bsuir.decorator;

import java.util.ArrayList;

public class ListDecorator {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList(){
        return this.list;
    }

    public void reverseAllStings(){
        ArrayList<String> reversedList = new ArrayList<>();
        this.list.forEach(element->{
            StringBuilder stringBuilder = new StringBuilder(element);
            reversedList.add(stringBuilder.reverse().toString());
        });
        this.list = reversedList;
    }
}
