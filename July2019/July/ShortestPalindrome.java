package July;

public class ShortestPalindrome {

	public String shortestPalindrome(String s) {
		String shortestPalindrome = null;
		// Step 1 Find if string is of length 1
		if (s == null || s.equals("")) {
			return shortestPalindrome;
		}

		if (s.length() == 1 || s.length() == 2) {
			shortestPalindrome = s;
			return shortestPalindrome;
		}

		String rightTail = leftSubPalindrome(s);
		String leftHead = rightSubPalindrome(s);
		String remainingPart = null;
		String reverseRemainingPart = null;
		String middlePart = null;
		int begIndex = -1;
		int endIndex = -1;

		if (leftHead.length() == rightTail.length() && leftHead.equalsIgnoreCase(rightTail)) {
			return leftHead;
		}

		// Step 2 Find whether there is any existence of Palindrome inside this
		// string
		if (rightTail != null && leftHead != null) {
			if (rightTail.length() > leftHead.length()) {
				// case 1 leftHead is not Substring of Right Tail
				if (!rightTail.startsWith(leftHead)) {
					remainingPart = s.substring(0, (s.length() - rightTail.length()));
					reverseRemainingPart = reverseString(remainingPart);
					shortestPalindrome = remainingPart + rightTail + reverseRemainingPart;
				} else {
					begIndex = leftHead.length();
					endIndex = s.length() - rightTail.length();
					middlePart = s.substring(begIndex, endIndex);
					shortestPalindrome = rightTail + middlePart + rightTail;
				}

			}
			// this case takes care when left head is either bigger than right
			// tail or equal to right tail
			else {

				if (!rightTail.startsWith(leftHead)) {

					if (rightTail.length() == leftHead.length()) {
						remainingPart = s.substring(leftHead.length(), s.length());
						reverseRemainingPart = reverseString(remainingPart);
						shortestPalindrome = reverseRemainingPart + leftHead + remainingPart;
					} else {
						remainingPart = s.substring((s.length() + 1 - leftHead.length()));
						reverseRemainingPart = reverseString(remainingPart);
						shortestPalindrome = reverseRemainingPart + leftHead + remainingPart;

					}
				} else {
					begIndex = leftHead.length();
					endIndex = s.length() - rightTail.length();
					middlePart = s.substring(begIndex, endIndex);
					shortestPalindrome = leftHead + middlePart + leftHead;
				}
			}
		}

		// Step 3 If we found then we get the location offset of the palindrome
		// Step 4 Construct a new palindrom
		return shortestPalindrome;
	}

	private String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s.length());

		for (int j = s.length() - 1; j >= 0; j--) {
			sb.append(s.charAt(j));
		}
		return sb.toString();

	}

	private String rightSubPalindrome(String input) {
		String rightPalin = null;

		int arr[] = new int[input.length()];
		boolean matchFound = false;
		int rightLandMark = 0;
		// first start from left
		for (int i = input.length() - 1, j = 0; i >= 0; i--) {
			if (input.charAt(i) != input.charAt(j)) {
				matchFound = false;
				// move j back to the head
				j = 0;
			} else {
				arr[j] = 1;
				matchFound = true;
				if (j >= i && i == 0) {
					break;
				}
				j++;
			}
		}

		if (matchFound) {
			rightLandMark = getIndexFromArray(arr, false);
			boolean fullPalindrome = false;
			if (rightLandMark == input.length() - 1) {
				fullPalindrome = true;
				for (int k = 0; k < arr.length; k++) {
					if (arr[k] != 1) {
						fullPalindrome = false;
						break;
					}
				}
			}
			if (fullPalindrome) {
				rightPalin = input;
			} else {
				rightPalin = input.substring(0, rightLandMark);
			}

		}

		return rightPalin;
	}

	private String leftSubPalindrome(String input) {
		String leftPalin = null;
		int arr[] = new int[input.length()];
		boolean matchFound = false;
		int leftLandmark = 0;
		// first start from left
		for (int i = 0, j = input.length() - 1; i < input.length(); i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				matchFound = false;
				// move j back to the tail
				j = input.length();
			} else {
				arr[i] = 1;
				matchFound = true;
				if (i > j) {
					break;
				}
			}
		}

		if (matchFound) {
			leftLandmark = getIndexFromArray(arr, true);

			boolean fullPalindrome = false;
			if (leftLandmark == input.length() - 1) {
				fullPalindrome = true;
				for (int k = 0; k < arr.length; k++) {
					if (arr[k] != 1) {
						fullPalindrome = false;
						break;
					}
				}
			}

			if (fullPalindrome) {
				leftPalin = input;
			} else {
				leftPalin = input.substring(leftLandmark, input.length());
			}
		}
		return leftPalin;

	}

	private int getIndexFromArray(int[] arr, boolean isCheckLeft) {
		int ret = arr.length;

		// now check from last
		if (isCheckLeft) {
			for (int i = arr.length - 1; i >= 0; i--) {
				ret = i;
				if (arr[i] == 0) {
					ret = ret + 1;
					break;
				}
			}
		} else {
			for (int i = 0; i <= arr.length - 1; i++) {
				ret = i;
				if (arr[i] == 0) {
					// ret = ret+1;
					break;
				}
			}
		}

		return ret;
	}

	public String shortestPalindrome2(String s) {
		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == s.charAt(j)) {
				j += 1;
			}
		}
		if (j == s.length()) {
			return s;
		}
		String suffix = s.substring(j);
		return new StringBuffer(suffix).reverse().toString() + shortestPalindrome2(s.substring(0, j)) + suffix;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShortestPalindrome sp = new ShortestPalindrome();

		// System.out.println(sp.shortestPalindrome("aacecaaa"));
		// System.out.println(sp.shortestPalindrome("aba"));
		// System.out.println(sp.shortestPalindrome("amarata"));
		// System.out.println(sp.shortestPalindrome("ramarata"));
		// System.out.println(sp.shortestPalindrome("amarata"));
		// System.out.println(sp.leftSubPalindrome("amarata"));
		// System.out.println(sp.rightSubPalindrome("amarata"));
		// System.out.println(sp.rightSubPalindrome("varavaman"));
		System.out.println(sp.shortestPalindrome("varavaman"));
		System.out.println(sp.shortestPalindrome2("varavaman"));
		// System.out.println(sp.leftSubPalindrome("amanvarav"));
		// System.out.println(sp.leftSubPalindrome("hamarvarav"));
	}

}
