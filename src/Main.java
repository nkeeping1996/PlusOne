public class Main {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,9,9};

        int[] dig = plusOne(digits);
        for(int j : dig){
            System.out.print(j);
        }

    }

    public static int[] plusOne(int[] digits) {
        String s = "";
        for(int i : digits){
            s=s+ Integer.toString(i);
        }
        int i = Integer.parseInt(s);
        i++;

        s = Integer.toString(i);
        String[] sArr = s.split("");

        int[] addedArr= new int[s.length()];
        for(int j = 0; j <= addedArr.length-1; j++){
            addedArr[j] = Integer.parseInt(sArr[j]);
        }

        return addedArr;
    }

}