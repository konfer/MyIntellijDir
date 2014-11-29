// : annotations/database/SQLInteger.java

package bookeCode.thinkingInJava.annotations.database;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger
{
	String name() default "";

	Constraints constraints() default @Constraints;
} // /:~
