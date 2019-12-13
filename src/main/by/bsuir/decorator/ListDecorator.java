package by.bsuir.decorator;

import java.util.ArrayList;
import java.util.List;

public class ListDecorator {

    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList(){
        return this.list;
    }

    public List<String> searchWithSubString(String searchString){
        List<String> foundList = new ArrayList<>();
        this.list.forEach(element->{
            if(element.startsWith(searchString)){
                foundList.add(element);
            }
        });
        return foundList;
    }
}
