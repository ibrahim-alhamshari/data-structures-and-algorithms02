package newCodeChallenges;

import java.io.BufferedWriter;
import java.util.*;

public class Methods {


//******************************************************* second Max *********************************************
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
//*************************************************************************************************************


//******************************************************* Missing number **************************************
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
//***********************************************************************************************************

//************************************************ Two Strings have same char *******************************
    public boolean haveSameChar(String s1 , String s2){
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        if(s1.toCharArray().length != s2.toCharArray().length) return false;

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
            if(!map2.containsKey(s1.charAt(i)) || (map1.get(s1.charAt(i)) != map2.get(s1.charAt(i)))){
               return false;
            }
        }
//        System.out.println(map1);
//        System.out.println(map2);
        return true;
    }
//*********************************************************************************************************

//**************************************************** Duplicated number **********************************
    public void duplicatedNum(int[] arr){
        if(arr.length==0 || arr.length==1){
            System.out.println("No duplicated numbers");
        }

        Map<Integer , Integer> map = new HashMap<>();
        for (int i=0 ; i< arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) +1);
            }else {
                map.put(arr[i] , 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue()>1){
                System.out.println("Value "+entry.getKey()+" is duplicate " + entry.getValue() +" times");
            }
        }
        System.out.println(map);// Will appear between curly brackets.
        System.out.println(map.entrySet()); // Will become as an array (with [] brackets).
    }
//********************************************************************************************************

//*********************************************** Print random chars **************************************
public void printRandomChars(){
    Scanner scan = new Scanner(System.in);
    int y = scan.nextInt();

    int[] count = new int[26]; // a-z == 0-26

    while (y-- >0){
        int x = (int) (Math.random()*26); // random number between 0-26
        count[x] = count[x] +1;
    }

    for (int i=0 ; i < count.length ; i++){
        char letter = (char) (i + 'a');
        if(count[i] != 0)
            System.out.println("The letter " + letter + " has frequent "+ count[i] );
    }
    scan.close();
}
//********************************************************************************************************

//****************************************** Common max number *******************************************

    public void commonMaxNum1(int x , int y){ // traditional method

        if(y>x){
            int tmp=x;
            x=y;
            y=tmp;
        }

        for(int i=x; y> 0; i--){
            if(x%i == 0 && y%i==0){
                System.out.println("1- Common max number: "+i);
                break;
            }
        }
    }

    public void commonMaxNum2(int a , int b){
        if(a==0){
            System.out.println("2- Common max number: "+b);
        }else if(b==0){
            System.out.println("2- Common max number: "+a);
        }

        if(a< b){
            int tmp=a;
            a= b;
            b= tmp;
        }
        while (b != 0){
            int tmp= a;
            a = b;
            b=tmp % b;
        }
        System.out.println("2- Common max number: "+a);
    }
//*****************************************************************************************

//**************************************** Diagonal difference **********************************************
    public static int diagonalDifference(List<List<Integer>> arr) {
        int a=0;
        int b=0;
        for(int i=0; i<arr.size() ; i++){
            a=a+arr.get(i).get(i);

            b= b+arr.get(i).get(arr.size()-1-i);
        }
        if(b>a){
            return b-a;
        }
        return a-b;
    }
//*********************************************************************************************

//*********************************************************************************************
    //ts base and height are both equal to n.
    // It is drawn using # symbols and spaces. The last line is not preceded by any spaces.
    //Write a program that prints a staircase of size n.
    public static void staircase(int n) {
        int c = n - 1;
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                if (y < c) {
                    System.out.print(' ');
                } else {
                    System.out.print('#');
                }
            }
            c--;
            System.out.println();
        }
    }
//*********************************************************************************************
public static void miniMaxSum(List<Integer> arr) {
    long max,min;
    if(arr.get(0)>arr.get(1)){
        max=arr.get(0);
        min=arr.get(1);
    }else{
        max=arr.get(1);
        min=arr.get(0);
    }
    for(int i=2; i<5 ; i++){
        if(arr.get(i)>max) max=arr.get(i);
        if(arr.get(i)<min) min=arr.get(i);

    }
    long sumMax=0;
    long sumMin=0;
    for(int i=0; i<5;i++){
        if(arr.get(i) != max){
            sumMin=sumMin+arr.get(i);
        }else{
            max=0;// When we have edge case, if two max numbers arr there.
            // And I'm assigning to zero; to sum anything else because the zero will not affect the solution(summation).
        }
        if(arr.get(i) != min){
            sumMax= sumMax+arr.get(i);
        }else{
            min=0;
        }
    }

    System.out.println(sumMin + " " + sumMax);
}

public boolean ifPalindrome(String s1){
        int n=s1.length();
        for(int i=0; i<s1.length() ; i++){
            if(s1.charAt(i) != s1.charAt(n-1-i)){
                return false;
            }
        }
        return true;
}

//public int occurrences(String s1, String s2){
//        int count=0;
//        int n=s1.length();
//        for (int i=0 ; i<s2.length(); i=i+n){
//            if(s1==){
//                count= count+1;
//            }
//        }
//    System.out.println(count);
//        return count;
//}

public void rotateArray(int k , int[] arr){

    for(int i=0; i< k; i++){
        int temp= arr[arr.length-1];

        for(int y= arr.length-1; y>0; y--){ //{1, 2 ,3, 4 ,5, 6 ,7}
            arr[y]= arr[y-1];
        }
        arr[0]=temp;
    }
    System.out.println(Arrays.toString(arr));
}

public void excel_Format(int n){
//        Scanner scanner= new Scanner(System.in);
//        int num= scanner.nextInt();
    System.out.println((n-1)%26);
        StringBuilder column=new StringBuilder();
       while (n>0){
           System.out.println(n);
        int index=(n-1)%26;
        column.append((char)(index +'A'));
        n= (n-1)/26;
       }

    System.out.println(column.reverse());
//    scanner.close();
}

}
