package puzzle;

public class Star {

	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h,w,x,y,z;
		for(int i=1;i<=12;i++){
			for(int j=1;j<=12;j++){
				if(i!=j){
					for(int k=1;k<=12;k++){
						if(k!=j && k!=i){
							for(int m=1;m<=12;m++){
								if(m!=j && m!=i && m!=k){
									for(int n=1;n<=12;n++){
										if(n!=j && n!=i && n!=k && n!=m ){
											for(int o=1;o<=12;o++){
												if(o!=j && o!=i && o!=k && o!=m && o!=n){
													for(int p=1;p<=12;p++){
														if(p!=j && p!=i && p!=k && p!=m && p!=n && p!=o){
															for(int q=1;q<=12;q++){
																if(q!=j && q!=i && q!=k && q!=m && q!=n && q!=o && q!=p){
																	for(int r=1;r<=12;r++){
																		if(r!=j && r!=i && r!=k && r!=m && r!=n && r!=o && r!=p && r!=q){
																			for(int s=1;s<=12;s++){
																				if(s!=j && s!=i && s!=k && s!=m && s!=n && s!=o && s!=p && s!=q && s!=r){
																					for(int t=1;t<=12;t++){
																						if(t!=j && t!=i && t!=k && t!=m && t!=n && t!=o && t!=p && t!=q && t!=r && t!=s){
																							for(int u=1;u<=12;u++){
																								if(u!=j && u!=i && u!=k && u!=m && u!=n && u!=o && u!=p && u!=q && u!=r && u!=s && u!=t){
																								a=i;
																								b=j;
																								c=k;
																								d=m;
																								e=n;
																								f=o;
																								g=p;
																								h=q;
																								w=r;
																								x=s;
																								y=t;
																								z=u;
																								
																								if(a+b+e+h+y+z==26 && a+d+g+y==26 && a+c+f+h==26 && e+g+x+z==26 && e+d+c+b==26 && b+f+w+z==26 && h+w+x+y==26){
																									System.out.println("Values:");
																									System.out.println("a: "+a +", b: "+b+", c: "+c+", d: "+d+", e: "+e+", f: "+f+", g:"+g+", h: "+h+", w: "+w+", x: "+x+", y: "+y+", z: "+z);
																									System.out.println("");
																									System.out.println("");
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
	
			
	
}
	}


