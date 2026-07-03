class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j= s.length()-1;
        while(i<j){
            while(i<j &&
            !((s.charAt(i)>='a' && s.charAt(i)<='z') || 
            (s.charAt(i)>='A' && s.charAt(i)<='Z')||
            ( s.charAt(i)>='0' && s.charAt(i)<='9'))){
                i++;
            }
            while(i<j &&
            !((s.charAt(j)>='a' && s.charAt(j)<='z') || 
            (s.charAt(j)>='A' && s.charAt(j)<='Z')||
            ( s.charAt(j)>='0' && s.charAt(j)<='9'))){
                j--;
            }
            char ch1= s.charAt(i);
            char ch2 = s.charAt(j);
             
            if(ch1>='A' && ch1<='Z'){
                ch1=(char)(ch1+32);
            }
            if(ch2>='A' && ch2<='Z'){
                ch2=(char)(ch2+32);
            }
            if(ch1!=ch2){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}