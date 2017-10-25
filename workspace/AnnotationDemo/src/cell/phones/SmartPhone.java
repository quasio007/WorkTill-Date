package cell.phones;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface SmartPhone {
String os1 ="Symbian1";
String os() default "Symbian";
int version1 = 1;
int version() default 2;
}
