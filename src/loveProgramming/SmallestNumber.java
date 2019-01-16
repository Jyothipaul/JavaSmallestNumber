package loveProgramming;

public class SmallestNumber {

    public SmallestNumber(int num[]){

        int min = num[0];

        for (int i=0;i<num.length;i++){

            if (min>num[i]){

                min=num[i];
            }
        }
        System.out.println("Smallest number is "+min);

    }
}
