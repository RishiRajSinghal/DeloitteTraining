package Test_1;


	public class Addition extends Arithmetic {
		
		

		public Addition(int num1, int num2,int num3) {
			super(num1, num2, num3); /* calls super class ARITHMETIC */

		}

		@Override
		void calculate() {
			/* calculating the sum of two numbers */
			num3=num1+num2;
			
		}

	}

