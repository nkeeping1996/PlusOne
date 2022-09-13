public class Main {
    public static void main(String[] args) {
        int[] digits = {9};

        int[] dig = plusOne(digits);
        for(int j : dig){
            System.out.print(j);
        }

    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                break;
            }
        }
        if(digits[0]==0){
            int[] bigDigits = new int[digits.length+1];
            bigDigits[0]=1;
            for(int i = 0; i< digits.length; i++){
                bigDigits[i+1] = digits[i];
            }
            return bigDigits;
        }
        return digits;

    }

}