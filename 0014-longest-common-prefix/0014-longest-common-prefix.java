class Solution{
    public String longestCommonPrefix(String[] st){
        String prefix ="";
        for(int i=0;i<st[0].length();i++){
            char ch = st[0].charAt(i);
            for(int j=1;j<st.length;j++){
                if(i==st[j].length()|| st[j].charAt(i)!=ch){
                    return prefix;
                }
            }
            prefix = prefix +ch;
        }
        return prefix;
    }
}