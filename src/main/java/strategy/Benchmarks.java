package strategy;
import org.openjdk.jmh.annotations.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Warmup(iterations = 3)
@Measurement(iterations = 5)
@Fork(value=2)
public class Benchmarks {

    Sort sort = new Sort();


    @Benchmark
    public void selectionSortBenchmarkSmall() {
        int[] array = new int[1000];
        Random random = new Random();
        array = random.ints(1000, 10,1000).toArray();

        SortingStrategy strategy = new SelectionSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void selectionSortBenchmarkMedium() {
        int[] array = new int[10000];
        Random random = new Random();
        array = random.ints(10000, 10,10000).toArray();

        SortingStrategy strategy = new SelectionSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void selectionSortBenchmarkLarge() {
        int[] array = new int[100000];
        Random random = new Random();
        array = random.ints(100000, 10,100000).toArray();

        SortingStrategy strategy = new SelectionSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void mergeSortBenchmarkSmall() {
        int[] array = new int[1000];
        Random random = new Random();
        array = random.ints(1000, 10,1000).toArray();

        SortingStrategy strategy = new MergeSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void mergeSortBenchmarkMedium() {
        int[] array = new int[10000];
        Random random = new Random();
        array = random.ints(10000, 10,10000).toArray();

        SortingStrategy strategy = new MergeSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void mergeSortBenchmarkLarge() {
        int[] array = new int[100000];
        Random random = new Random();
        array = random.ints(100000, 10,100000).toArray();

        SortingStrategy strategy = new MergeSort();
        sort.sort(strategy, array);
    }


    @Benchmark
    public void quickSortBenchmarkSmall() {
        int[] array = new int[1000];
        Random random = new Random();
        array = random.ints(1000, 10,1000).toArray();

        SortingStrategy strategy = new QuickSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void quickSortBenchmarkMedium() {
        int[] array = new int[100000];
        Random random = new Random();
        array = random.ints(10000, 10,10000).toArray();

        SortingStrategy strategy = new QuickSort();
        sort.sort(strategy, array);
    }

    @Benchmark
    public void quickSortBenchmarkLarge() {
        int[] array = new int[100000];
        Random random = new Random();
        array = random.ints(100000, 10,100000).toArray();

        SortingStrategy strategy = new QuickSort();
        sort.sort(strategy, array);
    }

}
