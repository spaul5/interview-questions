// Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
// some elements appear twice and others appear once.
// Find all the elements of [1, n] inclusive that do not appear in this array.

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> l = new ArrayList<Integer>(nums.length);
        
        for (int i=1; i<nums.length+1; i++) {
            l.add(i);
        }
        
        for (int i=0; i<nums.length; i++) {
            if (l.contains(nums[i]))
                l.remove((Integer) nums[i]);
        }
        return l;
    }
}