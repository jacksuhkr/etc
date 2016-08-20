package xor;

public class XOR 
{

	public static void main(String[] args)
	{
		// 파라미터 값 설정
		int weight1[] = { -1, -1 };
		int weight2[] = { 1, 1 };
		int weight3[] = { 1, 1 };
		int bias1 = 2;
		int bias2 = 0;
		int bias3 = -1;
//		int x[][] = { {0,0}, {0,1}, {1,0}, {1,1} };		// 매개변수를 array로 받지 않는 버전
		int x1[] = { 0, 0 , 1, 1 };
		int x2[] = { 0, 1 , 0, 1 };
		int y1[] = new int[4];
		int y2[] = new int[4];
		int xor[] = new int[4];
		
		// 메소드 불러올 준비
		Perceptron Binary = new Perceptron();
		
		// 뉴런들 돌리기
		y1 = Binary.vsigmoid(x1, x2, weight1, bias1);
		y2 = Binary.vsigmoid(x1, x2, weight2, bias2);
		xor = Binary.vsigmoid(y1, y2, weight3, bias3);
		
		//결과 출력
		for (int i=0; i<=3; i++)
		{
			System.out.println("y1 " + x1[i] + x2[i] + " : " + y1[i] + "	y2 " +  x1[i] + x2[i] + " : " + y2[i] + "	XOR "  +  x1[i] + x2[i] + " : " + xor[i]);
		} 
		
		// 매개변수를 array로 받지 않는 버전 
		/*
		// 결과 출력
		for (int i=0; i<=3; i++)
		{
			System.out.println("y1 " + x[i][0] + x[i][1] + " : " + y1[i] + "	y2 " +  x[i][0] + x[i][1] + " : " + y2[i] + "	XOR "  +  x[i][0] + x[i][1] + " : " + xor[i]);
		} 
		
		// 각 뉴런들 돌리기
		for (int i=0; i<=3; i++)
		{
			y1[i] = Binary.sigmoid(x[i][0], x[i][1], weight1[0], weight1[1], bias1);
			y2[i] = Binary.sigmoid(x[i][0], x[i][1], weight2[0], weight2[1], bias2);
			xor[i] = Binary.sigmoid(y1[i], y2[i], weight3[0], weight3[1], bias3);
		}
		*/
	}
}