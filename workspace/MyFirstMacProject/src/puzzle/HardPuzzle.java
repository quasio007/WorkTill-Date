package puzzle;

import org.apache.commons.lang.ArrayUtils;

public class HardPuzzle {

	public static void main(String[] args) {
		int[][] a = new int[7][6];
		int[] b = new int[2];
		int[] c = new int[6];
		int[] d = new int[6];
		// int[] e;
		// int[] f;
		int[] delO = new int[2];
		int[] delO1 = new int[2];
		int[] delI = new int[2];
		int[] delI1 = new int[2];
		double sum = 0;
		int r = 0;

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				if (i != j && j > i) {
					for (int k = 1; k <= 12; k++) {
						if (k != j && k != i && k > i && k > j) {
							for (int m = 1; m <= 12; m++) {
								if (m != j && m != i && m != k && m > k && m > i && m > j) {
									for (int n = 1; n <= 12; n++) {
										if (n != j && n != i && n != k && n != m && n > m && n > k && n > j && n > i) {
											for (int o = 1; o <= 12; o++) {
												if (o != j && o != i && o != k && o != m && o != n && o > n && o > m
														&& o > k && o > j && o > i) {

													sum = i + j + k + m + n + o;
													if (sum == 26) {
														System.out.println("One of the possible combination is: " + i
																+ ", " + j + ", " + k + ", " + m + ", " + n + ", " + o);
														a[r][0] = i;
														a[r][1] = j;
														a[r][2] = k;
														a[r][3] = m;
														a[r][4] = n;
														a[r][5] = o;
														r++;

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

		System.out.println("Array for possible combinations:");
		for (int p = 0; p < 7; p++) {
			for (int q = 0; q < 6; q++) {

				System.out.print(a[p][q] + " ");

			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		// Other 2-Dimensional Array having values not present in this upper
		// array:

		// not getting the 4 values sum =26
		System.out.println("Opposite Array:");
		for (int s = 0; s < 7; s++) {
			for (int t = 0; t < 6; t++) {
				c[t] = a[s][t];
			}

			// For finding d[]:

			boolean flag = false;
			int l = 0;
			for (int i = 1; i <= 12; i++) {
				flag = false;
				for (int j = 0; j < 6; j++) {
					if (i == c[j]) {
						flag = true;
						break;
					}
				}
				if (flag == false) {
					d[l] = i;
					System.out.print(d[l] + " ");
					l++;
				}
			}
			System.out.println("");
			for (int i : c) {
				for (int j : c) {
					if (i != j) {
						for (int k : d) {
							for (int m : d) {
								if (k != m) {
									if (i + j + k + m == 26) {
//										System.out.println("i,j,k,m: " + i + ", " + j + ", " + k + ", " + m);
										delO[0] = i;
										delO[1] = j;
										delI[0] = k;
										delI[1] = m;

										// Deleting i and j found from the outer
										// circle i.e array "c"
										// "e" is outside array with remaining 4
										// terms
										int[] e = c;
										int x = 0;
										for (int y = 0; y < 6; y++) {
											for (int z = 0; z < 2; z++) {
												if (delO[z] == e[y]) {
													b[x] = y;
													x++;
												}

											}
										}

										int temp = 0;
										for (int z = 0; z < 2; z++) {
											e = ArrayUtils.remove(e, b[z] - temp);
											temp++;
										}
//										System.out.println(" ");
//										System.out.println("C Array after deleting 2 elements: ");
//										for (int o : e) {
//											System.out.print(o + " ");
//										}
//										System.out.println(" ");
										
										// Deleting k and m found from the outer
										// circle i.e array "d"
										// "f" is outside array with remaining 4
										// terms
										int[] f = d;
										x = 0;
										for (int y = 0; y < 6; y++) {
											for (int z = 0; z < 2; z++) {
												if (delI[z] == f[y]) {
													b[x] = y;
													x++;
												}

											}
										}

										temp = 0;
										for (int z = 0; z < 2; z++) {
											f = ArrayUtils.remove(f, b[z] - temp);
											temp++;
										}
//										System.out.println(" ");
//										System.out.println("D Array after deleting 2 elements: ");
//										for (int o : f) {
//											System.out.print(o + " ");
//										}
//										System.out.println("");
										
// Now getting the i1,j1,k1 and m1
										for (int i1 : e) {
											for (int j1 : e) {
												if (i1 != j1) {
													for (int k1 : f) {
														for (int m1 : f) {
															if (k1 != m1) {
																if (i1 + j1 + k1 + m1 == 26) {
//																	System.out.println("i1,j1,k1,m1: " + i1 + ", " + j1 + ", " + k1 + ", " + m1);
																	delO1[0] = i1;
																	delO1[1] = j1;
																	delI1[0] = k1;
																	delI1[1] = m1;

																	// Deleting i1 and j1 found from the outer
																	// circle i.e array "e"
																	// "g" is outside array with remaining 2
																	// terms
																	int[] g = e;
																	 x = 0;
																	for (int y = 0; y < 4; y++) {
																		for (int z = 0; z < 2; z++) {
																			if (delO1[z] == g[y]) {
																				b[x] = y;
																				x++;
																			}

																		}
																	}

																	 temp = 0;
																	for (int z = 0; z < 2; z++) {
																		g = ArrayUtils.remove(g, b[z] - temp);
																		temp++;
																	}
//																	System.out.println(" ");
//																	System.out.println("E Array after deleting 2 elements: ");
//																	for (int o : g) {
//																		System.out.print(o + " ");
//																	}
//																	System.out.println(" ");
																	// Deleting k1 and m1 found from the outer
																	// circle i.e array "f"
																	// "h" is outside array with remaining 4
																	// terms
																	int[] h = f;
																	x = 0;
																	for (int y = 0; y < 4; y++) {
																		for (int z = 0; z < 2; z++) {
																			if (delI1[z] == h[y]) {
																				b[x] = y;
																				x++;
																			}

																		}
																	}

																	temp = 0;
																	for (int z = 0; z < 2; z++) {
																		h = ArrayUtils.remove(h, b[z] - temp);
																		temp++;
																	}
//																	System.out.println(" ");
//																	System.out.println("f Array after deleting 2 elements: ");
//																	for (int o : h) {
//																		System.out.print(o + " ");
//																	}
//																	System.out.println(" ");
																	for(int o: g){
																		for(int n: h){
																			for(int u: delO){
																				for(int v: delI1){
																					if(o + n + u + v == 26){
//																						System.out.println("o,n,u,v: " + o + ", " + n + ", " + u + ", " + v);
																						int[] g1 = g;
																						for( r=0;r<2;r++){
																							if(o==g1[r]){
																								b[0]=r;
																							}
																						}
																						g1 = ArrayUtils.remove(g1, b[0]);
																						int o1 = g1[0];
																						
																						int[] h1 = h;
																						for( r=0;r<2;r++){
																							if(n==h1[r]){
																								b[0]=r;
																							}
																						}
																						h1 = ArrayUtils.remove(h1, b[0]);
																						int n1 = h1[0];
																						
																						int[] delO2 = delO;
																						for( r=0;r<2;r++){
																							if(u==delO2[r]){
																								b[0]=r;
																							}
																						}
																						delO2 = ArrayUtils.remove(delO2, b[0]);
																						int u2 = delO2[0];
																						
																						int[] delI2 = delI1;
																						for( r=0;r<2;r++){
																							if(v==delI2[r]){
																								b[0]=r;
																							}
																						}
																						delI2 = ArrayUtils.remove(delI2, b[0]);
																						int v2 = delI2[0];
																						
																						System.out.println(" ");
																								for(int u1: delO1){
																									for(int v1: delI){
																										if(o1 + n1 + u1 + v1 == 26 && o+n1+u2+v2 == 26 ){
																											int[] delO3 = delO1;
																											for( r=0;r<2;r++){
																												if(u1==delO3[r]){
																													b[0]=r;
																												}
																											}
																											delO3 = ArrayUtils.remove(delO3, b[0]);
																											int u3 = delO3[0];
																											
																											int[] delI3 = delI;
																											for( r=0;r<2;r++){
																												if(v1==delI3[r]){
																													b[0]=r;
																												}
																											}
																											delI3 = ArrayUtils.remove(delI3, b[0]);
																											int v3 = delI3[0];
																											if(o1 + n + u3 + v3 == 26){
																											
//																											System.out.println(" ");
//																											System.out.println("o1,n1,u1,v1: " + o1 + ", " + n1+ ", " + u1 + ", " + v1);
																										System.out.println("The possible solution :");
																										System.out.println("Outer 6 terms: ");
																										for(int out : c){
																											System.out.print(out+" ");
																										}
																										System.out.println(" ");
																										System.out.println("Inner 6 terms: ");
																										for(int inr : d){
																											System.out.print(inr+" ");
																										}
																										System.out.println(" ");
																										System.out.println("i,j,k,m: " + i + ", " + j + ", " + k + ", " + m);
																										System.out.println("i1,j1,k1,m1: " + i1 + ", " + j1 + ", " + k1 + ", " + m1);
																										System.out.println("o,n,u,v: " + o + ", " + n + ", " + u + ", " + v);
																										System.out.println("o1,n1,u1,v1: " + o1 + ", " + n1+ ", " + u1 + ", " + v1);
																										System.out.println("o,n1,u2,v2: " + o + ", " + n1+ ", " + u2 + ", " + v2);
																										System.out.println("o1,n,u3,v3: " + o1 + ", " + n+ ", " + u3 + ", " + v3);
																										System.out.println(" ");
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
								}
							}
						}
					}
				}
			}
			System.out.println("");
		}
	}

