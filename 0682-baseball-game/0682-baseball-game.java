class Solution {
    static int[] stack;
    static int top = -1; 
    public int calPoints(String[] operations) {
        int n = operations.length;
        stack = new int[n];
        top = -1;
        for(int i=0;i<n;i++)
        {
            String ch = operations[i];

            if(ch.equals("C"))
            {
                pop();
            }
            else if(ch.equals("D"))
            {
                int doubled = stack[top] * 2;
                push(doubled);
            }
            else if(ch.equals("+"))
            {
                int sum = stack[top] + stack[top-1];
                push(sum);
            }
            else{
                int num = Integer.parseInt(ch);
                push(num);
            }
        }
        int total = 0;
        for(int i=0;i<=top;i++)
        {
            total=total+stack[i];
        }
        return total;
    }
    void push(int x)
    {
        if(top>=stack.length-1)
        {
            return ;
        }
        else{
            top++;
            stack[top] = x;
        }
    }
    int pop()
    {
        if(top==-1)
        {
            return '\0';
        }
        else{
            int value = stack[top];
            top--;
            return value;
        }
    }
}