public class MatrixMultiplication{
    public static void main(String[]args){
        int [][] m1={{1,2,3},{4,5,6},{7,8,9}};
        int [][] m2={{7,8,9},{4,5,6},{1,2,3}};
        int row,col;

        int [][]res=new int[3][3];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                res[i][j]=0;
                for(int k=0;k<3;k++){
                    res[i][j]+=m1[i][k]*m2[k][j];
                }

            }
        }
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}