package Recursion;

public class Fibonacci {

	private static long[] fib = new long[45];
	private static int lastIndex = 2;

	static {
		fib[0] = 0;
		fib[1] = fib[2] = 1;
	}

	// Dynamic Programming Fibonacci
	public long dpFibonacci(int n) {
		for (int i = lastIndex + 1; i <= n; i++)
			fib[i] = fib[i - 1] + fib[i - 2];
		if (n > lastIndex)
			lastIndex = n;
		return fib[n];
	}

	// Recursive Fibonacci
	public long fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

	// Iterative Fibonacci
	public long iterativeFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1 || n == 2)
			return 1;

		long f0 = 0, f1 = 1, f2 = 1;
		for (int i = 2; i < n; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f1 + f0;
		}
		return f2;
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();

		for (int n = 0; n < 45; n++) {
			long t0 = System.currentTimeMillis();
			long m1 = f.dpFibonacci(n);
			long t1 = System.currentTimeMillis();
			System.out.print(n + "|\t" + (t1 - t0) + "\t\t" + m1+"\t");

			long t2 = System.currentTimeMillis();
			long m2 = f.fibonacci(n);
			long t3 = System.currentTimeMillis();
			System.out.print("|\t" + (t3 - t2) + "\t\t" + m2+"\t");

			long t4 = System.currentTimeMillis();
			long m3 = f.iterativeFibonacci(n);
			long t5 = System.currentTimeMillis();
			System.out.print("|\t" + (t5 - t4) + "\t\t" + m3+"\n");
		}
	}

}
