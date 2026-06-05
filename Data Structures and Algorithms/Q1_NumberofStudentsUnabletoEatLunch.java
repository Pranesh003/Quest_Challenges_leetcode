class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    
        int[] count =new int[2];

        for(int student:students){
            count[student]++;
        }

        for(int sandwiche: sandwiches){
            if(count[sandwiche]==0){
                return count[0]+count[1];
            }

            count[sandwiche]--;
        }

        return 0;
    }
}
