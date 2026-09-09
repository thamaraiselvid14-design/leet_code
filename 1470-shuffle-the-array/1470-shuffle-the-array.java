class Solution {
    public int[] shuffle(int[] nums, int n) {
        int temp [] = new int[n*2];
        int a=0,b=n;
        for(int i=  0; i<n*2;i++ ){
            if(i%2==0){
                temp[i] =nums[a];
                a++;
            }
            else{
                temp[i]= nums[b];
                b++;
            }
        }
        return temp;
    }
}