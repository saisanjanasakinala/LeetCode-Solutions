class Solution {
    public int maximumProduct(int[] nums) {
        
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        int small1=Integer.MAX_VALUE;
        int small2=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int current=nums[i];
            if(current>first){
                third=second;
                second=first;
                 first=current;
                
            }
            else if(current>second){
                 third=second;
                second=current;
               
            }
            else if(current>third){
                third=current;
            }
        
        if(current<small1){
             small2=small1;
            small1=current;
           
        }
        else if(current<small2){
            small2=current;
        }
    }
    int product1=first*second*third;
    int product2=small1*small2*first;
    return Math.max(product1,product2);

    }
}