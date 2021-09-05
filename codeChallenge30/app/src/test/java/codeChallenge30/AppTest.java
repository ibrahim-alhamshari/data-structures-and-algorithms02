/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge30;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void add(){
        HashTable hashTable = new HashTable();
        hashTable.add("Layla" , 54);
        hashTable.add("Fadi" , 54);
        hashTable.add("Anas" , 54);
        assertEquals(true, hashTable.containsKey("Layla"));
        assertEquals(true, hashTable.containsKey("Fadi"));
        assertEquals(false, hashTable.containsKey("Falah"));
    }

    @Test
    public void get(){
        HashTable hashTable = new HashTable();
        hashTable.add("L" , 152);
        hashTable.add("M" , 63);

        assertEquals(152, hashTable.get("L"));
        assertEquals(63, hashTable.get("M"));
    }

    @Test
    public void contains(){
        HashTable hashTable = new HashTable();
        hashTable.add("Mohammad" , 546);
        hashTable.add("Ali" , 635);

        assertEquals(false , hashTable.containsKey("L"));
        assertEquals(true , hashTable.containsKey("Mohammad"));
        assertEquals(false , hashTable.containsKey("L"));
        assertEquals(true , hashTable.containsKey("Ali"));
    }

    @Test
    public void hash(){
        HashTable hashTable = new HashTable();
        hashTable.add("Loay" , 54);
        hashTable.add("Mera" , 54);
        int hashedKey = Objects.hashCode("Loay");

        assertEquals(hashedKey, hashTable.hashCode("Loay"));
    }

    @Test
    public void repeatedWord(){
        HashTable hashTable = new HashTable();
        String sentence1="It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String sentence2 = "Hello world from Jordan";

        assertEquals("summer" , hashTable.repeatedWord(sentence1));
        assertEquals("" , hashTable.repeatedWord(sentence2));

    }
}
