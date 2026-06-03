import java.util.*;

class Solution {
    public int largestRectangleArea(int[] height) {

        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();

        
        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() &&
                  height[st.peek()] >= height[i]) {
                st.pop();
            }

            left[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

   
        for(int i = n - 1; i >= 0; i--) {

            while(!st.isEmpty() &&
                  height[st.peek()] >= height[i]) {
                st.pop();
            }

            right[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for(int i = 0; i < n; i++) {

            int width = right[i] - left[i] - 1;

            int area = height[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
