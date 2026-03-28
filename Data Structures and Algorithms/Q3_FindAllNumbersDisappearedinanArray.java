class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashMap<Integer, Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> freq=new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                freq.add(i);
            }
        }


        return freq;
    }
}
