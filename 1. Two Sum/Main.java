class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        
        int[] targets = new int[2];
        
        for(int i = 0; i < nums.length; i++){
                     if(map.containsKey(nums[i]))
            {
                targets[0] = map.get(nums[i]);
                targets[1] = i;
                break;
            }
            else{
                map.put(target-nums[i],i);
            }
        }
        

       return targets; 
    }
    
}