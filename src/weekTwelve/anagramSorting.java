package weekTwelve;

import java.util.ArrayList;
import java.util.Arrays;

public class anagramSorting {

    public static void main(String[] args) {
        ArrayList<String>anagrams = new ArrayList<>(Arrays.asList("dog","cat","alert","ram","this","fats","tac","god","hits","later","fast","arm"));
        System.out.println(sortAnagrams(anagrams));
    }
    public static Object sortAnagrams(ArrayList<String>input){
        //idk what this is
        ArrayList<String> sort = input;
        System.out.println("Unsorted:");
        System.out.println(input);
        System.out.println("\nSorted:");
        for(int i = 0; i < input.size()-2; i++){
            ArrayList<Character> key = sortLetters(input.get(i));
            for(int j = i+1; j < input.size(); j++){
                if(key.equals(sortLetters(input.get(j)))){
                    String temp = input.get(i+1);
                    sort.set(i,input.get(i));
                    sort.set(i+1,input.get(j));
                    sort.set(j, temp);
                    i+=1;
                }
            }
        }
        return sort;
    }

    public static ArrayList<Character> sortLetters(String input){
        //insertion sort
        ArrayList<Character> sort = new ArrayList<>();
        for(int n = 0; n < input.length(); n++){
            sort.add(input.charAt(n));
        }
        int l = sort.size();
        for(int i = 1; i < l; i++){
            char key = sort.get(i);
            int j = i-1;
            while(j >= 0 && sort.get(j) > key){
                sort.set(j+1, sort.get(j));
                j -= 1;
            }
            sort.set(j+1, key);
        }
        return sort;
    }

    /*
    For this, I approached it by trying to sort
    the characters of each word, so they could be
    easily compared. I used insertion sort for this,
    then I didn't have much forethought as I actually
    went to compare the anagrams. I just kind of wrote
    something that made sense in my head, and it ended
    up working. Creating a key on the first go through
    and putting a word next to it and increasing the
    index extra if one or more words were found.
     */
}
