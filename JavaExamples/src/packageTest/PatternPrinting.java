package packageTest;

public class PatternPrinting {

	public static void main(String[] args) {
		
//		pattern1(5);
//		System.out.println();
//		pattern2(5);
//		System.out.println();
//	    pattern3(5);
//		System.out.println();
//		pattern4(5);
//		pattern5(5);
//		pattern6(6);
//		pattern7(5);
//		pattern8(5);
//		pattern9(5);
//		pattern10(5);
		pattern11(5);
	}
		
		/* * * * * * 
		   * * * * * 
		   * * * * * 
		   * * * * * 
		   * * * * *  */
		
		static void pattern1(int n) {
			
			for(int row=1; row<=n; row++) {
				for(int col=1; col<=n; col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		
		
		}
		
		/* *
		   * *
		   * * *
		   * * * *
		   * * * * *  */
		
		static void pattern2(int n) {
			
			for(int row=1; row<=n; row++) {
				for(int col=1; col<=row; col++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
		
		/*  * * * * *  
		    * * * *
		    * * *
		    * *
		    *      */
		
		static void pattern3(int n) {
			
			for(int row=1; row<=n; row++) {
				for(int col=n; col>=row; col--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
		
       /* 1
        * 1 2
        * 1 2 3
        * 1 2 3 4
        * 1 2 3 4 5
        */
		
		
		static void pattern4(int n) {
			
			for(int row=1; row<=n; row++) {
				for(int col=1; col<=row; col++) {
					
					System.out.print(col+ " ");
				}
				System.out.println();
			}
			
		}
		
		 /* 
	        5 4 3 2 1 
            5 4 3 2 
            5 4 3 
            5 4 
            5 
	        */
			
			
			static void pattern5(int n) {
				
				for(int row=1; row<=n; row++) {
					for(int col=n; col>=row; col--) {
						
						System.out.print(col+ " ");
					}
					System.out.println();
				}
				
			}
			

			/* *
			   * *
			   * * *
			   * * * *
			   * * * * *  
			   * * * *
			   * * *
			   * *
			   * 
			 */
			
			static void pattern6(int n) {
				
				for(int row=1; row<=n-1; row++) {
					for(int col=1; col<=row; col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				for(int row=n-1; row>=0; row--) {
					for(int col=1; col<=row-1; col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			
			/*        *
			        * *
			      * * *
			    * * * *
			  * * * * *  */
			
			
			static void pattern7(int n) {
				for(int row=1; row<=n;row++) {
					//to print spaces
					for(int space=2*(n-row);space>=0; space--) {
						System.out.print(" ");
					}
					for(int col=1; col<=row;col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			
			/*       * 
                    * * 
                   * * * 
                  * * * * 
                 * * * * * 
			 */
			
			static void pattern8(int n) {
				for(int row=1; row<=n; row++) {
					for(int space=n; space>row; space--) {
						System.out.print(" ");
					}
					for(int col=1; col<=row; col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			
			
			/*     * * * * * 
                    * * * * 
                     * * * 
                      * * 
                       * 
			 */
			
			static void pattern9(int n) {
				for(int row=n; row>=0; row--) {
					for(int space=n; space>row; space--) {
						System.out.print(" ");
					}
					for(int col=1; col<=row; col++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			
			/* 1
			   2 3
			   4 5 6 
			   7 8 9 10
			   11 12 13 14 15
			 */
			
			static void pattern10(int n) {
				
				int k = 1;
				
				for(int row=1; row<=n; row++) {
					for(int col=1; col<row+1; col++) {
						System.out.print(k++ + " ");
					}
					System.out.println();
				}
			}
			
			/*  A
			    A B 
			    A B C
			    A B C D
			    A B C D E
			 */
			
			static void pattern11(int n) {
				int alphabet = 64;
				for(int row=1; row<=n; row++) {
					for(int col=1; col<=row; col++) {
						System.out.print((char)(alphabet+col) + " ");
					}
					System.out.println();
					
				}
			}

}
