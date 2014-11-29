// : enumerated/EnumSets.java
// Operations on EnumSets

package bookeCode.thinkingInJava.enumerated;

import java.util.*;
import static bookeCode.thinkingInJava.enumerated.AlarmPoints.*;
import static bookeCode.thinkingInJava.net.mindview.util.Print.*;

public class EnumSets
{
	public static void main(String[] args)
	{
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class); // Empty
																		 // set
		points.add(BATHROOM);
		print(points);
		points.addAll(EnumSet.of(STAIR2, KITCHEN));
		print(points);
		points = EnumSet.allOf(AlarmPoints.class);
		print(points);
		points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));
		print(points);
		points.removeAll(EnumSet.range(OFFICE1, OFFICE4));
		print(points);
		points = EnumSet.complementOf(points);
		print(points);
	}
} /*
   * Output: [BATHROOM] [STAIR1, STAIR2, BATHROOM, KITCHEN] [LOBBY, OFFICE1,
   * OFFICE2, OFFICE3, OFFICE4, BATHROOM, UTILITY] [LOBBY, BATHROOM, UTILITY]
   * [STAIR1, STAIR2, OFFICE1, OFFICE2, OFFICE3, OFFICE4, KITCHEN]
   */// :~
