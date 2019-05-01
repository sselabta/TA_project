import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.*;
import java.util.*;

@RunWith (Parameterized.class)
public class DataDrivenMinTest
{
   public List list;
   public Object minElement;

   public DataDrivenMinTest (List list, Object minElement)
   {
      this.list = list; this.minElement = minElement;
   }



  @Parameters
  public static Collection<Object[]> parameters()
  {
     return Arrays.asList (new Object [][] {
      {new ArrayList (Arrays.asList (1,2)), 1},
      {new ArrayList (Arrays.asList ("cat","bat","hat")), "bat"}
     });
  }


  @Test
  public void happyPathTest()
  {
     assertTrue ("Happy Path Min Test", minElement.equals (Min.min (list)));
  }
}