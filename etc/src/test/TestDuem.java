package test;

public class TestDuem {
    public static boolean duemRuleApplied;
    
	public static void main(String[] args) {
		String test = "림";
//		char ga = 44032;
//		String 가 = String.valueOf(ga);
		char eng1 = 'a';
		int test1 = (int) eng1;
		char eng2 = 'A';
		int test2 = (int) eng2;
		System.out.println("a : " + test1);
		System.out.println("A : " + test2);
		System.out.println('A' - 'a');
		System.out.println('Z' - 'a');
		
		
        if(duemRuleApplied)
        { test = test + "(" + getLastDuem(test) + ")"; }
        System.out.println(test);
	}
	
    public static String getLastDuem(String last) {
        duemRuleApplied = false;                       // 이게 디폴트값
        int uniCode = last.hashCode();                 // last의 유니코드를 받음
        
        // ㄴ 에서 ㅇ 으로 바뀌는 경우들
        if('녀'<=uniCode && uniCode<='녛') { uniCode += ('아'-'나'); }
        if('뇨'<=uniCode && uniCode<='눃') { uniCode += ('아'-'나'); }
        if('뉴'<=uniCode && uniCode<='늏') { uniCode += ('아'-'나'); }
        if('니'<=uniCode && uniCode<='닣') { uniCode += ('아'-'나'); }

        // ㄹ 에서 ㅇ 으로 바뀌는 경우들
        if('랴'<=uniCode && uniCode<='럏') { uniCode += ('아'-'라'); }
        if('려'<=uniCode && uniCode<='렿') { uniCode += ('아'-'라'); }
        if('례'<=uniCode && uniCode<='롛') { uniCode += ('아'-'라'); }
        if('료'<=uniCode && uniCode<='룧') { uniCode += ('아'-'라'); }
        if('류'<=uniCode && uniCode<='륳') { uniCode += ('아'-'라'); }
        if('리'<=uniCode && uniCode<='맇') { uniCode += ('아'-'라'); }

        // ㄹ 에서 ㄴ 으로 바뀌는 경우들
        if('라'<=uniCode && uniCode<='랗') { uniCode += ('나'-'라'); }
        if('래'<=uniCode && uniCode<='랳') { uniCode += ('나'-'라'); }
        if('로'<=uniCode && uniCode<='롷') { uniCode += ('나'-'라'); }
        if('뢰'<=uniCode && uniCode<='룋') { uniCode += ('나'-'라'); }
        if('루'<=uniCode && uniCode<='뤃') { uniCode += ('나'-'라'); }
        if('르'<=uniCode && uniCode<='릏') { uniCode += ('나'-'라'); }
        
/*        uniCode = ㄴtoㅇ(uniCode, '녀','녛');
        uniCode = ㄴtoㅇ(uniCode, '뇨','눃');
        uniCode = ㄴtoㅇ(uniCode, '뉴','늏');
        uniCode = ㄴtoㅇ(uniCode, '니','닣');*/
        System.out.println(uniCode);
        System.out.println(last.hashCode());
        
        if(uniCode!=last.hashCode()) { duemRuleApplied = true; }    // 유니코드값이 바뀌었다면 두음법칙이 적용된것
        String lastDuem = String.valueOf((char) uniCode);           // char to Integer 모름
        return lastDuem;
    }
    
    private static int ㄴtoㅇ(int uniCode, char rangeStart, char rangeEnd) {
        if(rangeStart<=uniCode && uniCode<=rangeEnd) {
            uniCode += ('아'-'나');
        }
        return uniCode;
    }
}
