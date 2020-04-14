/* Signed by : Chitrasoma Singh
*/

class Solution {
    public int countElements(int[] arr) {
        
        Map<Integer, Integer> map = new TreeMap<>();
        int n = arr.length;
        int prev=Integer.MIN_VALUE, prevCnt = 0, cnt=0;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        
        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            if(prev==Integer.MIN_VALUE){
                prev=e.getKey();
                prevCnt = e.getValue();
            }
            else{
                if(e.getKey()-1 == prev){
                    cnt = cnt+prevCnt;
                }
                prev=e.getKey();
                prevCnt = e.getValue();
            } 
        }
        
        return cnt;
    }
}