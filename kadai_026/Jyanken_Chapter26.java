package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {

	//自分のじゃんけんの手を入力する
	public	String getMyChoice() {
        
		//Scannerクラスのオブジェクトを作成
        Scanner scanner = new Scanner(System.in);
        
        //画面にメッセージを表示する
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        
        while (true) {
        	//入力された値を取得する
            String choice = scanner.next();

            //正しい値が入力されたかチェックする
            if (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
            	//不正の値のため、メッセージを表示し、再入力を促す
                System.out.println("正しい手を入力してください");
                
                continue;
            } else {
            	//Scannerクラスのオブジェクトをクローズする
                scanner.close();

                //入力した値を呼び出し元に返す
                return choice;
            }
        }
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public	String getRandom() {
		
		Random random = new Random();
		String[] hands = { "r", "s", "p" };
		int num = random.nextInt(3);
		return hands[num];
	}
	
	//じゃんけんを行う
	public	void playGame() {
		
		//Mapクラスを宣言する
		HashMap<String, String> jankenMap = new HashMap<String, String>();

		//じゃんけんの情報を登録する
		jankenMap.put("r", "グー");
        jankenMap.put("s", "チョキ");
        jankenMap.put("p", "パー");

        String myChoice = getMyChoice();		//自分が入力した値を取得する
        String computerChoice = getRandom();	//コンピュータが算出した値を取得する

        System.out.println("自分の手は " + jankenMap.get(myChoice) + 
        		           ", 対戦相手の手は " + jankenMap.get(computerChoice));

        //じゃんけんの判定を行う
        if (myChoice.equals(computerChoice)) {
            System.out.println("あいこです。");
        } else if ((myChoice.equals("r") && computerChoice.equals("s")) ||
                    (myChoice.equals("s") && computerChoice.equals("p")) ||
                    (myChoice.equals("p") && computerChoice.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
	}
}
