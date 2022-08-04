
public class TestRectangle {

	public static void main(String[] args) {
		
		int i;
		Rectangle[] obj = new Rectangle[5];
		
		obj[0]=new Rectangle(10,11);
		obj[1]=new Rectangle(12,13);
		obj[2]=new Rectangle(14,15);
		obj[3]=new Rectangle(16,17);
		obj[4]=new Rectangle(18,19);
		
		for(i=0;i<5;i++)
		{
		obj[i].InfoRectangle();
		obj[i].CalcArea();
		
		System.out.println();
		}

	}

}
