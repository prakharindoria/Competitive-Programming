class Solution {
    public int reverse(int x) {
        boolean flag=false;int res;
        if(x<0)
        {flag =true;x=-x;}
        String r=""+x;
        int len=r.length();
        String p="";
        for(int i=len-1;i>=0;i--)
        {
    p=p+(char)r.charAt(i);
        
    }
        
        if(flag==true)p="-"+p;
        res=Integer.parseInt(p);
        return res;
    }
}
