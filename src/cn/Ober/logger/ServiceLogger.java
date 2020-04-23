package cn.Ober.logger;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class ServiceLogger {
    private Logger log = Logger.getLogger(ServiceLogger.class);
    @Pointcut("execution(* cn.Ober..*(..))")
    // 为它创建一个方法
    public void pointcut() {

    }
        //最终通知
    @After("pointcut()")
    public void afterLog(JoinPoint jp) {
        log.info("调用 "+jp.getTarget()+" 的 "+ jp.getSignature().getName()+" 方法结束！！！");
    }
    //环绕通知
    @Around("pointcut()")
    public Object aroundLog(ProceedingJoinPoint jp) throws Throwable {
        log.info("调用 "+jp.getTarget()+" 的 " + jp.getSignature().getName()+" 方法,方法的入参:"
                + Arrays.toString(jp.getArgs()));
        Object result = null;
        try {
            result = jp.proceed();// 执行目标方法并得到它的返回值
            log.info("调用 "+jp.getTarget()+" 的 " + jp.getSignature().getName()+" 方法,方法的返回值:"
                    + result);
        }catch (Throwable e) {
            log.info("调用 "+jp.getTarget()+" 的 " + jp.getSignature().getName()+" 方法发生异常");
            throw e;
        }finally {
            log.info("调用 "+jp.getTarget()+" 的 " + jp.getSignature().getName()+" 方法执行结束！！");
        }
        return result;
    }
    //异常通知
    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void aterThrowing(JoinPoint jp,RuntimeException e) {
        log.info("调用 "+jp.getTarget()+" 的 "+ jp.getSignature().getName()+" 出现错误");
    }
    // 事务的操作，进行一些共享功能的置入
    // 调用保存方法前的增强方法
    @Before("pointcut()")
    public void before(JoinPoint jp) {
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature().getName()
                +" 方法。方法参数："+Arrays.toString(jp.getArgs()));
    }
    // 调用保存方法后的增强方法
    @AfterReturning(pointcut = "pointcut()",returning = "result")
    public void after(JoinPoint jp,Object result) {
        log.info("调用"+jp.getTarget()+" 的"+jp.getSignature().getName()
                +" 方法，方法返回值是：" + result);
    }
}
