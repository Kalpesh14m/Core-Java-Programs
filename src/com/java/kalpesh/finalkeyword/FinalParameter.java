/*If you declare any parameter as final, you cannot change the value of it.
 * 
 * Can we declare a constructor final?
 * ==> No, because constructor is never inherited.
*/
package com.java.kalpesh.finalkeyword;

class FinalParameter {
	int cube(final int n) {
		n = n + 2;// can't be changed as n is final
		return n * n * n;
	}

	public static void main(String args[]) {
		FinalParameter b = new FinalParameter();
		int ans = b.cube(5);
		System.out.println(ans);
	}
}