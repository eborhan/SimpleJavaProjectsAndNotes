public class HarmonicSeriesInList {

    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        double harmonicAverage;
        double sum = 0;

        for (int i : list) {
            sum += 1.0 / i;
        }

        harmonicAverage = list.length / sum;
        System.out.println("Harmonic Average: " + harmonicAverage);
    }
}
