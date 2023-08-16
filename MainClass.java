package pratice;

import java.util.Scanner;

public class MainClass {
	
	public static void mainMenu() {
		System.out.println("Welcome to switchbased program");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("------------------------------------------------------Select operation:---------------------------------------------------");
		System.out.println("1.One Dimentional Array."
				                             +"\n 2. Two Dimenetional Array"
				 							+"\n 3.Exit");
	}

	public static void menu1()
	{
		System.out.println("---------------------------------------------------Which operation you want to perform  :---------------------------------------------------");
		System.out.println("1. Traverse A."
				+ "\n 2. Traverse B."
				+ "\n 3. Insert a new element in A."
				+ "\n 4. Insert a new element in B."
				+ "\n5. Delete an element from A."
				+ "\n6. Delete an element from B."
				+ "\n7. Search an element in A."
				+ "\n8. Search an element in B."
				+ "\n9. Sort A."
				+ "\n10. Sort B ."
				+ "\n11. Merge A and B to form a new array C"
				+"\n12.Exit.");
	}
	
	public static void menu2()
	{
		System.out.println("---------------------------------------------------Which operation you want to perform  :---------------------------------------------------");
		System.out.println("1.  Check whether it is symmetric or not ."
				+ "\n 2. Convert matrix A to upper trangular or lower trangular matrix."
				+ "\n 3. Convert matrix B to upper trangular or lower trangular matrix."
				+ "\n 4. Finds the sum of each row and sum of each column of a matrix A."
				+ "\n5. Finds the sum of each row and sum of each column of a matrix B."
				+ "\n6. Finds the sum of diagonal elements of a square matrix A."
				+ "\n7. Finds the sum of diagonal elements of a square matrix B."
				+ "\n8.A+B."
				+ "\n9. A-B."
				+ "\n10. A*B."
				+ "\n11. B*A"
				+"\n12.Exit.");
	}
	
	public static void main(String[] args) {
		
		//create the object of MethodClass
		MethodClass mc=new MethodClass();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		int n,m,ele,loc,pos,ch,c;
		int choice1,choice2;
		Scanner sc=new Scanner(System.in);
		//declaration of two array
		int arr1[]=new int[100];
		int arr2[]=new int[100];
		
		//call the mainMenu method
		mainMenu();
		System.out.println("Enter operation no  :");
		choice1=sc.nextInt();
		System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		
		if(choice1==1) 
		{
			System.out.println("---------------------------------------You Enter into 1D Array----------------------------------------------------------");
			System.out.println("Enter the length of Array1  :");
			n=sc.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter the length of Array2  :");
			m=sc.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter "+n+" element in Array1  :");
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter "+m+" element in Array2  :");
			for(int i=0;i<m;i++) {
				arr2[i]=sc.nextInt();
			}
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
		
			do {
				menu1();
				System.out.println("Enter your choice");
				choice2=sc.nextInt();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				
				switch(choice2) {
				case 1:
					System.out.println("Elements of Array1  :");
					mc.traverse(arr1, n);
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
					
				case 2:
					System.out.println("Elements of Array2  :");
					mc.traverse(arr2, m);
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
					
				case 3:
					System.out.println("Enter element to insert:");
					ele=sc.nextInt();
					System.out.println("In which position you want to insert the element:");
				     loc=sc.nextInt();
					if(loc<=n) {
						mc.insert(arr1, n, ele, loc);
						System.out.println("Element is inserted at location  "+loc);
						System.out.println("New Array is:");
						mc.traverse(arr1, n+1);
					}
					else {
						System.out.println("Enter location is not present in Array A.");
					}
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
					
				case 4:
					System.out.println("Enter element to insert:");
					ele=sc.nextInt();
					System.out.println("In which position you want to insert the element:");
					loc=sc.nextInt();
					if(loc<=n) {
						mc.insert(arr2, m, ele, loc);
						System.out.println("Element is inserted at location  "+loc);
						System.out.println("New Array is:");
						mc.traverse(arr2, m+1);
					}
					else {
						System.out.println("Enter location is not present in Array B.");
					}
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
				case 5:

					System.out.println("Enter position to Delete the element:");
					loc=sc.nextInt();
					if(loc<=n) {
						mc.delete(arr1, n, loc);
						System.out.println("Element is Deleted at location"+loc);
						System.out.println("New Array is:");
						mc.traverse(arr1, n-1);
					}
					else {
						System.out.println("Enter location is not present in Array A.");
					}
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
				case 6:

					System.out.println("Enter position to Delete the element:");
					loc=sc.nextInt();
					if(loc<=n) {
						mc.delete(arr2, m, loc);
						System.out.println("Element is Deleted at location"+loc);
						System.out.println("New Array is:");
						mc.traverse(arr2, m-1);
					}
					else {
						System.out.println("Enter location is not present in Array B.");
					}
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
				case 7:
					System.out.println("Enter element to search in Array A:");
					ele=sc.nextInt();
					pos=mc.search(arr1, n, ele);
					System.out.println("Element present at location "+pos);
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					break;
					
			case 8:
				System.out.println("Enter element to search in Array B:");
				ele=sc.nextInt();
				pos=mc.search(arr2, m, ele);
				System.out.println("Element present at location "+pos);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				break;
			case 9:
				System.out.println("In which order you want to arrange the Array A in Ascending or Descending order.");
				System.out.println("Press 1 for ascending order.");
				System.out.println("Press 2 for Descending order.");
				ch=sc.nextInt();
				if(ch==1) {
					System.out.println("Array in Ascending order:");
					mc.ascending(arr1, n);
					mc.traverse(arr1, n);
				}
				else if(ch==2) {
					System.out.println("Array in Descending order:");
					mc.descending(arr1, n);
					mc.traverse(arr1, n);
				}
				else {
					System.out.println("Please enter in between 1 and 2.");
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				break;
				
			case 10:
				System.out.println("In which order you want to arrange the Array B in Ascending or Descending order.");
				System.out.println("Press 1 for ascending order.");
				System.out.println("Press 2 for Descending order.");
				ch=sc.nextInt();
				if(ch==1) {
					System.out.println("Array in Ascending order:");
					mc.ascending(arr2, n);
					mc.traverse(arr2, n);
				}
				else if(ch==2) {
					System.out.println("Array in Descending order:");
					mc.descending(arr2, n);
					mc.traverse(arr2, n);
				}
				else {
					System.out.println("Please enter in between 1 and 2.");
				}
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				break;
				
			case 11:
				System.out.println("New Array is:");
				int arr3[]=new int[100];
				arr3=mc.merge(arr1, n, arr2, m);
				mc.traverse(arr3, n+m);
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				break;
				
			case 12:
				System.out.println("-----------------------------------Thank you For using our menubased program----------------------------------");
				System.exit(0);
			   }		
			}while(true);

		}
		else if(choice1==2)
		{
			System.out.println("---------------------------------------You Enter into 2D Array----------------------------------------------------------");
			int row1,col1,row2,col2;
			int i,j;
			System.out.println("Enter row size of Array A  :");
			row1=sc.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Enter column size of Array A  :");
			col1=sc.nextInt();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			//declaration of Array a
			int Arr1[][]=new int [100][100];
			System.out.println("Enter element of Array A  :");
			for(i=0;i<row1;i++) {
				for(j=0;j<col1;j++) {
					Arr1[i][j]=sc.nextInt();
				}
			}
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
			
				System.out.println("Enter row size of Array B  :");
				row2=sc.nextInt();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				System.out.println("Enter column size of Array B  :");
				col2=sc.nextInt();
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				//declaration of Array a
				int Arr2[][]=new int [100][100];
				System.out.println("Enter element of Array A  :");
				for(i=0;i<row2;i++) {
					for(j=0;j<col2;j++) {
						Arr2[i][j]=sc.nextInt();
					}
			}
				System.out.println("------------------------------------------------------------------------------------------------------------------------------");
				do {
					menu2();
					System.out.println("Enter your choice");
					choice2=sc.nextInt();
					System.out.println("------------------------------------------------------------------------------------------------------------------------------");
					
					switch(choice2) {
					case 1:
						System.out.println("In between Array A and Array B Which Array you want to check symmetric  :");
						System.out.println("press 1 for Array A and press 2 for Array B  :");
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						c=sc.nextInt();
						if(c==1) {
							mc.symmetric(Arr1,row1,col1);
						}
						else if(c==2) {
							mc.symmetric(Arr2,row2,col2);
						}
						else {
							System.out.println("Enter valid choice  .");
						}
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						break;
						
					case 2:
						System.out.println("press 1 for Upper trangular matrix .");
						System.out.println("press 2 for lower trangular matrix .");
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						c=sc.nextInt();
						if(c==1) {
							mc.upperTrangular(Arr1,row1,col1);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else if(c==2) {
							mc.lowerTrangular(Arr2,row2,col2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Enter valid choice  .");
						}
						break;
						
					case 3:
						System.out.println("press 1 for Upper trangular matrix .");
						System.out.println("press 2 for lower trangular matrix .");
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						c=sc.nextInt();
						if(c==1) {
							mc.upperTrangular(Arr2,row2,col2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else if(c==2) {
							mc.lowerTrangular(Arr2,row2,col2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Enter valid choice  .");
						}
						break;
						
					case 4:
						mc.sumrc(Arr1, row1, col1);
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						break;
					case 5:
						mc.sumrc(Arr2, row2, col2);
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						break;
					case 6:
						int sum1=mc.daigonalSum(Arr1, row1, col1);
						System.out.println("Sum of daigonal element of Array A is :"+sum1);
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						break;
					case 7:
						int sum2=mc.daigonalSum(Arr1, row1, col1);
						System.out.println("Sum of daigonal element of Array A is :"+sum2);
						System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						break;
					case 8:
						System.out.println("A+B  :");
						if((row1==row2) && (col1==col2)) {
							mc.addMatrix(Arr1,row1, col1,Arr2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Both matrix are not equal.");
						}
						break;
					case 9:
						System.out.println("A-B  :");
						if((row1==row2) && (col1==col2)) {
							mc.subMatrix(Arr1,row1, col1,Arr2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Both matrix are not equal.");
						}
						break;
						
					case 10:
						System.out.println("Multiplication of matrix is  :");
						if(col1==row2) {
							mc.mulMatrix(Arr1,row1, col1,Arr2,row2,col2);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Both matrix are not equal.");
						}
						break;
						
					case 11:
						System.out.println("Multiplication of matrix is  :");
						if(col2==row1) {
							mc.mulMatrix(Arr2,row2,col2,Arr1,row1, col1);
							System.out.println("------------------------------------------------------------------------------------------------------------------------------");
						}
						else {
							System.out.println("Both matrix are not equal.");
						}
						break;
					
				case 12:
					System.out.println("-----------------------------------Thank you For using our menubased program----------------------------------");
					System.exit(0);
				   }		
				}while(true);

		
		}
		else if(choice1==3) {
			System.out.println("*************************************End of program*********************************************");
			System.exit(0);
		}
		
				

	}

	}
