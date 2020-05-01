/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
   
    public int firstBadVersion(int n) {
        
        int low = 1;
        int high = n;
        int i = n;
        while(low < high){
            int mid = low + (high - low)/2;    
            if(isBadVersion(mid)){
                high = mid;
            }else{
                low = mid+1;
            }
           
        }
        // for (int i = 1; i < n; i++) {
        //     if (isBadVersion(i)) {
        //         return i;
        //     }
        // }
        return low;
    }
}
