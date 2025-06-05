package driver;

import company.Employee;

/**
 * 実行用クラス
 * @author M.Takahashi
 */
public class Driver {
	/**
	 * メインメソッド
	 * @param args 未使用
	 */
	public static void main(String[] args) {
		// インスタンス化・情報表示
		Employee hayami = new Employee(1234, "速水剛留");
		
		// 社員情報表示
		System.out.println();
		hayami.displayInfo();
		
		// toString結果の表示
		System.out.println();
		String toStr = hayami.toString();
		System.out.println(toStr);
	}

}
