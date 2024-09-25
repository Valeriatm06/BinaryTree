import java.util.ArrayList;

import co.edu.uptc.models.BinaryTree;
import co.edu.uptc.models.PersonComparator;
import co.edu.uptc.models.pojos.Person;

public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree<Person> binaryTree = new BinaryTree<Person>(PersonComparator.compAge);
        binaryTree.add(new Person("Selene", 18));
        binaryTree.add(new Person("Doki", 11));
        binaryTree.add(new Person("David", 19));
        binaryTree.add(new Person("Sofía", 22));

        ArrayList<Person> list = binaryTree.showSortData();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + " " + list.get(i).getAge());
        }
        
    }
}
