package 자바_예제문제실습;

public class 오버로딩 {
	public void test() {}
	public void test(String str, String s) {}
	public void test(String s) {}
	
	public void test(int a) {}
	public void test(int a, int b) {}
	
	public void test(char a, char b) {}
	void test(char ch) {}

	public void test(boolean a, boolean b) {}
	public void test(boolean b) {}
	public void test(short s, byte by) {}
	public void test(short c) {}
	public void test(short c, double d) {}

	public void test(int a, String b) {}
	public void test(int a, char b) {}
	
	public void test(String c, int b) {}
	public void test(String c, int b, String d) {}

	public void test(boolean a, short b) {}
	public void test(boolean a, double b) {}
	
}
