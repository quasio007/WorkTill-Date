package puzzle;

public class NineNumberPuzzle {

	public static void main(String[] args) {
		double count=0;
		System.out.println(" Possible Solutions::");
		System.out.println(" "); 
				for (double a = 1; a <= 9; a++) {
			for (double b = 1; b <= 9; b++) {
				if (a != b) {
					for (double c = 1; c <= 9; c++) {
						if (c != b && c != a) {
							for (double d = 1; d <= 9; d++) {
								if (d != b && d != a && d != c) {
									for (double e = 1; e <= 9; e++) {
										if (e != b && e != a && e != c && e != d) {
											for (double f = 1; f <= 9; f++) {
												if (f != b && f != a && f != c && f != d && f != e) {
													for (double g = 1; g <= 9; g++) {
														if (g != b && g != a && g != c && g != d && g != e && g != f) {
															for (double h = 1; h <= 9; h++) {
																if (h != b && h != a && h != c && h != d && h != e
																		&& h != f && h != g) {
																	for (double i = 1; i <= 9; i++) {
																		if (i != b && i != a && i != c && i != d && i != e && i != f && i != g&& i != h) {
																			if(a+(13*(b/c))+d+(12*e)-f-11+(g*(h/i))-10 == 66){
																				System.out.println("a: "+a +", b: "+b+", c: "+c+", d: "+d+", e: "+e+", f: "+f+", g:"+g+", h: "+h+", i: "+i);
																				count++;
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
				System.out.println();System.out.println( );
		System.out.println("Total Solutions: "+count);
	}
}
