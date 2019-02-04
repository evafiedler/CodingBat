public class Runner {
    //warm-up 1
    public boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
            return true;
        }else{
            return false;
        }
    }

    //warm-up 2
    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count++;
            }
        }
        return count;
    }

    //string 1
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    //string 2
    public boolean bobThere(String str) {
        for(int i = 0; i < str.length() - 2; i++){
            if(str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")){
                return true;
            }
        }
        return false;
    }

    //string 3
    public int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.substring(i, i+1));
            }
        }
        return sum;
    }

    //array 1
    public int[] plusTwo(int[] a, int[] b) {
        int[] total = new int[4];
        for(int i = 0; i < 2; i++){
            total[i] = a[i];
        }
        total[2] = b[0];
        total[3] = b[1];
        return total;
    }

    //array 2
    public int countEvens(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    //array 3
    public int countClumps(int[] nums) {
        int num = 0;
        if(nums.length == 0){
            return num;
        }
        for(int i = 0; i < (nums.length - 1); i++){
            if(i < 1){
                if(nums[i] == nums[i + 1]){
                    num++;
                }
            }else{
                if(nums[i] == nums[i + 1] && nums[i] != nums[i-1]){
                    num++;
                }
            }
        }
        return num;
    }

    //logic 1
    public boolean in1To10(int n, boolean outsideMode) {
        if(outsideMode == true){
            if(n <= 1 || n >= 10){
                return true;
            }
        }else{
            if(n <= 10 && n >= 1){
                return true;
            }
        }
        return false;
    }

    //logic 2
    public boolean closeFar(int a, int b, int c) {
        if(Math.abs(b - a) <= 1){
            if(Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2){
                return true;
            }
        }else if(Math.abs(c - a) <= 1){
            if(Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2){
                return true;
            }
        }
        return false;
    }

}
