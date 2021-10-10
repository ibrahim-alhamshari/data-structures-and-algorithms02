package newCodeChallenges;

import java.util.HashMap;
import java.util.Map;

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
//******************************************************* End Missing number **************************************

//************************************************ Start Two Strings have same char *******************************
    public boolean haveSameChar(String s1 , String s2){
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        System.out.println(s1.toCharArray().length);
        System.out.println(s2.toCharArray().length);
        if(s1.toCharArray().length != s2.toCharArray().length) return false;

        int count = 1;
        for (int i=0 ; i<s1.length() ; i++){
            if(map1.containsKey(s1.charAt(i))){
                map1.put(s1.charAt(i) , map1.get(s1.charAt(i)) +1);
            }else {
                map1.put(s1.charAt(i) , 1);
            }

            if(map2.containsKey(s2.charAt(i))){
                map2.put(s2.charAt(i) , map2.get(s2.charAt(i)) +1);
            }else {
                map2.put(s2.charAt(i) ,1);
            }
        }

        for(int i=0; i<map1.size() ; i++){
            if(map2.containsKey(s1.charAt(i)) && (map1.get(s1.charAt(i)) == map2.get(s1.charAt(i)))){
                System.out.println("yes");
            }else {
                return false;
            }
        }
        System.out.println(map1);
        System.out.println(map2);
        return true;
    }
//************************************************ End Two Strings have same char *******************************
}
