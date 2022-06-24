public class frequncyofchar {
	public static void main(String[] args) {
		String str = "get ready for semester examination";
		char ch = 'e';
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				++frequency;}}
		System.out.println("Frequency of " + ch + " = " + frequency);
  }}
