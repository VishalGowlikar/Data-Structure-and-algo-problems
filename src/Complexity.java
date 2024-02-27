//Gowlikar Vishal
public class Complexity {
    // O(n^2)
    public static void method1(int n) {
        int operator = 0; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                  System.out.println("operation done: " + operator);
                operator++;
            }
        }
        System.out.println("the time complexity taken for the O(n^2) is:" + operator);
    }

    // O(n^3)
    public static void method2(int n) {
        int operator = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 00; k < n; k++) {
                      System.out.println("no of operations done for the O(n^3)" + operator);
                    operator++;
                }
            }
        }
        System.out.println("the time complexity taken for O(n^3) is:" + operator);
    }

    // O(logn) reverse complexity
    public static void method3(int n) {
        int operator = 0;
        for (int i = n; i > 1; i = i / 2) {
             System.out.println("no of the operation done:" + operator);
            operator++;

        }
        System.out.println("the time complexity taken for O(logn) is:" + operator);
    }

    // O(nlogn)
    public static void method4(int n) {
        int operator = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                 System.out.println("no of the operation done:" + operator);
                operator++;
            }
        }
        System.out.println("Time complexity taken for  O(logn) is:" + operator);
    }

    // OLOG(LOG(N))
    public static void method5(int n) {
        int operator = 0, v = 0;
        for (int i = 1; i < n; i = i * 2) {
            v++;
        }
        for (int j = 0; j < v; j++) {
             System.out.println("no of operation done:" + operator);
            operator++;
        }

        System.out.println("Time Complexity taken for Olog(log(n)) is:" + operator);
    }

    public static void main(String[] args) throws Exception {
        
        // method1(100);
        // method2(100);
        // method3(100);
        // method4(100);
        // method5(100);
        method1(100);
    }
}
