class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if((x+y)/2>=target/2){
            return true;
        }
        return false;
    }
}