/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package newCodeChallenges;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        List<String> list= new List<String>();
        list.add("Ali");
        list.add("Malek");
        list.add("Khaled");
        list.add("lana");

        list.add("Noor" , 1);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("+++++++++");

        list.remove(1);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

    }
}
