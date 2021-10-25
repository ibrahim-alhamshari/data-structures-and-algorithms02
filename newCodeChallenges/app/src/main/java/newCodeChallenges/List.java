package newCodeChallenges;

import java.util.NoSuchElementException;

public class List<T> {
    private T[] items;
    private int N;

    private void resize(int capacity){
        T[] temp = (T[]) new Object[capacity];
        for(int i=0; i<N; i++)
            temp[i] = items[i];
        items = temp;
    }

    public List(){
        items = (T[]) new Object[2]; // the ugly cast
        N = 0;
    }

    // O(1)
    public void add(T item){
        if(item == null)
            throw new IllegalArgumentException();
        if(N == items.length){ /// you wanna make sure there is en empty slot
            resize(N*2); // this is the common case
        }
        items[N] = item;
        N++;
    }

    public T remove(){
        if(isEmpty())
            throw new NoSuchElementException(); // underflow
        T e = items[N-1]; // e = "ahmad"
        items[N-1] = null; /// if you forget to this, you might generate outOfMemory later
        N--;
        if(N < items.length/4){
            resize(items.length/2);
        }
        return e;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public T get(int index){
        //add code to handle exception
        return items[index];
    }

     public void add(T item, int position){//Add item at a given position in the list
        if(position>N){
            throw new IllegalArgumentException();
        }

         if(N == items.length){ /// you wanna make sure there is en empty slot
             resize(N*2); // this is the common case
         }
         N++;
        T temp=items[0];
         for (int i=0; i<=N; i++){
             temp = items[i];
             if(i==position){
                 items[i] = item;
                 break;
             }else {
                 items[i]=temp;
             }
         }

        for(int i=N-1 ; i>position; i--){
            items[i] =items[i-1];
        }
        items[position+1]=temp;
     }

     public T remove (int position){// remove and return item at position
         if(isEmpty())
             throw new NoSuchElementException();

         T item= items[position];
         item=null;
         for (int i=position; i<N; i++){
             items[i]=items[i+1];
         }
         return items[position];
     }

}
