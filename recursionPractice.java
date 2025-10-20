import java.util.*;

public class recursionPractice {
    public static void printNum(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNum(n + 1);
    }

    // sum of n natural number
    public static void naturalNumSum(int i, int n, int sum) {
        if (i == n) {
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        naturalNumSum(i + 1, n, sum);
    }

    // factorial
    public static int calFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int factnm1 = calFact(n - 1);
        int fact = n * factnm1;
        return fact;
    }

    // fibonachi
    public static void calFib(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        calFib(b, c, n - 1);
    }

    // calculate x to the power
    public static int calXPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int xPowerxMn = calXPower(x, n - 1);
        int xPowern = x * xPowerxMn;
        return xPowern;
    }

    // permutation
    public static void printPurm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPurm(newStr, permutation + currentChar);
        }
    }

    // calculate total paths in maze
    public static int countPath(int i, int j, int m, int n) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downSide = countPath(i + 1, j, m, n);
        int rightSide = countPath(i, j + 1, m, n);
        return downSide + rightSide;
    }

    // calculate way to place the tiles
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int horizontalWay = placeTiles(n - 1, m);
        int verticalWay = placeTiles(n - m, m);
        return horizontalWay + verticalWay;
    }

    // total number of ways to invite the guist in party
    public static int inviteGuist(int n) {
        if (n <= 1) {
            return 1;
        }
        int singleInvitation = inviteGuist(n - 1);
        int pairInvitation = (n - 1) * inviteGuist(n - 2);
        return singleInvitation + pairInvitation;
    }
    //print all subsets
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubset(n-1, subset);
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }

    public static void main(String[] args) {
        // printNum(1);
        // naturalNumSum(1, 5, 0);
        // int ans=calFact( 5);
        // System.out.println(ans);
        // int a=0,b=1,n=7;
        // System.out.println(a);
        // System.out.println(b);
        // calFib(a, b, n-2);
        // int ans= calXPower(2, 5);
        // System.out.println(ans);
        // String str="abcd";
        // printPurm(str,"");
        // int n=3,m=4;
        // int totalPath=countPath(0, 0, m, n);
        // System.out.println(totalPath);
        // int n=4,m=2;
        // int totalWaysToArrenge=placeTiles(n, m);
        // System.out.println(totalWaysToArrenge);
        // int n = 1;
        // System.out.println(inviteGuist(n));
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n, subset);
    }
}
