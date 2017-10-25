package puzzle;

import java.util.Scanner;

public class QuestionPaper {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String[] correctAns = {"a","a","a","a","a"};
		String[] userAns = new String[5];
		int i=0 ,j=0, k=1;
		double percentage=0, numOfCorrectAns=0;
		
		System.out.println("So are you ready for the exam ?");
		System.out.println("Reply in Y or N");
		String yesOrNo = scan.nextLine();
		switch(yesOrNo){
		case "Y" :
			System.out.println("Ok so let's start");
			System.out.println("Reply for all questions in the form of option, if you think correct answer is oprion 'a' then reply with a");
			break;
		case "N" :
			System.out.println("Your exam has been posponed for tomorrow, more details would be send to your mail ID");
			break;
		case "y" :
			System.out.println("Ok so let's start");
			System.out.println("Reply for all questions in the form of option, if you think correct answer is oprion 'a' then reply with a");
			break;
		case "n" :
			System.out.println("Your exam has been posponed for tomorrow, more details would be send to your mail ID");
			break;
			default :
				System.out.println("Your Entry is Invalid");
				System.out.println("You have been disqualified...");
				System.out.println("Get Out...!!!");
		}
		if(yesOrNo.equalsIgnoreCase("Y")){
			System.out.println("Q"+k+". what is 2*2 ?");
			System.out.println("a) 4");
			System.out.println("b) 6");
			userAns[i] = scan.nextLine();
			System.out.println("Are you sure for that ans , Reply in Y/N :");
			String yOrN = scan.nextLine();
			if(yOrN.equalsIgnoreCase("N")){
				System.out.println("So what is your new selection a/b ?");
				userAns[i] = scan.nextLine();
			}
			i++ ;
			k++;
			
			System.out.println("Q"+k+". what is 2*3 ?");
			System.out.println("a) 6");
			System.out.println("b) 8");
			userAns[i] = scan.nextLine();
			System.out.println("Are you sure for that ans , Reply in Y/N :");
		    yOrN = scan.nextLine();
			if(yOrN.equalsIgnoreCase("N")){
				System.out.println("So what is your new selection a/b ?");
				userAns[i] = scan.nextLine();
			}
			i++;
			k++;
			
			System.out.println("Q"+k+". what is 5*2 ?");
			System.out.println("a) 10");
			System.out.println("b) 9");
			userAns[i] = scan.nextLine();
			System.out.println("Are you sure for that ans , Reply in Y/N :");
		    yOrN = scan.nextLine();
			if(yOrN.equalsIgnoreCase("N")){
				System.out.println("So what is your new selection a/b ?");
				userAns[i] = scan.nextLine();
			}
			i++;
			k++;
			
			System.out.println("Q"+k+". what is 7*2 ?");
			System.out.println("a) 14");
			System.out.println("b) 6");
			userAns[i] = scan.nextLine();
			System.out.println("Are you sure for that ans , Reply in Y/N :");
		    yOrN = scan.nextLine();
			if(yOrN.equalsIgnoreCase("N")){
				System.out.println("So what is your new selection a/b ?");
				userAns[i] = scan.nextLine();
			}
			i++;
			k++;
			
			System.out.println("Q"+k+". what is 28/7 ?");
			System.out.println("a) 4");
			System.out.println("b) 6");
			userAns[i] = scan.nextLine();
			System.out.println("Are you sure for that ans , Reply in Y/N :");
		    yOrN = scan.nextLine();
			if(yOrN.equalsIgnoreCase("N")){
				System.out.println("So what is your new selection a/b ?");
				userAns[i] = scan.nextLine();
			}
			

			for(String ans : userAns){
				if(ans.equalsIgnoreCase(correctAns[j])){
					numOfCorrectAns++;
				}
				j++;
			}
			
//			Calculate percentage:
			percentage = (numOfCorrectAns/5)*100;
			System.out.println("Your percentage is : "+percentage);
		}
		
		
	}

}
