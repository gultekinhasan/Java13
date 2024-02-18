package InterviewTekrarSorulari.hafta4;

import java.util.ArrayList;
import java.util.Arrays;

public class q2 {
    /*
    Q2:
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:
Input: nums = [5,6,7,1,2,3,4] k = 9
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
     */
    public static void main(String[] args) {
        int k=3;
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);
        System.out.println("Original List: " + list1);

        // Calculate the effective rotation steps (handle cases where k > size of the array)
        k %= list1.size();

        // Create a sublist with the elements to be rotated
        ArrayList<Integer> list2 = new ArrayList<>(list1.subList(list1.size() - k, list1.size()));
        System.out.println("list2 " + list2);

        // Remove the rotated elements from the original list
        list1.subList(list1.size() - k, list1.size()).clear();
        System.out.println("list1 = " + list1);

        // Insert the rotated elements at the beginning of the original list
        list1.addAll(0, list2);

        System.out.println("Rotated List: " + list1);
    }
}




