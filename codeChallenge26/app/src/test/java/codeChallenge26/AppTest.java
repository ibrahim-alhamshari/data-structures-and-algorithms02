/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codeChallenge26;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    public void sortArray(){
        int[] array =new int[] {54, 32 , 64 , 98 , 5};
        int result1= 5;
        assertEquals(result1 , App.sortArray(array));

        int[] array2 = {20 , 12 , 9 , 41 };
        int result2 = 9;
        assertEquals(result2 ,App.sortArray(array2));
    }


}
