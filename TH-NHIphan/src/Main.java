import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
            ArrayList<Integer> numberList = (ArrayList<Integer>) objectInputStream.readObject();
            objectInputStream.close();

            // Thống kê và liệt kê số nguyên tố từ 3 chữ số trở lên
            ArrayList<Integer> primeNumbers = getPrimeNumbers(numberList);

            // Sắp xếp và in kết quả
            Collections.sort(primeNumbers);
            for (int prime : primeNumbers) {
                System.out.println(prime);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Hàm kiểm tra số nguyên tố
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Hàm lọc số nguyên tố từ danh sách
    private static ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number >= 100 && isPrime(number)) {
                if (!primeNumbers.contains(number)) {
                    primeNumbers.add(number);
                }
            }
        }
        return primeNumbers;
    }
}
