package random;

import java.util.Random;

public class RandomTest {
public static void main(String[] args) {
	for (int i = 1; i < 1000; i++) {
		
	
	Random bot = new Random();
	int num = bot.nextInt(201)+200;
	System.out.println(num);
	num+=10;
}
}
}