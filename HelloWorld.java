public class HelloW0rld{

	public static boolean isPrime(int x){
	int countdown = 2;
	while (countdown != x) {
		if (x % countdown == 0) {return false;}
		countdown += 1;}
	return true;
	}

	public static int nthPrime(int x){
		int countdown = 2;
		while (x > 0) {
			countdown ++;
			if (isPrime(countdown)) {x -= 1;}
		}
		return countdown;
	}

	public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int[] exp = {2, 3, 5, 7};

        for (int i = 0; i < val.length; i++) {
            if (nthPrime(val[i]) == exp[i]) {
                System.out.println("pass");
            } else {
                System.out.println("fail :(");
            }
        }
    }
}
