package sparse;

public class SparseMatrix {

		    public static void main(String[]args)
		    {
		    	int sparseMatrix [][]=new int[4][5];// Assume 4x5 sparse matrix
		         sparseMatrix[][] =
		        {
		            {0 , 0 , 3 , 0 , 4 },
		            {0 , 0 , 5 , 7 , 0 },
		            {0 , 0 , 0 , 0 , 0 },
		            {0 , 2 , 6 , 0 , 0 }
		        };
		     
		        int size = 0;
		        for (int i = 0; i < 4; i++)
		            for (int j = 0; j < 5; j++)
		                if (sparseMatrix[i][j] != 0)
		                    size++;
		     
		        // number of columns in compactMatrix (size) must be
		        // equal to number of non - zero elements in
		        // sparseMatrix
		        int compactMatrix[][]=new int[3][size];
		     
		        // Making of new matrix
		        int k = 0;
		        for (int i = 0; i < 4; i++)
		            for (int j = 0; j < 5; j++)
		                if (sparseMatrix[i][j] != 0)
		                {
		                    compactMatrix[0][k] = i;
		                    compactMatrix[1][k] = j;
		                    compactMatrix[2][k] = sparseMatrix[i][j];
		                    k++;
		                }
		     
		        for (int i=0; i<3; i++)
		        {
		            for (int j=0; j<size; j++)
		             System.out.print(compactMatrix[i][j]);
		     
		            System.out.println();
		        }
		    }
	
	
	
}
