public class Context {
    private SortingStrategy strat;

    public void setStrategy(SortingStrategy strat) {
        this.strat = strat;
    }

    public void sort(int[] arr) {
        long startTime = System.nanoTime();
        strat.sort(arr);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // to milliseconds
        System.out.println(strat.getClass().getSimpleName() + " took " + duration + " ms");
    }
}
