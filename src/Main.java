import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] GPAJAvaCource = {3.4, 2.8, 3.3, 3.6, 3.0, 4.0};
        double[] GPAPythonCourse = {3.2,4.0,2.6,3.8,2.8,3.7};

        System.out.println("GPA JAva Cource above or equal to 3.5");
        System.out.println(NumberOfHighestGPAScore(GPAJAvaCource));
        System.out.println("GPA Python Cource above or equal to 3.5");
        System.out.println(NumberOfHighestGPAScore(GPAPythonCourse));
    }
    public static int NumberOfHighestGPAScore(double[] arr)
    {
        // Counts GPAs 3.5 or above
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 3.5){
                count++;
            }
        }
        return count;
    }
}
