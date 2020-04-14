class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int a, b;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y)->y-x);
        for(Integer x:stones){
            maxHeap.add(x);
        }
        while(maxHeap.size()>1){
            a = maxHeap.poll();
            b = maxHeap.poll();
            if(a>b){
                a = a-b;
                maxHeap.add(a);
            }
            else if(b>a){
                b = b-1;
                maxHeap.add(b);
            }
        }
        return (maxHeap.size()!=0?maxHeap.peek():0);
    }
}