public class Recursion_Remove_duplicates {
    static void removing_duplicate_from_string(String str,int idx,StringBuilder newStr,boolean map[]) {
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char curr_char = str.charAt(idx);
        if (map[curr_char-'a'] == true){
           //duplicate
            removing_duplicate_from_string(str,idx+1,newStr,map);
        }else {
            map[curr_char-'a'] = true;
            removing_duplicate_from_string(str,idx+1,newStr.append(curr_char),map);
        }
    }
    static void main(String[] args) {
        String str = "apnacollege";
   removing_duplicate_from_string(str,0,new StringBuilder(""),new boolean[26]);
    }

}
