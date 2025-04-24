package collections.set;

import java.util.*;

public class SetOperations {

    public static boolean areSetsEqual(Set<Integer> firstSet, Set<Integer> secondSet) {
        return firstSet.equals(secondSet);
    }

    public static Set<Integer> getUnion(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> union = new HashSet<>(firstSet);
        union.addAll(secondSet);
        return union;
    }

    public static Set<Integer> getIntersection(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);
        return intersection;
    }

    public static Set<Integer> getSymmetricDifference(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> result = new HashSet<>(firstSet);
        result.addAll(secondSet);

        Set<Integer> intersection = new HashSet<>(firstSet);
        intersection.retainAll(secondSet);

        result.removeAll(intersection);
        return result;
    }

    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static boolean isSubset(Set<Integer> subsetCandidate, Set<Integer> mainSet) {
        return mainSet.containsAll(subsetCandidate);
    }

    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Are sets equal: " + areSetsEqual(setA, setB));

        Set<Integer> setC = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println("Union: " + getUnion(setA, setC));
        System.out.println("Intersection: " + getIntersection(setA, setC));
        System.out.println("Symmetric Difference: " + getSymmetricDifference(setA, setC));

        Set<Integer> unsortedSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + convertSetToSortedList(unsortedSet));

        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is subset: " + isSubset(subset, superset));
    }
}

