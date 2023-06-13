package Lesson3;

//Lorem Ipsum is simply dummy tex
public class Ex1 {
	public static void main(String[] agrs) {
		String st = "Lorem";
		StringBuilder sb = new StringBuilder(st);
		sb.append(" Ipsum").append(" is").append(" simply").append(" dummy").append(" tex");
		System.out.println(sb);
		String result = sb.toString();
		int startIndex = result.indexOf("is");
		int endIndex = startIndex + "is".length();
		sb.replace(startIndex, endIndex, "abc");
		System.out.println(sb);
	}
}
