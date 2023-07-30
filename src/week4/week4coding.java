package week4;
import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner; 




public class week4coding {
	// 7 method
	static void hello3(String word, int n){
		String h = "";
		for (int ij=0; ij<n; ij++) {
			h=h+word;
		}
		System.out.println(h);				
	}
	
	// 8 method
	static void full_name(String firstName, String lastName) {
		System.out.println(firstName+ " " + lastName);
	}
	
	// 9 method
	static void sum100(int[] array) {
		int sm=0;
		boolean b = false;
		for (int m: array) {
			sm=sm+m;
		}
		if (sm>100) {
			b=true;
			System.out.println(b);
		}
	}
	
	
	// 10 method
	static void davg(double[] arry) {
		double dsum = 0;
		for (double d: arry) {
			dsum=dsum+d;
		}
		System.out.println(dsum/arry.length);
	}
	
	// 11 method
	static void dgrt(double[] arr1, double[] arr2) {
		double s1= 0;
		double s2=0;
		boolean g = false;
		for (double i1: arr1) {
			s1=s1+i1;
		}
		for (double i2: arr2) {
			s2=s2+i2;
		}
		if ((s1/arr1.length)>(s2/arr2.length)) {
			g=true;
			System.out.println(g);
			
		}
		
	}
	
	// 12 method
	static void willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean h = false;
		if ((isHotOutside==true)&&(moneyInPocket>10.5)) {
			h=true;
		}
		System.out.println(h);
	}
	
	// 13 method
	static void evenodd(int num) { // checks whether an integer number is even or odd
		if(num%2==0) {
			System.out.println("Even");
			}
		else {
			System.out.println("Odd");
		}
	}
	


	public static void main(String[] args) {

		// 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		//System.out.println(Arrays.toString(ages));
		int subres = ages[ages.length-1]-ages[0];
		System.out.println(subres); // 1 a
		
		// 1 b
		int[] new_ages = new int [9];
		
		
		// 1 c
		int s = 0;
		for (int a: ages) {
			s=s+a;
			
		}
		int avg = s/ages.length;
		System.out.println(avg);
		
		
		
		
		// 2
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		// 2 a
		int sum=0;
		for (String j: names) {
			sum=sum+j.length();
		}
		int aver = sum/names.length;
		System.out.println(aver);
		
		// 2 b
		String conc = "";
		for (String j: names) {
			conc = conc + j+ " ";
		}
		System.out.println(conc);
		
		
		
		
		// 3
		System.out.println(names[names.length-1]);
		
		// 4
		System.out.println(names[0]);
		
		// 5
		int[] nameLengths = new int [6];
		for (int k =0; k<names.length; k++) {
			nameLengths[k]=names[k].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
		
		// 6
		int sss = 0;
		for (int ss: nameLengths) {
			sss= sss+ss;
		}
		System.out.println(sss);
		
		
		// 7
		Scanner console = new Scanner(System.in);
		String mword = console.nextLine();
		int mn = console.nextInt();
		hello3(mword, mn);
		
		// 8
		Scanner console8 = new Scanner(System.in);
		String fnm = console8.nextLine();
		String lnm = console8.nextLine();
		full_name(fnm, lnm);
		
	
		
		
		// 9
		Scanner console9 = new Scanner(System.in);
		System.out.println("Length of the array ?");
		int sz = console9.nextInt();
		int[] arr = new int[sz];
		System.out.println("Enter array elements");
		for (int p=0; p<sz; p++) {
			arr[p]=console9.nextInt();
		}
		sum100(arr);
		
			
		// 10
		Scanner console10 = new Scanner(System.in);
		System.out.println("Length of the array ?");
		int siz = console10.nextInt();
		double[] arrr = new double[siz];
		System.out.println("Enter array elements");
		for (int q=0; q<siz; q++) {
			arrr[q]=console10.nextInt();
		}
		davg(arrr);
		
		
		// 11
		Scanner console11 = new Scanner(System.in);
		System.out.println("Length of the 1st array ?");
		int sz1 = console11.nextInt();
		double[] a1 = new double[sz1];
		System.out.println("Enter array elements");
		for (int q1=0; q1<sz1; q1++) {
			a1[q1]=console11.nextInt();
		}
		System.out.println("Length of the 2nd array ?");
		int sz2 = console11.nextInt();
		double[] a2 = new double[sz2];
		System.out.println("Enter array elements");
		for (int q2=0; q2<sz2; q2++) {
			a2[q2]=console11.nextInt();
		}
		dgrt(a1,a2);
		
		
		// 12
		Scanner console12 = new Scanner(System.in);
		System.out.println("Is hot outside ?");
		boolean iho = console12.nextBoolean();
		System.out.println("Money in pocket ?");
		double mip = console12.nextDouble();
		willBuyDrink(iho, mip);

		// 13
		Scanner console13 = new Scanner(System.in);
		System.out.println("Please enter the number");
		int nnn = console13.nextInt();
		evenodd(nnn);
	}

	
}
	

	
