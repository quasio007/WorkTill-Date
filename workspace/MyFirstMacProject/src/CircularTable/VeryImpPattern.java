package CircularTable;

public class VeryImpPattern {

	public static void main(String[] args) {
		int lastManStanding,swordWithInitially,noOfPeople;
		double positionSurvived;
		int checkValue =200,i,j;
		int[][] a =new int[checkValue][checkValue];
		int[] num = new int[checkValue];
		for( i=1;i<checkValue;i++){
			for( j=1;j<=i;j++){
				 noOfPeople = 	i;			
						 swordWithInitially = j;
						 int power = (int) (Math.log(noOfPeople) / Math.log(2));
						 positionSurvived = 2 * (noOfPeople - Math.pow(2, power)) ;
						 lastManStanding =(int) positionSurvived + swordWithInitially;
						if(lastManStanding>noOfPeople){
							lastManStanding = lastManStanding-noOfPeople;
						}
						a[i][j] =lastManStanding;
			}
			num[i] =i;
		}
		System.out.print("Num"+"  ");
		for(i=1;i<checkValue;i++){
			System.out.print(num[i]+"  ");
		}
		System.out.println("");
		
		for (i=1;i<checkValue;i++) {
			System.out.print(i+"    ");
			for (j=1;j<=i;j++) {

				System.out.print(a[i][j] + "  ");

			}
			System.out.println("");
			
		}	

		}

}
