package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlagFactory {
	
	 private static final Map<Nationality, Flag> FLAGS = new HashMap<Nationality, Flag>();
	
	 static {
		 FLAGS.put(Nationality.DUTCH, new dutchFlag());
		 FLAGS.put(Nationality.DUTCH, new germanFlag());
//       FLAGS.put(Nationality.GERMAN, new germanFlag());
//       FLAGS.put(Nationality.BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));         
//       FLAGS.put(Nationality.FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
//       FLAGS.put(Nationality.ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
//       FLAGS.put(Nationality.ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED));
//       FLAGS.put(Nationality.IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE));
//       FLAGS.put(Nationality.HUNGARIAN,  Arrays.asList(Color.RED, Color.WHITE, Color.GREEN));
//       FLAGS.put(Nationality.BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED));  
//       FLAGS.put(Nationality.RUSSIA,  Arrays.asList(Color.WHITE, Color.BLUE, Color.RED));
    }
	 
	public interface Flag{
		List<Color> getColor();
	}
	
	public static class dutchFlag implements Flag{
		@Override
		public List<Color> getColor() {
			return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
		}
	}
	
	public static class germanFlag implements Flag{
		@Override
		public List<Color> getColor() {
			return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
		}
	}
	
	public class defaultFlag implements Flag {
		@Override
		public List<Color> getColor() {
			return Arrays.asList(Color.GRAY);
		}
	}
    // tag,,getFlag[]
	
	
    public List<Color> getFlagColors(Nationality nationality) {	
        Flag result = FLAGS.get(nationality);
        result = result !=null ? result : new defaultFlag();
        
        return result.getColor();
    }
    // end,,getFlag[]

}