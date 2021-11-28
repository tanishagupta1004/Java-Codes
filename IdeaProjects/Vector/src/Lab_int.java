import java.util.*;
public class Lab_int {
    public static void main(String[] args) {
        //1. Create a vector
        Vector<Integer> vec = new Vector<Integer>(15);
        //2. Adding elements using add() method of List
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity is: "+vec.capacity());
        //3. Adding elements using addElement() method of Vector
        vec.addElement(5);
        vec.addElement(6);
        vec.addElement(7);

        System.out.println("Elements are: "+vec);
        // 4. addAll()
        Vector<Integer> v = new Vector<Integer>(15);
        v.add(8);
        v.add(9);
        vec.addAll(v);
        System.out.println("After using addAll method updated vector is"+vec);
        //5. contains()
        System.out.println("Existence "+vec.contains(3));
        //6. elementAt()
        System.out.println("Element at index 1 is  "+vec.elementAt(1));
        //7. First Element
        System.out.println("First Element "+vec.firstElement());
        //8. index of
        System.out.println("Index of 7 is "+vec.indexOf(7));
        //9. insertElementAt
        vec.insertElementAt(12,5);
        System.out.println("After inserting new element "+vec);
        //10. is empty
        System.out.println("Is the vector is empty? "+vec.isEmpty());
        //11.lastElement()
        System.out.println("Last Element in the vector is "+vec.lastElement());
        //12.lastIndexOf()
        System.out.println("Last index in the vector is "+vec.lastIndexOf("Cat",8));
        //13. remove()
        vec.remove(4);
        System.out.println("Vector after removing 6 is: "+vec);
        //14. removeElement
        vec.removeElement(2);
        System.out.println("Vector after removing element 7"+vec);
        //15. removeElementAt
        vec.removeElementAt(5);
        System.out.println("Vector after removing element at index at 5"+vec);
        //16. clone()
        System.out.println("Original Vector"+vec);
        System.out.println("Cloned Vector"+vec.clone());
        //17. removeAll
        Vector<Integer> sub = new Vector<Integer>(5);
        sub.add(21);
        sub.add(22);
        sub.add(23);
        System.out.println("Displaying sub elements"+sub);
        sub.removeAll(sub);
        System.out.println("Elements after removing all"+sub);
        // 18-Remove all element()
        System.out.println("Size of the vector is "+vec.size());
        Vector<Integer>lang=new Vector<Integer>(5);
        lang.add(30);
        lang.add(31);
        lang.add(32);
        lang.add(33);
        lang.add(34);
        lang.removeAllElements();
        System.out.println("Elements after using removeAllElements()"+lang);

        // 19 setsize 20 size
        vec.setSize(20);
        System.out.println("Current size of Vector: "+vec.size());
        // 21 vec.clear()
        vec.clear();
        System.out.println("Size of Vector after clear(): "+vec);

    }
}
