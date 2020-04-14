/* Signed by : Chitrasoma Singh
*/

class Solution {
    public String stringShift(String s, int[][] shift) {
        int n = s.length();
        int r = shift.length, leftShifts=0, rightShifts=0, ans, totalShifts;
        for(int i=0;i<r;i++){
            if(shift[i][0]==0)
                leftShifts += shift[i][1];
            else
                rightShifts += shift[i][1];
        }
        ans = leftShifts-rightShifts;
        totalShifts = Math.abs(ans);
        if(totalShifts>n){
            totalShifts = totalShifts % n;
        }
        if(ans<0){
            String y = s.substring(n-totalShifts, n);
            s = s.substring(0, n-totalShifts);
            s = y+s;
        }
        else{
            String x = s.substring(0,totalShifts);
            s = s.substring(totalShifts, n);
            s = s+x;
        }
        return s;
    }
}