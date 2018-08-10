package datadrive;

import java.util.ArrayList;

import Read_Excel.Excl;

public class TestUtil {
	static Excl ex;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		ex = new Excl("C:\\Users\\Lenovo\\Desktop\\Appiumworkspace\\Tst_Jenkins\\TestData.xlsx");

		for (int rownum = 2; rownum <= ex.getRowCount("DATA"); rownum++) {

			String fstbx = ex.getCellData("DATA","TextBox1", rownum);
			String secbx = ex.getCellData("DATA","TextBox2", rownum);
			String thrdbx = ex.getCellData("DATA","TextBox3", rownum);
			String frthbx = ex.getCellData("DATA","TextBox4", rownum);
			String ffthbx = ex.getCellData("DATA","TextBox5", rownum);
			String sxthbx = ex.getCellData("DATA","TextBox6", rownum);

			
			Object ob[] = { fstbx, secbx, thrdbx, frthbx, ffthbx, sxthbx };
			myData.add(ob);

		}
		return myData;

	}

}
