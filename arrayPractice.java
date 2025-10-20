import java.util.Scanner;

public class arrayPractice {
    public static void main(String[] args) {
        // Defining and accessing marks variables
        // type 1
        // int marks[]=new int[3];
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=100;
        // for(int i=0;i<marks.length;i++){
        // // System.out.print(marks[i]+" ");
        // }
        // type 2
        // int arr[]={1,2,3,4};
        // for(int i=0;i<arr.length;i++){
        // // System.out.print(arr[i]+" ");
        // }

        // take input from user
        // Scanner sc=new Scanner(System.in);
        // int size=sc.nextInt();
        // int numbersArr[]=new int[size];
        // for(int i=0;i<size;i++){
        // numbersArr[i]=sc.nextInt();
        // }
        // for(int i=0;i<size;i++){
        // System.out.println(i+1+" number arr is:"+numbersArr[i]);
        // }

        // practice que 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " number:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the searched number you want to serached in the array:");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.print("you are want to search number that number is appeared at position:" + i);
                break;
            }

        }

    }
}
