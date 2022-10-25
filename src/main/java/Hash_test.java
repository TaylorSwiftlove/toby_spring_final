public class Hash_test {
    public int hash(String key) {
        int asciiSum = 0;
        // string을 char로 하나하나 때어 더함
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        // 해시값 생성
        return asciiSum % 90;
    }

    public static void main(String[] args) {
            Hash_test hf = new Hash_test();
            System.out.println(hf.hash("minji"));   // 85
    }
}

