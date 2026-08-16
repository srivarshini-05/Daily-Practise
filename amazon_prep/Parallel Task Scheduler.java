import java.util.Arrays;

class Solution {
    public int minimumExecutionTime(int[] taskLoad, int[] maxCapacity) {
        int n = taskLoad.length;
        int m = maxCapacity.length;
        
        // Sort both arrays in ascending order
        Arrays.sort(taskLoad);
        Arrays.sort(maxCapacity);
        
        // If the heaviest task is strictly greater than the strongest processor's capacity, it's impossible.
        if (taskLoad[n - 1] > maxCapacity[m - 1]) {
            return -1;
        }
        
        // Binary search bounds for the execution time
        int low = 1;
        int high = 2 * n - 1;
        int shortestTime = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isValid(taskLoad, maxCapacity, mid)) {
                shortestTime = mid; // This time is possible, try to find a shorter one
                high = mid - 1;
            } else {
                low = mid + 1; // This time is impossible, we need more time
            }
        }
        
        return shortestTime;
    }
    
    // Helper function to greedily check if target time T is feasible
    private boolean isValid(int[] taskLoad, int[] maxCapacity, int targetTime) {
        int n = taskLoad.length;
        int m = maxCapacity.length;
        
        // Max tasks a single processor can handle within targetTime
        int maxTasksPerUnit = (targetTime + 1) / 2;
        
        int taskIdx = n - 1; // Pointer to the heaviest unassigned task
        int procIdx = m - 1; // Pointer to the strongest available processor
        
        while (taskIdx >= 0 && procIdx >= 0) {
            // If the current processor can handle the heaviest unassigned task
            if (taskLoad[taskIdx] <= maxCapacity[procIdx]) {
                // Assign up to maxTasksPerUnit to this processor
                taskIdx -= maxTasksPerUnit; 
                procIdx--; // Move to the next processor
            } else {
                // If the current strongest processor cannot handle the current heaviest task,
                // no smaller processor will be able to. So, targetTime is impossible.
                return false;
            }
        }
        
        // If taskIdx < 0, all tasks were successfully assigned
        return taskIdx < 0;
    }
}
