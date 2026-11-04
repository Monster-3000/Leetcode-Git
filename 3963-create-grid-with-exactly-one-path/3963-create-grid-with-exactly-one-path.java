class Solution {
    public String[] createGrid(int m, int n) {
        String[] arr = new String[m];
        for(int i=0;i<m;i++){
            if(i!=0){
                String s="";
                for(int j=0;j<n-1;j++){
                    s += "#";
                }
                s+=".";
                arr[i]=s;
            }
            else{
                String k = "";
                for(int j=0;j<n;j++){
                    k += ".";
                }
                arr[i]=k;
            }
        }
        return arr;
    }
}