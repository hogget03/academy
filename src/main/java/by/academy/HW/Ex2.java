package by.academy.HW;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите тип данных : ");
		String dataType = scan.nextLine();
		System.out.println("Введите значение переменной : ");
		String variable = scan.nextLine();
		scan.close();

		switch (dataType) {
		case "int":
			int intValue = Integer.parseInt(variable);
			int ost = intValue % 2;
			System.out.println(" Остаток от деление на 2 : " + ost);
			break;
		case "double":
			double doubleValue = Double.parseDouble(variable);
			double percent = doubleValue * 0.7;
			System.out.println(" 70% от числа : " + doubleValue);
			break;
		case "float":
			float floatValue = Float.parseFloat(variable);
			float stepen = floatValue * floatValue;
			System.out.println("Квадрат числа равен : " + stepen);
			break;
		case "char":
			char charValue = variable.charAt(0);
			int charCode = (int) charValue;
			System.out.println("Код символа : " + charCode);
			break;
		case "String":
			System.out.println("Hello " + variable);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}
	}
}
