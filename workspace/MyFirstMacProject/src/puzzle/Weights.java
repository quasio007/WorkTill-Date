package puzzle;

import java.util.Scanner;


public class Weights {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Hi");
		System.out.println("Enter the weigth till wher you want to calculate any weight between 1 and your requirement :");
		double weight = scan.nextInt();
		double value = 2*weight +1;
		double base = 3;
		
		Double logValue = getDifferentBase(value,base);
		Double logValueIntegerPart = Math.floor(logValue);
		int numOfWeights =logValueIntegerPart.intValue();
		
//	Code as in some cases like log121 for base 3 is 4.99999999999 and not 5 .
		if(1.0-(logValue-logValueIntegerPart) <=0.0000000002){
			System.out.println("check");
			numOfWeights =numOfWeights+1;
		}
		
//		When weight is in the series or it satisfy the condition (logX with base 3 is a integer; integer is the no. of minimum weights required to calculate any value between 1 and that no.)
//		Series :: 1,4,13,40,121,364... where A(nth term) = 3 * A(n-1th term) +1 ;eg 13 =3*4+1 
		if(logValue-logValueIntegerPart==0.0 || 1.0-(logValue-logValueIntegerPart) <=0.0000002){
			System.out.println("In order to calculate any weight till "+(int)weight+", you will need "+numOfWeights+" weights, which are :");
			for(int i=0;i<numOfWeights;i++){
				System.out.println((int)Math.pow(3, i));
			}
		}	
		
//		When the weight is not in series:
		else{
			numOfWeights =numOfWeights+1;
			
			double[] series = new double[numOfWeights];
			for(int i=0;i<numOfWeights;i++){
				series[i]= (Math.pow(3, i+1) - 1)/2;
			}
			
//	Asking User to make a choice:
			System.out.println("You have 2 options :");
			System.out.println("1.) Do you want less no. of weights, using which you would be able to calculate any weights till: "+ series[numOfWeights-1]);
			System.out.println("2.) Do you want more number of weights which will calculate till: "+(int)weight);
			System.out.println("Select your option (1/2) :");
			int option = scan.nextInt();
			
//			Easy option for less no of weights and optimized result result which would calculate till even more weight than user asked for
			if(option==1){
				System.out.println("So in order to calculate any weight till "+series[numOfWeights-1]+", you will need "+numOfWeights+" weights, which are :");
				for(int i=0;i<numOfWeights;i++){
					System.out.println((int)Math.pow(3, i));
				}
			}
			
//			Alternate option where till user asked weight will be calculated in the most optimized way.
			else if(option==2){
				double targetWeight =weight;
				int weightsRequired =0;
				int n =numOfWeights-1;
				int[] numOfOccurence =new int[n];
				
				 for(int k=n-1;k>=0;k--){
					int occurence =0;
					while(series[k] <= targetWeight){
						targetWeight = targetWeight - series[k];
						occurence++;
					}
					numOfOccurence[k] =occurence;
					if(targetWeight==0){
						break;
					}
					
				}
				for(int t=1;t<=n;t++){
					weightsRequired = weightsRequired + numOfOccurence[t-1]*t;
			}
				
				int[] actualWeights = new int[weightsRequired];
				int q = 0;

//				Hardest Part::
				for(int r =0; r<n;r++){
					int p = numOfOccurence[r];
					for(int z=0;z<p;z++){
						for(int y=0;y<=r;y++){
						actualWeights[q] = (int)Math.pow(3, y);
						q++;
						}
					}
				}
				
//				Sorting of array in Assending order
				int temp =0;
				for(int i=0;i<weightsRequired-1;i++){
					for(int j=0;j<weightsRequired-1;j++){
						if(actualWeights[j]>actualWeights[j+1]){
							temp=actualWeights[j+1];
							actualWeights[j+1] = actualWeights[j];
							actualWeights[j] = temp;
						}
					}
				}
				
				System.out.println("So for the least no. of weights if you want to calculate any weight till: "+weight+", you would require "+weightsRequired+" number of weights.");
				System.out.print("Which are: " + actualWeights[0]+", ");
				for(int w=1;w< weightsRequired-1;w++){
					System.out.print(actualWeights[w]+", ");
				}
				System.out.println(actualWeights[weightsRequired-1]);
				
			}else{
				System.out.println("Your selection is invalid.");
			}
		}
	}
	private static double getDifferentBase(double value,double base) {
		return Math.log(value)/Math.log(base);
	}

}
