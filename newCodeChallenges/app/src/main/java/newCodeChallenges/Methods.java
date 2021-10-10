package newCodeChallenges;

import java.util.ArrayList;

public class Methods {


//*******************************************************Start second Max *********************************************
    public int secondMax(int[] arr){
        if(arr.length==1) return arr[0];

        int max=0;
        int sec=0;
        if( arr[0] > arr[1]){
            max= arr[0];
            sec= arr[1];
        }else {
            max= arr[1];
            sec = arr[0];
        }

        for(int i=2; i< arr.length ; i++){
            if(arr[i] >= max){
                sec = max;
                max = arr[i];
            }else if(arr[i] > sec){
                sec = arr[i];
            }
        }
//        System.out.println(sec);
        return sec;
    }
//*******************************************************End second Max *********************************************


//******************************************************* Start Missing number **************************************
    public int missingNumber(int[] arr){

        int arrSum=0;
        for(int i=0; i< arr.length ; i++){
            arrSum= arrSum + arr[i];
        }

        int l= arr.length + 1 ;
        int a1= arr[0];
        int a2 = arr[arr.length -1];

        int actualSum = l*(a1 +a2)/2;
//        System.out.println(actualSum);
//        System.out.println(arrSum);

        return actualSum - arrSum;
    }

//******************************************************* Start Missing number **************************************
}
