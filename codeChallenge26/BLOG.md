- We want to sort this array: [8, 4, 23, 42, 16, 15]

  for (int i=1; i< arr.length; i++){

            int temp= arr[i]; i=2
            int k =i-1;// k=1
            while (k>=0 && temp < arr[k]){
            arr[k+1]= arr[k]; //
            k= k-1;
            }
            arr[k+1] = temp;
        }

> [8, 4, 23, 42, 16, 15] ==> [4, 8, 23, 42, 16, 15] ==> [4, 8, 23, 42, 16, 15] ==> [4, 8, 23, 42, 16, 15] ==> [4, 8, 16, 23, 42, 15] ==> [4, 8, 15, 16, 23 , 42]

