package Main;

import java.util.*;

import Searching.Searching;
import Sorting.Sorting;

public class Main {
	
	public static void main(String[] args) {
		int no_of_companies;
		int opt;
		boolean stk_cmp[];
		double arr[] = null;
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		Sorting Sr_object = new Sorting();
		Searching src = new Searching();
		
		System.out.println("Enter the number of Companies");
		
		no_of_companies = obj.nextInt();
		
		arr = new double[no_of_companies];
		stk_cmp = new boolean[no_of_companies];
		
		
		for(int i = 0; i < no_of_companies; i++) {
			int j=i+1;
			System.out.println("Enter the current stock price of the Company - "+j);
			arr[i]= obj.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday");
			stk_cmp[i] = obj.nextBoolean(); 
		}
		
		
		/*for (int i = 0; i < no_of_companies; i++) {
			System.out.println("Value at Entered is {"+arr[i]+","+ stk_cmp[i]+"}");
		}*/
		
		do {
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. press 0 to exit");

		
		
		opt = obj.nextInt();
		if(opt==1) {
			int type= 1;//Ascending Order
			Sr_object.Sort(arr, 0, arr.length-1,type);
			System.out.println("Ascending Order--"+Arrays.toString(arr));
		}else if(opt==2) {
			int type= 2;//Descending Order
			Sr_object.Sort(arr,0, arr.length-1,type);
			System.out.println("Decending Order--"+Arrays.toString(arr));
		}else if(opt==3) {
			int cnt = src.stockPriceRose(stk_cmp);
			System.out.println("Total no of companies whose stock price rose today : "+cnt);
		}else if(opt==4) {
			int de_cnt = src.stockdeclined(stk_cmp);
			System.out.println("Total no of companies whose stock price declined today : "+de_cnt);
		}else if(opt==5) {
			System.out.println("Enter the Key value");
			double key = obj.nextDouble();
			src.searchValue(arr,key);
		}else if(opt==6) {
			System.out.println("Exited successfully");

		}
		
		
	}
		
		while(opt!=6);
	}
}
