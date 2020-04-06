package core;

public class TestDataGenerator {
	int length = 0, result = 0;
	static int max = 35;

	public static void main(String[] args) {
		for (int i = 2; i <= max; i++) {
			System.out.println("{6,false}" + (i < max ? "," : ""));
		}
	}
}