import java.util.Scanner;

public class traversal_2D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rows:");
        int rows=sc.nextInt();
        System.out.print("Enter the cols:");
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the Array Elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("You are Entered Elements are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
