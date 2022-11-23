public class TestArray {
    public static void main(String[] args) {
        double sum = 0;
        double[] numbers = {1,3,4,5,2,8,9,5,12,8};
        double [] kstj;
        //for each loop, only works with arrays or array lists
        for (double i : numbers){
            sum = sum+i;
            System.out.print(sum+ " ");
        }
        System.out.println();
        System.out.println("Sum of Numbers = "+sum);
        double average = sum / numbers.length;
        System.out.println("Average number = "+average);
        // for (int i = 0; i < numbers.length; i++ ){
        //    sum=sum+numbers[i];
        //}
        //System.out.println(sum);
    }

}
