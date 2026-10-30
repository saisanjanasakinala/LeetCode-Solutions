class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if((x+y)/2>=target){
            return true;
        }
        return false;
    }
}