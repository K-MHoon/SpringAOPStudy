package kmhoon.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* kmhoon.aop.order ..*(..))") // point cut
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable { // advice
        log.info("[log] {}", joinPoint.getSignature()); // join point signature
        return joinPoint.proceed();
    }
}
