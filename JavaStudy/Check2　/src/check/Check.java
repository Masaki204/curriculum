package check;
import constants.Constants;


public class Check {

		private static String firstName = "大村";
		private static String lastName = "将貴";


		public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			System.out.println("printNameメソッド → " + printName(firstName,lastName));

			Pet inu = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
			inu.introduce();

			RobotPet roboinu = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
			roboinu.introduce();


		}
		private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
}
