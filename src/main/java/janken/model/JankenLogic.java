package janken.model;

import java.util.HashMap;
import java.util.Map;

public class JankenLogic {

	public int yourChoice;
	public Map<Integer, String> jankenMap = new HashMap<>();
	// 初期化ブロック。コンストラクタ共通の処理が記載できる
	{
		jankenMap.put(0, "グー");
		jankenMap.put(1, "チョキ");
		jankenMap.put(2, "パー");
	}
	
	public JankenBean executeJanken(int yourChoice) {
		// PCのじゃんけんの手
		int pcChoice = (int) Math.floor(Math.random() * 3);
		// じゃんけんの実施
		String jankenResult;
		if (yourChoice == pcChoice) {
			jankenResult = "あいこです。";
		} else if (yourChoice == 0 && pcChoice == 1 || yourChoice == 1 && pcChoice == 2
				|| yourChoice == 2 && pcChoice == 0) {
			jankenResult = "あなたの勝ちです。";
		} else {
			jankenResult = "あなたの負けです。";
		}
		// じゃんけん結果をbeanに格納
		JankenBean bean = new JankenBean();
		bean.yourChoiseString = jankenMap.get(yourChoice);
		bean.pcChoiseString = jankenMap.get(pcChoice);
		bean.jankenResult = jankenResult;

		return bean;

	}

}
