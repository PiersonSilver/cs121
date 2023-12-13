package weekTen;

import java.util.ArrayList;

public class StringArrayList {
    public ArrayList<String> names = new ArrayList<>();

    public void addName(String name){
        names.add(name);
    }
    public void removeName(int index){
        names.remove(index);
    }
    public String getName(int index){
        return names.get(index);
    }
    public int listSize(){
        return names.size();
    }
    public void displayNames1(){
        System.out.println("Names:");
        for(String name: names){
            System.out.printf("%s\n", name);
        }
    }
    public void displayNames2(){
        System.out.println("Names:");
        for(int i = 0; i < listSize(); i++){
            System.out.printf("%s\n", getName(i));
        }
    }
}
