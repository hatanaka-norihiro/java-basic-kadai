package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	//インストラクタ(初期化)
	public KatoHanako_Chapter18(){
		familyName = "加藤";
		address = "東京都中野区〇×";
		setGivenName("花子");
	}
	//名を表すフィールドの値をセットする
    public void setGivenName(String value) {
        givenName = value;
    }
    //自己紹介
	public void eachIntroduce(){
		System.out.println("趣味は読書です");
	}
}