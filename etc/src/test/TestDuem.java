package test;

public class TestDuem {
    public static boolean duemRuleApplied;
    
	public static void main(String[] args) {
		String test = "��";
//		char ga = 44032;
//		String �� = String.valueOf(ga);
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
        duemRuleApplied = false;                       // �̰� ����Ʈ��
        int uniCode = last.hashCode();                 // last�� �����ڵ带 ����
        
        // �� ���� �� ���� �ٲ�� ����
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='�a') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }

        // �� ���� �� ���� �ٲ�� ����
        if('��'<=uniCode && uniCode<='�l') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='�T') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }

        // �� ���� �� ���� �ٲ�� ����
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='�O') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='��') { uniCode += ('��'-'��'); }
        if('��'<=uniCode && uniCode<='�k') { uniCode += ('��'-'��'); }
        
/*        uniCode = ��to��(uniCode, '��','��');
        uniCode = ��to��(uniCode, '��','��');
        uniCode = ��to��(uniCode, '��','�a');
        uniCode = ��to��(uniCode, '��','��');*/
        System.out.println(uniCode);
        System.out.println(last.hashCode());
        
        if(uniCode!=last.hashCode()) { duemRuleApplied = true; }    // �����ڵ尪�� �ٲ���ٸ� ������Ģ�� ����Ȱ�
        String lastDuem = String.valueOf((char) uniCode);           // char to Integer ��
        return lastDuem;
    }
    
    private static int ��to��(int uniCode, char rangeStart, char rangeEnd) {
        if(rangeStart<=uniCode && uniCode<=rangeEnd) {
            uniCode += ('��'-'��');
        }
        return uniCode;
    }
}
