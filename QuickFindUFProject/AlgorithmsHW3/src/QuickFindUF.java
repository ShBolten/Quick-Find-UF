public class QuickFindUF{
    
    private int[] id;
    int count; // number of connected compoents
    
    public QuickFindUF(int N)
    {
      id = new int[N];
      for (int i = 0; i < N; i++)
	  id[i] = i;
      count = N;
    }

    public int getCount()
    {
	return count;
    }
    
    public int find(int i)
    {
      while (i != id[i]) i = id[i];
         return i;
    }


    public boolean connected(int p, int q)
    {
      return find(p) == find(q);
    }

    
    public void union(int p, int q)
    {
	if (! connected(p,q))
	    {
               int i = find(p);
               int j = find(q);
               id[i] = j;
	       count--;
	    }
    }
}
