package algorithms.design_algo.two_pointers;

public class Leetcode_792_NumberOfMatchingSubsequences {

    public static void main(String[] args) {
        String s = "abcde";

        String[]  words = {"a","bb","acd","ace"} ;
        numMatchingSubseq(s,words);
    }
    public static int numMatchingSubseq(String s, String[] words) {
        for(int i =0;i<words.length;i++){
            System.out.println(words[i]);
        }
        int i =0,j=0;
        int k=0;
        int count =0;
        while (i<s.length() && j < words.length){
            if(s.charAt(i) == words[j].charAt(k)){
                count++;

            }
        }
        return 3;
    }
}
