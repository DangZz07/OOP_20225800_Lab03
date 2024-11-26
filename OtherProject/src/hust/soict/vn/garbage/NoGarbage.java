package hust.soict.vn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) {
        String filePath = "C:\Users\DANG\Documents\GitHub\OOP_20225800_Lab03\OtherProject\src\hust\soict\vn\garbage"; // Đường dẫn tới file cần đọc
        long start, finish;

        try {
            // Đọc file dưới dạng mảng byte
            byte[] fileData = Files.readAllBytes(Paths.get(filePath));

            // Bắt đầu đo thời gian
            start = System.currentTimeMillis();

            // Dùng StringBuilder thay vì phép cộng chuỗi để tránh tạo quá nhiều đối tượng String
            StringBuilder result = new StringBuilder();
            for (byte b : fileData) {
                result.append((char) b); // Dùng append thay vì cộng chuỗi
            }

            // Kết thúc đo thời gian
            finish = System.currentTimeMillis();

            // In thời gian thực hiện
            System.out.println("Thời gian thực hiện (ms): " + (finish - start));
        } catch (IOException ex) {
            System.err.println("Lỗi khi đọc file: " + ex.getMessage());
        }
    }
}

