interface run{
    int power(int n,int m);
    int fact(int n);
}
class Calc implements run{
    /**
     * @param
     */
    @Override
    public int power( int n,int m ) {
        int res=1;
        for(int i=0;i<m;i++){
            res=res*n;
        }
        return res;
    }
    
    /**
     * @param n
     *
     * @return
     */
    @Override
    public int fact( int n ) {
        int res=1;
        for(int i=n;i>=1;i--)
        {
            res=res*i;
        }
        return res;
    }
}
