package xor;

public class Perceptron {
	int[] vsigmoid(int[] x1, int[] x2, int[] w, int b)
	{
		int tf[] = new int[4];
		
		// weight와 bias 선형합 계산
		for(int i=0; i<(x1.length); i++) {
			int s = x1[i]*w[0]+x2[i]*w[1]+b;
			tf[i] = binaryclassi(s);
		}

		// 0보다 크면 1, 0보다 작으면 0을 리턴
		return tf;

	}
	
	int binaryclassi(int s)
	{
		int tf=0;
		if (s>0) { tf = 1; }
		return tf;
	}
	
	// 매개변수를 벡터로 받지 않는 버전
	/*
	int sigmoid(int x1, int x2, int w1, int w2, int b)
	{
		// weight와 bias 선형합 계산
		int s = x1*w1+x2*w2+b;
		int tf = binaryclassi(s);
		
		// 0보다 크면 1, 0보다 작으면 0을 리턴
		return tf;

	}
	*/
}
