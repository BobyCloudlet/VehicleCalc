import Class.VehicleCalc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VehicleCalc bmwM5 = new VehicleCalc();

        System.out.print("Input car age: ");
        bmwM5.setCarAge(input.nextShort());

        System.out.print("\nInput car power: ");
        bmwM5.setCarPower(input.nextShort());

        System.out.print("\nInput car registration region: ");
        bmwM5.setCarRegistrationRegion(input.next());

        float calculate = bmwM5.distribution(bmwM5.getCarPower(), bmwM5.getCarAge(), bmwM5.getCarRegistrationRegion());
        System.out.printf("%.2f", calculate);
    }
}