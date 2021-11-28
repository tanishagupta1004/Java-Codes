import java.util.*;
public class Lab_Vector {
    public static void main(String[] args) {
        //1. Create a vector
        Vector<String> vec = new Vector<String>(15);
        //2. Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity is: "+vec.capacity());
        //3. Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);
        // 4. addAll()
        Vector<String> v = new Vector<String>(15);
        v.add("cow");
        v.add("goat");
        vec.addAll(v);
        System.out.println("After using addAll method updated vestor is"+vec);
        //5. contains()
        System.out.println("Existence "+vec.contains("Deer"));
        //6. elementAt()
        System.out.println("Element at index 1 is  "+vec.elementAt(1));
        //7. First Element
        System.out.println("First Element "+vec.firstElement());
        //8. index of
        System.out.println("Index of Cat is "+vec.indexOf("Cat"));
        //9. insertElementAt
         vec.insertElementAt("cheetah",5);
        System.out.println("After inserting new element "+vec);
        //10. is empty
        System.out.println("Is the vector is empty? "+vec.isEmpty());
        //11.lastElement()
        System.out.println("Last Element in the vector is "+vec.lastElement());
        //12.lastIndexOf()
        System.out.println("Last index in the vector is "+vec.lastIndexOf("Cat",8));
        //13. remove()
        vec.remove("Cat");
        System.out.println("Vector after removing cat is: "+vec);
        //14. removeElement
        vec.removeElement("cheetah");
        System.out.println("Vector after removing element Cheetah"+vec);
        //15. removeElementAt
        vec.removeElementAt(5);
        System.out.println("Vector after removing element at index at 5"+vec);
        //16. clone()
        System.out.println("Original Vector"+vec);
        System.out.println("Cloned Vector"+vec.clone());
         //17. removeAll
        Vector<String> sub = new Vector<String>(5);
        sub.add("Data Structure");
        sub.add("Java");
        sub.add("Python");
        System.out.println("Displaying sub elements"+sub);
        sub.removeAll(sub);
        System.out.println("Elements after removing all"+sub);
        // 18-Remove all element()
        System.out.println("Size of the vector is "+vec.size());
        Vector<String>lang=new Vector<String>(5);
        lang.add("Mounika");
        lang.add("Tanisha");
        lang.add("Soham");
        lang.add("Jayu");
        lang.add("shreyans");
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
