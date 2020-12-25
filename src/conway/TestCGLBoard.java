package conway;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestCGLBoard 
{

	@Test
	public void boardTestOne()
	{
		
		int live[][] = {{1,2}}; 
		CGLBoard b = new CGLBoard(3,live);
	    System.out.println("======TEST ONE EXECUTED=======");
	    Assertions.assertEquals("...\n..*\n...",b.toString());
	}
}
