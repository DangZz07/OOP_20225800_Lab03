package hust.soict.vn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) {
        String filePath = "Garbage.txt"; // Đường dẫn tới file cần đọc
        long start, finish;

        try {
            // Đọc file dưới dạng mảng byte
            byte[] fileData = Files.readAllBytes(Paths.get(filePath));

            // Bắt đầu đo thời gian
            start = System.currentTimeMillis();

            // Tạo rác bằng cách nối chuỗi không tối ưu
            String result = "";
            for (int i = 0; i < 100; i++) { // Vòng lặp để tăng rác
                for (byte b : fileData) {
                    result += (char) b;
                }
                System.out.println("Iteration " + i + " completed");
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
