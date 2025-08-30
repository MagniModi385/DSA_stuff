// this is to find elements in array appearing more than n/2 times
class Solution {
    public int majorityElement(int[] nums) {
        int element=nums[0],count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(count==0) element=nums[i];
            if(nums[i]==element) count++;
            else count--;
        }
        return element;
    }
}
// Intuition:
// If we pair each occurrence of the majority element with a different element, the majority element will still remain because it occurs more than n/2 times.
// This allows us to cancel out elements until the majority candidate remains.

// Find candidate (phase 1):

// Initialize count = 1 and element = nums[0].

// Traverse array:

// If count == 0, set candidate = current element.

// If current element == candidate, increment count.

// Else decrement count.

// After this, candidate will be the potential majority element.

// Verify candidate (phase 2):

// Count how many times candidate occurs.

// If it appears more than n/2 times → it’s the majority element.

// Otherwise, no majority element exists.
