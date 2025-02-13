package interview.top_50_data_structure_Algorithms_and_coding_interview_questions;

public class SwappingCharacters {
    public static void main(String[] args) {
        char[] a = {'h','e','l','l','o'};

        System.out.println(swapping(a));
    }

    private static char[] swapping(char[] a) {
        int s=0; // s for start
        int e =a.length-1; // e for end
        char temp;
        while ( s!=e ){
            temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }

        return a;
    }
}
