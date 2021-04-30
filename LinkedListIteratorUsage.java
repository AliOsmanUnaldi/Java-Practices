import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorUsage {
    public static void printSortByAlphabet(LinkedList<String> p ,String newp){
        ListIterator<String> iterator= p.listIterator();
        while (iterator.hasNext()){
        int compare=iterator.next().compareTo(newp);
        if (compare==0){
            System.out.println("Place is in the list already!");
            return;
        }
        else if (compare<0){
            //Element is going to add correctly
        }
        else if (compare>0){
            iterator.previous();
            iterator.add(newp);
            return;
        }
        }
        iterator.add(newp);
    }
    public static void main(String[] args) {
        LinkedList <String> places=new LinkedList<String>();
        printSortByAlphabet(places,"home");
        printSortByAlphabet(places,"school");
        printSortByAlphabet(places,"library");
        printSortByAlphabet(places,"gym");
        printSortByAlphabet(places,"pub");

        for (String a:places){
            System.out.println(a);
        }
    }
}
