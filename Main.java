
class Main {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 4};
        boolean aux = canJump(nums);

        System.out.println(aux);
    }

    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; ++i) {
            // If the current index 'i' is beyond the maximum reach, 
            // it means we are stuck and cannot proceed.
            if (i > maxReach) {
                return false;
            }
            // Update the maximum reach possible from the current index.
            maxReach = Math.max(maxReach, i + nums[i]);
            // Optimization: If maxReach already covers the last index, we can stop early.
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        // If we successfully iterate through the whole array without getting stuck, 
        // we can reach the last index (this case handles single-element arrays too).
        return true;

    }
}
