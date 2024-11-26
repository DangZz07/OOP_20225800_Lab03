import java.util.Scanner; 

public class bai67 {
    public static void nhapmatran(int arr[][], int n, int m) { // n la so hang, m la so cot
        Scanner s1 = new Scanner(System.in); 
        for (int k = 0; k < n; k++) {
            System.out.println("Nhap hang thu " + (k + 1) + " (cac so cach nhau bang dau cach):");
            String s = s1.nextLine(); 
            String input[] = s.split(" "); 
            if (input.length != m) { 
                System.out.println("Nhap sai, yeu cau nhap lai");
                k--; 
                continue;
            }
            for (int b = 0; b < m; b++) {
                arr[k][b] = Integer.parseInt(input[b]); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        int n, m;

      
        System.out.println("Nhap so hang cua ma tran:");
        n = s.nextInt();
        System.out.println("Nhap so cot cua ma tran:");
        m = s.nextInt();
        s.nextLine(); 
        
        int[][] arr = new int[n][m];
        System.out.println("Nhap ma tran thu 1:");
        nhapmatran(arr, n, m);

      
        int[][] arr1 = new int[n][m];
        System.out.println("Nhap ma tran thu 2:");
        nhapmatran(arr1, n, m);

  
        int[][] arr2 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }


        System.out.println("Ma tran 1 sau khi cong voi ma tran 2 la:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        s.close(); 
    }
}
