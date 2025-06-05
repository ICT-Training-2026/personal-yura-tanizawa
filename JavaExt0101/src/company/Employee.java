package company;

/**
 * 社員クラス
 * @author M.Takahashi
 */
public class Employee {
	/******** フィールド ******************************************/
	/**
	 * 社員番号
	 */
	private int id;
	
	/**
	 * 名前
	 */
	private String name;

	/******** コンストラクタ **************************************/
	/**
	 * コンストラクタ（フィールド初期化）
	 * @param id フィールド id への設定値
	 * @param name フィールド name への設定値
	 */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/******** メソッド ********************************************/
	/*--------------------通常メソッド--------------------*/
	/**
	 * 情報表示
	 */
	public void displayInfo() {
		System.out.println("ＩＤ：" + id);
		System.out.println("名前：" + name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
