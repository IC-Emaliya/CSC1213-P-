class D6Ex5
{
	public static void main(String args[])
	{
		int marks[][]={{90,02,45},{67,54,87},{76,46,89},{9,10,65}};
		
		for(int i=0;i<4;i++)
		{ 
            int maximum=marks[i][0]; 
			for(int j=0;j<3;j++)
			{
	
			   System.out.print(marks[i][j]+" ");
			   if(marks[i][j]>maximum)
				{
				  maximum=marks[i][j];
			    }
			}
			System.out.println();
			System.out.println("Maximum of the Student"+(i+1)+ " is:"+maximum);
		}
		}
	}

		