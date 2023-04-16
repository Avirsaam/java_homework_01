/*
 * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
 * Если общего префикса нет, вернуть пустую строку "".
 */

public class task_04 {
    public static void main(String[] args) {
        System.out.println(MaxCommonPrefix(new String [] {"abcdef", "abcde", "abc", "abcd"}));
    }

    static String MaxCommonPrefix(String[] strArray){
        String maxCommonPrefix = "";
        int indexOfShorterstWord = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() < strArray[indexOfShorterstWord].length())
                indexOfShorterstWord = i;
        }


        for (int i = 0; i < strArray[indexOfShorterstWord].length(); i++) {            
            boolean flag = true;
            for (String thisString : strArray) {
                if (thisString.charAt(i) != strArray[0].charAt(i)) flag = false;
            }
            if (flag) maxCommonPrefix += strArray[0].charAt(i);
            else break;
        }
        
        return maxCommonPrefix;
    }
}
