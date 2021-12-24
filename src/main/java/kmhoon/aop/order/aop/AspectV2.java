package kmhoon.aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Slf4j
@Aspect
public class AspectV2 {

    // kmhoon.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* kmhoon.aop.order ..*(..))")
    private void allOrder() {} // 포인트컷 시그니처

    @Around("allOrder()") // point cut
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable { // advice
        log.info("[log] {}", joinPoint.getSignature()); // join point signature
        return joinPoint.proceed();
    }
}
