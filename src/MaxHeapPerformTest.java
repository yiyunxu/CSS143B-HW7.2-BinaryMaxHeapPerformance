import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class MaxHeapPerformTest {

    @Test
    public void timePQBuild() {
        int start = 100000;
        int end = start * 100;
        PrintWriter output = null;

        try
        {
            // saves duration time output in a txt file
            output = new PrintWriter(new FileOutputStream("Data.txt"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
            System.exit(0);
        }
        output.println("length tN tNlogN"); // header

        for (int i=start; i<=end; i+=200000) {

            Integer[] data = new Integer[i];

            for (int j=0; j<i; j++) {
                data[j] = j;
            }

            long tN = testNBuild(data);

            long tNlogN = testNlogNBuild(data);

            System.out.printf("%d %d %d\n", i, tN, tNlogN);
            output.printf("%d %d %d\n", i, tN, tNlogN);
        }
        output.close();
    }

    private long testNlogNBuild(Integer[] data) {
        MaxHeap heap = new MaxHeap(data.length);

        long startTime = System.nanoTime();

        heap.MaxHeapLogN(data);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }

    private long testNBuild(Integer[] data) {
        MaxHeap heap = new MaxHeap(data.length);

        long startTime = System.nanoTime();

        heap.MaxHeapN(data);

        long endTime = System.nanoTime();

        return TimeUnit.MICROSECONDS.convert(endTime-startTime, TimeUnit.NANOSECONDS);
    }
}
