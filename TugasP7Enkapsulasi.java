/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ester2305476.tugasp7enkapsulasi;
import java.util.Scanner;
/**
 * Linear Equation
 * @author ASUS Vivobook
 */
public class TugasP7Enkapsulasi {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        LinearEquation persamaan = new LinearEquation(a, b, c, d, e, f);

        if (persamaan.isSolvable()) {
            System.out.println("Solusi x = " + persamaan.getX());
            System.out.println("Solusi y = " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }

        input.close();
    }
}