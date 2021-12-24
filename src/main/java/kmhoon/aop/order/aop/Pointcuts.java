package kmhoon.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {

    // kmhoon.aop.order 패키지와 하위 패키지
    @Pointcut("execution(* kmhoon.aop.order ..*(..))")
    public void allOrder() {} // 포인트컷 시그니처

    // 클래스 이름 패턴 *Service
    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {}

    // allOrder && allService
    @Pointcut("allOrder() && allService()")
    public void orderAndService() {}
}
