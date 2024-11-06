class Player
{
  private int id;
  private String name;
  private int runs;

  public void setId(int id)
  {
    this.id=id;
  }
  public int getId()
  {
    return id;
  }
  public void setName(String name)
  {
    this.name=name;
 
  }
  public String getName()
  {
    return name;
  } 
  public void setRuns(int runs)
  {
    this.runs=runs;
  }
  public int getRuns()
  {
    return runs;
  }
  
}

class Team
{
  
  void addPlayers(Player...p)           //p[[1,Arya,50],[2,Aditi,60],[3,shravani,88]]
                                               0               1        2
                                        // p.length=3
                                                            
  {
    for(int i=0; i<p.length; i++)
    {
      System.out.println("Id is "+p[i].getId());
      System.out.println("Name is "+p[i].getName());
      System.out.println("Runs are "+p[i].getRuns());
    }
  }
}

class Players
{
   public static void main(String x[])
   
   Player p=new Player();
   p.setId(1);
   p.setName('Arya');
   p.setRuns('50'); 

   player p1=new player();
   p1.setId(2);
   p1.setName('Aaditi');
   p1.setRuns('60');
   
   player p2=new player();
   p2.setId(3);
   p2.setName('Shravanii');
   p2.setRuns('88');


  Team t=new Team();
  t.team(p,p1,p2);
}