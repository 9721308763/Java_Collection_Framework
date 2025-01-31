import java.util.*;

// Option 1: Rename the class to something else
 class StringList {
    public static void main(String... args) {

        // create a list of strings
        List<String> list = new ArrayList<>();
        // add element to the list
        list.add("Vijay ");
        list.add("chaurasiya");
        list.add("is  a good boy");
        System.out.println(list);

        // get the element of the list
        System.out.println(list.get(0));
        // iterate over the list
        for (String s : list) {
            System.out.println(s);
        }
        // get the size of the list
        System.out.println(list.size());
    }
}