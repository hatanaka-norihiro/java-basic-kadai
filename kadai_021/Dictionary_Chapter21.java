package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	private HashMap<String, String> dictionary = new HashMap<String, String>();
	
    public void addDictionary() {
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }
    
    public void serch(String word) {
        if (dictionary.get(word) == null) {
            System.out.println(word + "は辞書に存在しません");
        } else {
            System.out.println(word + "の意味は" + dictionary.get(word));
        }
    }

    public void serchMultiple(String[] words) {
        for (String word : words) {
            serch(word);
        }
    }

}
