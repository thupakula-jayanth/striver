class hashing
{
    public static void main(String[] args) {
      int[] a={1,2,1,2,3};
      int[] hash=new int[4] ;
      for(int i=0;i<5;i++)
      {
        hash[a[i]]+=1;
      }
      for(int k:hash)
      {
        System.out.println(k);
      }
    }
}
//comment 
