package ExcelParamerter;

public class ReadExcel {

	public static void main(String[] args) {
	
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 09th Jan 2023\\Data_Paramterization\\DATA\\TESTSUITE.xlsx");
		
	String value=	xls.getCellData("GMAIL", "STATUS", 7);
	
	
	//System.out.println(value);
	int rowCount=xls.getRowCount("GMAIL");
	
	System.out.println(rowCount);
	
	
	for(int i=1; i<=rowCount;i++) {
		String C1=	xls.getCellData("GMAIL", "TCID", i);
		String C2=	xls.getCellData("GMAIL", "TESTCASE", i);
		String C3=	xls.getCellData("GMAIL", "STATUS", i);
		
		System.out.println(C1+" | "+C2+" | "+C3);
		
	}
	
	
	
	

	}

}
