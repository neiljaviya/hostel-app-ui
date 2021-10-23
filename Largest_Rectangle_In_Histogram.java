public class Largest_Rectangle_In_Histogram {
    public int largestRectangleArea(int[] heights) {
        
        
        //Initialising variables
       int len = heights.length;
        int maxArea = 0;
      
        //Initialising stack
        Stack<Integer> stack = new Stack<>();
      
          //Iterating through the array
        for (int i = 0; i <= len;) {
            int h = (i == len ? 0 : heights[i]);
            //Pushing to the stack if it is empty or if h is greater than the given value
            if (stack.isEmpty() || h >= heights[stack.peek()]) {
                stack.push(i);
                i++;
            }else {
                //Calculating the width
                int curHeight = heights[stack.pop()];
                int rightBoundary = i - 1;
                int leftBoundary = stack.isEmpty() ? 0 : stack.peek() + 1;
                int width = rightBoundary - leftBoundary + 1;
                maxArea = Math.max(maxArea, (curHeight * width));
            }
        }
        //Returning the answer
        return maxArea;
    }
}
