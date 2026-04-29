class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        int[] answer= new int[n];
        Stack<Integer> stack= new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int prevIdx=stack.pop();
                answer[prevIdx]=i-prevIdx;

            }
            stack.push(i);
        }
        return answer;
    }
}
