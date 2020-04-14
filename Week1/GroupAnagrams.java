/* Signed by : Chitrasoma Singh
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;
        Map<String, ArrayList<String>> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp, 0, strs[i].length());
            String tempString = String.valueOf(temp);
            if(map.containsKey(tempString)){
                ArrayList<String> v = map.get(tempString);
                v.add(strs[i]);
                map.put(tempString, v);
            }
            else{
                ArrayList<String> v = new ArrayList<>();
                v.add(strs[i]);
                map.put(tempString, v);
            }   
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, ArrayList<String>> e : map.entrySet()){
            ans.add(e.getValue());
        }
        
        return ans;
    }
}