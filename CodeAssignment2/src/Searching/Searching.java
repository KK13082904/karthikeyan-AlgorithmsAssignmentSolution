package Searching;

public class Searching {
	public int stockPriceRose(boolean[] stk_cmp){
		int num = stk_cmp.length; 
		int cnt = 0;
		for(int x=0; x < num; x++){
			if(stk_cmp[x]) {
				cnt=cnt+1;
			}
		}
		return cnt;
	}
	public int stockdeclined(boolean[] stk_cmp){
		int num = stk_cmp.length; 
		int cnt = 0;
		for(int x=0; x < num; x++){
			if(!stk_cmp[x]) {
				cnt=cnt+1;
			}
		}
		return cnt;
	}
	
	public void searchValue(double[] arr,double value) {
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				System.out.println("Stock of value "+value+" is present");
				status = true;
			}
		}if (status == false) {
			System.out.println("Stock not found");
		}
	}

}
