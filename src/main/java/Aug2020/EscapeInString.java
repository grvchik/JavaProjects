package Aug2020;

public class EscapeInString {

	
	public static String getFilteredString(StringBuffer sql,boolean addEscape) {
		
		if(addEscape == true && sql.toString().endsWith(")")  ) {
			sql.deleteCharAt(sql.length()-1);
			sql.append(" ESCAPE '/' )");
		}
		return sql.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sql = new StringBuffer("SELECT * FROM IAGREQUESTROLESERCH_AUTH_VIEW as  v where v.langu='EN' AND ( UPPER(v.access) like ? or UPPER(v.ACCESS_DESCR) like ? or UPPER(v.connector) like ?)");
		String sqlSTR = getFilteredString(sql,true);
		System.out.println(sqlSTR);
		StringBuffer sql2 = new StringBuffer("SELECT * FROM IAGREQUESTROLESERCH_AUTH_VIEW as  v where v.langu='EN' AND ( UPPER(v.access) like ? or UPPER(v.ACCESS_DESCR) like ? or UPPER(v.connector) like ?)");		
		sqlSTR = getFilteredString(sql2,false);
		System.out.println(sqlSTR);
		
		
	}

}
