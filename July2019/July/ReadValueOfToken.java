package July;

import java.util.StringTokenizer;

import sun.util.locale.StringTokenIterator;

public class ReadValueOfToken {

	public String readValueOfToken(String key) {

		String input = "{\"AccRequestId\":\"1\",  \"CreatedBy\":\"C5160272\", \"ReasonCode\":\"Code 2\", \"Requesttypeid\":\"ACTEST\",\"TaskInstanceId\":\"taskIn\",\"UpdatedBy\":\"\"}";

		String result = null;

		StringTokenizer str = new StringTokenizer(input, ",");
		String currentToken = null;
		String nextToken = null;
		while (str.hasMoreTokens()) {

			currentToken = str.nextToken();
			StringTokenizer strColon = new StringTokenizer(currentToken, ":");

			if (currentToken.contains(key)) {
				int index = 0;
				while (strColon.hasMoreTokens()) {
					nextToken = strColon.nextToken();
					if (index == 1) {
						result = nextToken;
						result = result.replace("\"", "");
						System.out.println(result);
						break;
					}
					index++;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadValueOfToken rvToken = new ReadValueOfToken();
		rvToken.readValueOfToken("AccRequestId");
	}

}
