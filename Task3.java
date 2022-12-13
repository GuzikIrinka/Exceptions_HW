/*Дан следующий код, исправьте его там, где требуется (задание 3
https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */

public class Task3 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Pointer can't point to null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Array is out of its size!");
        } catch (Throwable ex) {
            System.out.println("Something went wrong...");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
