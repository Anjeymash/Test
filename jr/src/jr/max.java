package jr;

import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class max {
	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		ArrayList<Double> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Double> list2 = new ArrayList<>();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество чисел");
		while (!sc.hasNextInt())
			sc.next();
		int n = sc.nextInt();
		
		System.out.println("¬ведите числа");
		
		for (int i = 0; i < n; i++) {
			while (!sc.hasNextDouble())
				sc.next();
			list.add(sc.nextDouble());
		}
		
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println((Math.floor(list.get(i))));
		} */

		for (int i = 0; i < list.size(); i++) {
		if (((Math.floor(list.get(i)))%2 == 0)&&(Math.ceil(list.get(i))>15))
		
			list1.add((int)Math.floor(list.get(i)));
		}
		
		
		
		/*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 10; i++) {
			list.add(i, reader.readLine());
		}*/

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
}