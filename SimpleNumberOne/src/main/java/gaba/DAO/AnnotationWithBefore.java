package gaba.DAO;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;




@Aspect
@Component
public class AnnotationWithBefore {
Logger logger= Logger.getAnonymousLogger();

//UNDEFINED ORDERS (MAKE ANOTHER CLASS WITH ORDER ANNOTATION @ORDER(?) TO MAKE IT HOW U WANT IT THO)

@Pointcut("execution(public String employee(..))")
private void scitani() {
}
@Before("scitani()")
public void relocation(JoinPoint thePoint) {
MethodSignature MS = (MethodSignature) thePoint.getSignature();
Object[] args= thePoint.getArgs();
for(Object tempArgs: args) {
System.out.println(tempArgs);
}
System.out.println(getClass()+"\n"+ MS);
 }

  }
