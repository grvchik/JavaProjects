package May2020;

public class GenerateSQL {

	
	public static void generateSQL(String query) {
		
		//('Z/_%')  ESCAPE '/'
		String sql = "SELECT * FROM IAGREQUESTROLESERCH_AUTH_VIEW WHERE LANGU = 'EN' AND UPPER(ACCESS) LIKE ? ";
		
		char[] queryArray = query.toCharArray();
		StringBuilder sd = new StringBuilder(query.length()+2);
		
		for(char ch : queryArray) {
			if(!Character.isAlphabetic(ch)&& ch=='_') {
				sd.append('/');
				sql = sql +" ESCAPE '/'";
			}			
				sd.append(ch);			
		}
		
		System.out.println(sd.toString());
		System.out.println("Query is "+sql);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateSQL("Z*");
	}

}
