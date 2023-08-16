package pratice;

public class MethodClass {
	//Traverse Array
	public void traverse(int A[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(A[i]+"\t");
		}
	}
	
	//insert new element to array
	public void insert(int A[],int n,int ele,int loc ) {
		for(int i=n-1;i>=loc-1;i--) {
			A[i+1]=A[i];
		}
		A[loc-1]=ele;
	}
	
	//delete an element from array
   public void delete(int A[],int n,int loc) {
	for(int i= loc-1;i>=n;i++) {
		A[i+1]=A[i];
	}
   }
	
   //search an element from array
	int search(int A[],int n,int ele) {
		int loc=0;
		for(int i=0;i<n;i++) {
			loc++;
			if(A[i]==ele) {
				break;
			     }
		    }
		return loc;
	  }
	
	//sort the array in ascending order
	public void ascending(int A[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(A[i]>A[j]) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
	}
	
	//sort the array in descending order
	public void descending(int A[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(A[i]<A[j]) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
	}

	//merge two array
	int[] merge(int A[],int n,int B[],int m) {
		int p=n+m;
		int c=0;
		int C[]=new int[p];
		for(int i=0;i<p;i++) {
			if(i<n) {
				C[i]=A[i];
			}
			else {
				C[i]=B[c];
				c++;
			}
		}
		return C;
	}
	//2D Array operation
	
	public void symmetric(int A[][],int r1,int c1) {
		int flag=0;
		int B[][]=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				B[i][j]=A[j][i];
			}
	    }
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				if(A[i][j]!=B[j][i]) {
					flag=1;
				}
			}
	    }
		if(flag==0) {
			System.out.println("Array is Symmetric .");
		}
		else {
			System.out.println("Array is not Symmetric .");
		}
	}
	
	
	public void upperTrangular(int A[][],int r1,int c1) {
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				if(i>j) {
					A[i][j]=0;
				}
			}
	    }
		
		//print
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.println(A[i][j]+"\t");
			}
			System.out.println("\t");
	    }
	}
	
	public void lowerTrangular(int A[][],int r1,int c1) {
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				if(i<j) {
					A[i][j]=0;
				}
			}
	    }
		
		//print
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println("\n");
	    }
	}
	
	//sum of row and column
	public void sumrc(int A[][],int r1,int c1) {
		int rsum=0,csum=0;
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				rsum=rsum+A[i][j];
				csum=csum+A[j][i];
			}
			System.out.println("Row "+i+" sum is:"+rsum);
			System.out.println("Column "+i+" sum is:"+csum);
			rsum=0;
			csum=0;
	    }
	}
	
	
	//sum of daigonal element
	int daigonalSum(int A[][],int r1,int c1) {
		int dsum=0;
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				if(i==j) {
					dsum=dsum+A[i][j];
				}		
			}
	   }
		return dsum;
	}
	
	//add matrix
	public void addMatrix(int A[][],int r1,int c1,int B[][]) {
		int C[][]=new int[r1][c1];
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				C[i][j]=A[i][j]+B[i][j];	
			}
	   }
		//print the sum matrix
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				System.out.print(C[i][j]+"\t");	
			}
			System.out.println("\n");
	   }
		
	}
	
	
	//subtract matrix
		public void subMatrix(int A[][],int r1,int c1,int B[][]) {
			int C[][]=new int[r1][c1];
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					C[i][j]=A[i][j]-B[i][j];	
				}
		   }
			//print the sum matrix
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					System.out.print(C[i][j]+"\t");	
				}
				System.out.println("\n");
		   }
			
		}
		
		//multiplication of matrix1
		public void mulMatrix(int A[][],int r1,int c1,int B[][],int r2,int c2) {
			int C[][]=new int[r1][c2];
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					C[i][j]=0;	
					for(int k=0;k<r1;k++) {
						C[i][j]=C[i][j]+A[i][k]*B[k][j];
					}
				}
		   }
			//print the matrix
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c2;j++) {
					System.out.print(C[i][j]+"\t");	
				}
				System.out.println("\n");
		   }
		}
		
		//multiplication of matrix1
				public void mulMatrix2(int A[][],int r1,int c1,int B[][],int r2,int c2) {
					int C[][]=new int[r2][c1];
					for(int i=0;i<r2;i++) {
						for(int j=0;j<c1;j++) {
							C[i][j]=0;	
							for(int k=0;k<r1;k++) {
								C[i][j]=C[i][j]+A[i][k]*B[k][j];
							}
						}
				   }
					//print the matrix
					for(int i=0;i<r2;i++) {
						for(int j=0;j<c1;j++) {
							System.out.print(C[i][j]+"\t");	
						}
						System.out.println("\n");
				   }
				}
}

