package day18.arraysexamples;

import java.util.Arrays;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]={10,20,10,50,40,60,10,20};
		Arrays.sort(num);//10,10,10,20,20,40,50,60
		
		int temp[]=new int[num.length];
		int j=0;
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!=num[i+1]) {
				temp[j++]=num[i];
			}
		}
		temp[j++]=num[num.length-1];
		for(int i=0;i<j;i++) {
			num[i]=temp[i];
		}
		
		System.out.println("****************************");
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}
	}
}
/*
 * int num[]={10,20,10,50,40,60,10,20};

 */
