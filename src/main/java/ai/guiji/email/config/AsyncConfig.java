package ai.guiji.email.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * author:liyang
 * Date:2019/4/9 20:23
 * Description:
 */
@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    private static final Logger log = LoggerFactory.getLogger(AsyncConfig.class);

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor threadPool = new ThreadPoolTaskExecutor();
        int availableProcessorSize = Runtime.getRuntime().availableProcessors();
        threadPool.setCorePoolSize(availableProcessorSize * 2);//当前线程数
        threadPool.setMaxPoolSize(3000);// 最大线程数
        threadPool.setQueueCapacity(50000);//这个值的设定应该稍微大于请求高峰值
        threadPool.setWaitForTasksToCompleteOnShutdown(true);//等待任务在关机时完成--表明等待所有线程执行完
        threadPool.setAwaitTerminationSeconds(60 * 15);// 等待时间 （默认为0，此时立即停止），并没等待xx秒后强制停止
        threadPool.setThreadNamePrefix("OssAsyncThread-");//  线程名称前缀
        threadPool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPool.initialize(); // 初始化
        log.info("--------------------------》》》开启线程池, availableProcessors:{}", availableProcessorSize);
        return threadPool;
    }


    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {

        return new AsyncUncaughtExceptionHandler() {
            @Override
            public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
                log.info("-------------》》》捕获线程异常信息");
                log.info("Exception message - ", throwable);
                log.info("Method name - " + method.getName());
                for (Object param : objects) {
                    log.info("Parameter value - " + param);
                }
            }
        };

    }


}
