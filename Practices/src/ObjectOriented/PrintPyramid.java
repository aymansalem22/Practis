package ObjectOriented;
//Pyramid Printing by Using 'for' Loop
public class PrintPyramid {

	public static void main(String[] args) {
		int rows=5;
		for(int i=1;i<=rows;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print("# ");
			}
			System.out.println();
		}


	}

}

/*result
# 
# # 
# # # 
# # # # 
# # # # # 
*/