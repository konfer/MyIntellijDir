package ThinkInJavaExample.enumTest;

public interface MyFood
{
	public enum Monday implements MyFood
	{
		One,Two,Three;

		@Override
		public void next()
		{
			// TODO Auto-generated method stub
			
		}
	}
	
	public enum Thuesday implements MyFood
	{
		Four,Five,Six;

		@Override
		public void next()
		{
			// TODO Auto-generated method stub
			
		}
	}
	
	public enum ThreeDay implements MyFood
	{
		Seven, Eight,nine;

		@Override
		public void next()
		{
			// TODO Auto-generated method stub
			
		}
	}
	
	public void next();
	
}
