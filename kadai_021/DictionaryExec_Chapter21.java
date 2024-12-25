package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		//調べる英単語を配列にセットする
		dictionary.addDictionary();
		
		 // 検索する単語の一覧
        String[] searchWords = { "apple", "banana", "grape", "orange" };
        
        // 繰り返し処理で検索
        dictionary.serchMultiple(searchWords);

	}

}
