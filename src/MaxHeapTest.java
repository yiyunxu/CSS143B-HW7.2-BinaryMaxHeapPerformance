import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MaxHeapTest {
    // homework

    @Test
    public void testAdd() {
        int[][] expected = {{2},
                            {4, 2},
                            {7, 2, 4},
                            {7, 7, 2, 1}};
        //add one element
        int testSize = 1;
        MaxHeap heap = new MaxHeap(testSize);
        assertTrue(heap.add(2));
        assertTrue(heap.equal(expected[0]));

        // add two with no duplicates
        testSize = 5;
        heap = new MaxHeap(testSize);
        assertTrue(heap.add(2));
        assertTrue(heap.add(4));
        assertTrue(heap.equal(expected[1]));

        // add three with no duplicates
        testSize = 5;
        heap = new MaxHeap(testSize);
        assertTrue(heap.add(2));
        assertTrue(heap.add(4));
        assertTrue(heap.add(7));
        assertTrue(heap.equal(expected[2]));

        // add four with duplicates
        testSize = 5;
        heap = new MaxHeap(testSize);
        assertTrue(heap.add(2));
        assertTrue(heap.add(1));
        assertTrue(heap.add(7));
        assertTrue(heap.add(7));
        assertTrue(heap.equal(expected[3]));
    }

    @Test
    public void testGet() {
        Integer[][] input = {{2},            //one element
                             {2, 4},         //two with no duplicates
                             {5, 3},         //two with no duplicates
                             {2, 4, 7},      //three with no duplicates
                             {2, 1, 7, 7}};  //four with duplicates
        Integer[] expected = {2, 4, 5, 7, 7};

        for (int i=0; i< input.length; i++){
            int testSize = input[i].length;
            MaxHeap heap = new MaxHeap(testSize);

            for (int j=0; j< input[i].length; j++){
                assertTrue(heap.add(input[i][j]));
            }
            assertEquals(heap.get(), expected[i]);
        }
    }

    @Test
    public void testPop() {
        Integer[][] input = {{2},            //one element
                             {2, 4},         //two with no duplicates
                             {5, 3},         //two with no duplicates
                             {2, 4, 7},      //three with no duplicates
                             {2, 1, 7, 7}};  //four with duplicates
        Integer[] expectedPop = {2, 4, 5, 7, 7};
        int[][] expectedData = {{},
                                {2},
                                {3},
                                {4, 2},
                                {7, 1, 2}};

        for (int i=0; i< input.length; i++){
            int testSize = input[i].length;
            MaxHeap heap = new MaxHeap(testSize);

            for (int j=0; j< input[i].length; j++){
                assertTrue(heap.add(input[i][j]));
            }
            assertEquals(heap.pop(), expectedPop[i]);
            assertTrue(heap.equal(expectedData[i]));
        }
    }

    @Test
    public void testMaxHeapLogN(){
        Integer[][] input = {{2},            //one element
                             {2, 4},         //two with no duplicates
                             {5, 3},         //two with no duplicates
                             {2, 4, 7},      //three with no duplicates
                             {2, 1, 7, 7}};  //four with duplicates
        int[][] expected = {{2},
                            {4, 2},
                            {5, 3},
                            {7, 2, 4},
                            {7, 7, 2, 1}};
        for (int i = 0; i< input.length; i++){
            int testSize = input[i].length;
            MaxHeap heap = new MaxHeap(testSize);
            heap.MaxHeapLogN(input[i]);
            //System.out.println(heap);
            assertTrue(heap.equal(expected[i]));
        }
    }

    @Test
    public void testMaxHeapN(){
        Integer[][] input = {{2},
                {2, 4},
                {5, 3},
                {2, 4, 7},
                {2, 1, 7, 7}};
        int[][] expected = {{2},
                {4, 2},
                {5, 3},
                {7, 4, 2},
                {7, 2, 7, 1}};
        for (int i = 0; i< input.length; i++){
            int testSize = input[i].length;
            MaxHeap heap = new MaxHeap(testSize);
            heap.MaxHeapN(input[i]);
            //System.out.println(heap);
            assertTrue(heap.equal(expected[i]));
        }
    }



}