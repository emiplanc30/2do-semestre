public abstract class Persona
{
			
		private String name;
		private boolean hasGlasses, isMale, isFemale, hasSuperpower;
		
		public String getName()
		{
			return name;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public boolean getHasGlasses()
		{
			return hasGlasses;
		}
		public void setHasGlasses(boolean hasGlasses)
		{
			this.hasGlasses = hasGlasses;
		}
		
		public boolean getIsMale()
		{
			return isMale;
		}
		public void setIsMale(boolean isMale)
		{
			this.isMale = isMale;
		}
		
		public boolean getIsFemale()
		{
			return isFemale;
		}
		public void setIsFemale(boolean isFemale)
		{
			this.isFemale = isFemale;
		}
		
		public boolean getHasSuperpower()
		{
			return hasSuperpower;
		}
		public void setHasSuperpower(boolean hasSuperpower)
		{
			this.hasSuperpower = hasSuperpower;
		}
		
		public abstract void breaths();
	}
