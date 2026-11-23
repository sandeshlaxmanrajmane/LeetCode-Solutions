class Solution {
    public String reversePrefix(String word, char ch) {
        int i = word.indexOf(ch);

        if (i == -1)
            return word;

        char[] arr = word.toCharArray();

        int l = 0, r = i;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }
}