package myPackage;

public class Person {
    public static void main(String[] args) {
        int[] arr = {1,2};

        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("loi" + e);
        } catch (Exception e) {
            System.out.println("loi 2");
        }
        System.out.println("ket thuc");
    }
}
// compile time
// code kem
// JVM
// thieu bo nho;

// Exception cha goc de cuoi cung;
// Co the dat nhieu catch;
