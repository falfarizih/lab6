public class Main {
    public static void main(String[] args) {

        int n = 10; // Change the value of n for different tests

        // Fragment #1
        int sum1 = 0;
        for (int i = 0; i < n; i++)
            sum1++;
        System.out.println("#1: " + sum1);

        // Fragment #2
        int sum2 = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum2++;
        System.out.println("#2: " + sum2);

        // Fragment #3
        int sum3 = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum3++;
        System.out.println("#3: " + sum3);

        // Fragment #4
        int sum4 = 0;
        for (int i = 0; i < n; i++)
            sum4++;
        for (int j = 0; j < n; j++)
            sum4++;
        System.out.println("#4: " + sum4);

        // Fragment #5
        int sum5 = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n * n; j++)
                sum5++;
        System.out.println("#5: " + sum5);

        // Fragment #6
        int sum6 = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                sum6++;
        System.out.println("#6: " + sum6);

        // Fragment #7
        int sum7 = 0;
        for (int i = 1; i < n; i++)
            for (int j = 0; j < n * n; j++)
                if (j % i == 0)
                    for (int k = 0; k < j; k++)
                        sum7++;
        System.out.println("#7: " + sum7);

        // Fragment #8
        int sum8 = 0;
        int i = n;
        while (i > 1) {
            i = i / 2;
            sum8++;
        }
        System.out.println("#8: " + sum8);
    }
}