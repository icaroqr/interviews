package com.interviews.fourSys;

public class App {

    public static void main(String[] args){
        int[] arrayTest = {1,3,4,5,3,7,10,2};
        int total = 9;
        String result = findContinuousInterval(arrayTest,total);
        System.out.println("Result with best: "+result);

        String result2 = findContinuousInterval2(arrayTest,total);
        System.out.println("Result with bad: "+result2);
    }    

    //Best solution O(N)
    public static String findContinuousInterval(int[] array, int total){
        int sum = 0;
        int beginIndex = 0;
        //Iterate array changing both begin and end index to find if sum is greater than elements found in between
        for (int endIndex = 0; endIndex < array.length; endIndex++) {
            sum += array[endIndex];

            while (sum > total && beginIndex < endIndex){
                sum -= array[beginIndex];
                beginIndex++;
            }
            //When finds the range elements, return indexes
            if(sum == total){
                return String.valueOf(beginIndex + "," + endIndex);
            }
        }
        //If couldn't find an equal sum, returns -1
        return String.valueOf("-1");
    }

    //Not best solution O(N^2)
    public static String findContinuousInterval2(int[] array, int total){
        int sum;
        //Sum linear pushing onde index every iteration and testing combinations
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if(sum == total){
                    return String.valueOf(i + "," + j);
                }
            }
        }
        //If couldn't find an equal sum, returns -1
        return String.valueOf("-1");
    }
}
