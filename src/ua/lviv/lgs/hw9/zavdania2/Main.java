package ua.lviv.lgs.hw9.zavdania2;

public class Main {

	public static void main(String[] args) {
		Methods m = new Methods();
		double a, b;

		a = -5.3;
		b = -7.85;
		try {
			System.out.println(a + " + " + b + " = " + m.plus(a, b));
		} catch (Throwable e) {
			System.out.println("Перехоплено виключення: " + e.toString());
		}

		a = 12.3;
		b = 0;
		try {
			System.out.println(a + " - " + b + " = " + m.minus(a, b));
		} catch (Throwable e) {
			System.out.println("Перехоплено виключення: " + e.toString());
		}

		a = 0;
		b = 10.0;
		try {
			System.out.println(a + " * " + b + " = " + m.mnogenia(a, b));
		} catch (Throwable e) {
			System.out.println("Перехоплено виключення: " + e.toString());
		}

		a = 12.3;
		b = 15.55;
		try {
			System.out.println(a + " / " + b + " = " + m.dilenia(a, b));
		} catch (Throwable e) {
			System.out.println("Перехоплено виключення: " + e.toString());
		}

		a = 0;
		b = 0;
		try {
			System.out.println(a + " + " + b + " = " + m.plus(a, b));
		} catch (Throwable e) {
			System.out.println("Перехоплено виключення: " + e.toString());
		}

	}

}
