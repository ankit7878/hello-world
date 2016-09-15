import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        int rows, cols;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))  ;
        rows = Integer.parseInt(br.readLine());
        cols = Integer.parseInt(br.readLine()) ;
        char[][] grid  = new char[rows][cols];
        for(int i=0;i<rows;i++){
            grid[i] = br.readLine().toCharArray();
        }
        int no = Integer.parseInt(br.readLine());
        String [] strings = new String[no];
        for(int i=0;i<no;i++){
            strings[i] = br.readLine();
        }
        for(int c=0;c<no;c++){
            System.out.println(findWordInAGrid(grid, rows, cols, strings[c]));
        }
    }
    
    //you may add more methods here
	public int check(int r,int c,int nor,int noc,char [][] grid,String s){

		int a=r-1;
		int b=c-1;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(s.chatAt()== ){
					
				}				

				
				b++;			
			}		
			a++;	
		}

		return 0;
	}

    
    public static Boolean findWordInAGrid(char [][] grid, int rows, int cols, String strings) {
        //add code to this function to solve the problem
        //don't write code in this editor
        //your code will not be saved across submissions

	for(int i=0;i<Strings.length();i++){
				
		for(int r=0;int r<rows;r++){
			for(int c;c<cols;c++)
			{
				if(grid[r][c]==strings.chatAt(i) ){
					if(check(r,c,rows,cols,grid,s)==0)
					{
						return true;
					}
				}

			} 
		}			
		
	}

        return false;
    }
}
