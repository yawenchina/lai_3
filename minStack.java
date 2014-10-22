public class Solution {
    private Stack<Integer> min ;
    private Stack<Integer> max ;
    public Solution() {
        min = new Stack<Integer>();
        max = new Stack<Integer>();
    }

    public void push(int number) {
        if(number <= this.min()){
            min.push(number);
        }
        max.push(number);
    }

    public int pop() {
    
       int m  = max.pop();
       if(m == this.min()){
          min.pop(); 
       }
       return m;
    }

    public int min() {
        return min.isEmpty() ? Integer.MAX_VALUE :min.peek();
    }
}

