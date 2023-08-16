package _6_TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of Fahrenheit");
		double Fahrenheit=scan.nextDouble();
		
		TemperatureConverterApp TCA=new TemperatureConverterApp();
		double Celsius=TCA.convertFahrenheitToCelsius( Fahrenheit);
		System.out.println(Celsius);


	}

}
