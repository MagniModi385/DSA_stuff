
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int left=0;
        int right=mountainArr.length()-1;
        int peak=0;
        boolean flag=true;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int one=mountainArr.get(mid);
            int plusone=mountainArr.get(mid+1);
            int minusone=mountainArr.get(mid-1);
            if(plusone<one && minusone<one)
            {
                peak=mid;
                flag=false;
                break;
            }
            else if(plusone<one) right=mid;
            else left=mid+1;
        }
        if(flag) peak=left;
        left=0;
        right=peak;
        while(left<=right)
        {
            int mid=(left+right)/2;
            int middle=mountainArr.get(mid);
            if(middle==target) return mid;
            else if(middle>target) right=mid-1;
            else left=mid+1;
        }
      if(mountainArr.get(left)==target) return left;
      left=peak+1;
      right=mountainArr.length()-1;
      while(left<right)
        {
            int mid=(left+right)/2;
            int middle=mountainArr.get(mid);
            if(middle==target) return mid;
            else if(middle<target) right=mid-1;
            else left=mid+1;
        }
        System.out.println(left);
      return mountainArr.get(left)==target?left:-1;
}}
