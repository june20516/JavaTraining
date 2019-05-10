import java.util.List;

import bean.EmpInfo;
import bean.JDBCControl;

public class Test {

	public static void main(String[] args) {
		JDBCControl dbc = new JDBCControl();
		List<EmpInfo> empInfos = dbc.getEmpInfo();
		for(EmpInfo emp : empInfos) {
		System.out.println(emp);
		}
	}

}
