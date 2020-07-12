import java.util.*;

public class HashSet_HomeWork {
    public static void main(String[] args) {
        //.1
        HashSet<String> hashSet1 = new HashSet<>() {{
            add("1");
            add("2");
            add("3");
            add("4");
        }};
        appendElementToEnd(hashSet1);

        //.2
        iterateInHashSet(hashSet1);

        //.3
        getHashSetSize(hashSet1);

        //.4
//        emptyHashSet(hashSet1);

        //5.
        isHashSetIsEmpty(hashSet1);

        //6.
        cloneHashSet(hashSet1);

        //7.
        hashSetToArray(hashSet1);

        //8.
        hashSetToTreeSet(hashSet1);

        //9.
        hashSetToList(hashSet1);

        //10.
        HashSet<String> hashSet2 = new HashSet<>() {{
            add("1");
            add("2");
            add("3");
            add("4");
//            add("5");
        }};
        compareHashSets(hashSet1, hashSet2);

        //11.
        retainSameHashSetsElements(hashSet1, hashSet2);

        //12
        removeAllElementsFromHashSet(hashSet1);
    }

    //1. Write a Java program to append the specified element to the end of a hash set.
    private static void appendElementToEnd(HashSet<String> hashSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an item: ");
        hashSet.add(scanner.nextLine());
    }

    //2. Write a Java program to iterate through all elements in a hash set.
    private static void iterateInHashSet(HashSet<String> hashSet) {
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //3. Write a Java program to get the number of elements in a hash set.
    private static void getHashSetSize(HashSet<String> hashSet) {
        System.out.println("The size of HashSet is: " + hashSet.size());
    }

    //4. Write a Java program to empty a hash set.
    private static void emptyHashSet(HashSet<String> hashSet) {
        hashSet.removeAll(hashSet);
        System.out.println("The HashSet is cleared: " + hashSet);
    }

    //5. Write a Java program to test if a hash set is empty or not.
    private static void isHashSetIsEmpty(HashSet<String> hashSet) {
        if (hashSet.isEmpty()) {
            System.out.println("Yeees!!!");
        } else {
            System.out.println("Nooooo :( ");
        }
    }

    //6. Write a Java program to clone a hash set to another hash set.
    private static void cloneHashSet(HashSet<String> hashSet) {
        HashSet clonedHashSet;
        clonedHashSet = (HashSet)hashSet.clone();
        System.out.println("Cloned HashSet is : " + clonedHashSet);
    }

    //7. Write a Java program to convert a hash set to an array.
    private static void hashSetToArray(HashSet<String> hashSet) {
        String[] arrayFromHashSet = new String[hashSet.size()];
        hashSet.toArray(arrayFromHashSet);

        System.out.println("This is arraaay: " + Arrays.toString(arrayFromHashSet));
    }

    //8. Write a Java program to convert a hash set to a tree set.
    private static void hashSetToTreeSet(HashSet<String> hashSet) {
        Set<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("These are the TreeSet elements: ");
        for(String element : treeSet){
            System.out.println(element);
        }
    }

    //9. Write a Java program to convert a hash set to a List/ArrayList.
    private static void hashSetToList(HashSet<String> hashSet) {
        List<String> hashSetToList = new ArrayList<>(hashSet);
        System.out.println("ArrayList: " + hashSetToList);
    }

    //10. Write a Java program to compare two hash sets.
    private static void compareHashSets(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        for (String element : hashSet1) {
            if (!hashSet2.contains(element) || hashSet1.size() != hashSet2.size()) {
                System.out.println("Hash sets are not identical");
                return;
            }
        }
        System.out.println("Hash sets are identical");
    }

    //11. Write a Java program to compare two sets and retain elements which are the same on both sets.
    private static void retainSameHashSetsElements(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        System.out.println("First Hash set: " + hashSet1);
        System.out.println("Second Hash set: " + hashSet2);
        hashSet1.retainAll(hashSet2);
        System.out.println("After retaining : " + hashSet1);
    }

    //12. Write a Java program to remove all of the elements from a hash set.
    private static void removeAllElementsFromHashSet(HashSet<String> hashSet) {
        hashSet.clear();
        System.out.println("All elements are removed: " + hashSet);
    }
}

