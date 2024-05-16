public class Main {
    public static void main(String[] args) {

        int n = 10;

        // #1
        int sum1 = 0;
        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sum1++;
        }
        long end1 = System.nanoTime();
        System.out.println("#1: " + sum1);
        double elapsedTime = (end1 - start1)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ elapsedTime);

        // #2

        int sum2 = 0;
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum2++;
            }
        }
        long end2 = System.nanoTime();
        System.out.println("#2: " + sum2);
        double elapsedTime2 = (end2 - start2)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime2));

        // #3
        int sum3 = 0;
        long start3 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum3++;
            }
        }
        long end3 = System.nanoTime();
        System.out.println("#3: " + sum3);
        double elapsedTime3 = (end3 - start3)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime3));

        // #4

        int sum4 = 0;
        long start4 = System.nanoTime();
        for (int i = 0; i < n; i++){
            sum4++;
        }
        for (int j = 0; j < n; j++){
            sum4++;
        }

        long end4 = System.nanoTime();
        System.out.println("#4: " + sum4);
        double elapsedTime4 = (end4 - start4)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime4));

        // #5
        int sum5 = 0;
        long start5 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                sum5++;
            }
        }
        System.out.println("#5: " + sum5);
        long end5 = System.nanoTime();
        double elapsedTime5 = (end5 - start5)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime5));

        // #6
        int sum6 = 0;
        long start6 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sum6++;
            }
        }
        long end6 = System.nanoTime();
        System.out.println("#6: " + sum6);
        double elapsedTime6 = (end6 - start6)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime6));


        // #8
        int sum8 = 0;
        long start8 = System.nanoTime();
        int x = n;
        while (x > 1) {
            x = x / 2;
            sum8++;
        }
        long end8 = System.nanoTime();
        System.out.println("#8: " + sum8);
        double elapsedTime8 = (end8 - start8)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime8));

        // #7
        int sum7 = 0;
        long start7 = System.nanoTime();
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n * n; j++) {
                if (j % i == 0) {
                    for (int k = 0; k < j; k++) {
                        sum7++;
                    }
                }
            }
        }

        long end7 = System.nanoTime();
        System.out.println("#7: " + sum7);
        double elapsedTime7 = (end7 - start7)/1_000_000.0;
        System.out.println("Elapsed Time in milli seconds: "+ (elapsedTime7));

    }
}