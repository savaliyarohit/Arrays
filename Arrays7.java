package Arraysdeclared;

public class Arrays7 {
    public static void main(String[] args) {
        String[] car = new String[5];
        car[0] = "BMW";
        car[1] = "Honda";
        car[2] = "Toyota";
        car[3] = "audi";
        car[4] = "Ford";

        for (int i = 0; i <= car.length; i++) {
            System.out.println(car[i]);
        }
    }
}
