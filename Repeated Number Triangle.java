import java.util.*;

class Ex {
    public void start(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Ex h = new Ex();
        h.start(n);

        sc.close();
    }
}

------------------------------------------
/*
Sample Input
5
Your Output
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 

*/
