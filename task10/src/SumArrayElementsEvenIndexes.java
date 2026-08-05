public class SumArrayElementsEvenIndexes  {

    public static void main(String[] args){



        int[] sum = {10, 5, 20, 5, 30};
        System.out.println(sumEvenInd(sum,0));

    }


    public static  int sumEvenInd(int[] b,int index){

        if (index >= b.length) {
            return 0;
        }

        return b[index] + sumEvenInd(b,index + 2) ;


    }}