package homework1;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double[] coefficients = getCoefficientsForEquation();
        System.out.println(Arrays.toString(searchRoots(coefficients, discriminant(coefficients))));
    }

    private static double[] getCoefficientsForEquation() {
        Scanner scanner = new Scanner(System.in);

        double[] coefficients = new double[3];
        System.out.println("Enter the a, b, c coefficients:");
        for (int i = 0; i < 3; i++) {
            coefficients[i] = scanner.nextInt();
        }

        return coefficients;
    }

    private static double discriminant(double[] coeff) {
        return coeff[1] * coeff[1] - 4 * coeff[0] * coeff[2];
    }

    private static double[] searchRoots(double[] coeff, double discriminant) {
        double[] roots;

        if (discriminant < 0) {
            return null;
        } else if (discriminant == 0) {
            roots = new double[1];

            roots[0] = -coeff[1] / (2.0 * coeff[0]);

            return roots;
        } else {
            roots = new double[2];

            roots[0] = (-coeff[1] - Math.sqrt(discriminant)) / (2 * coeff[0]);
            roots[1] = (-coeff[1] + Math.sqrt(discriminant)) / (2 * coeff[0]);

            return roots;
        }
    }
}
