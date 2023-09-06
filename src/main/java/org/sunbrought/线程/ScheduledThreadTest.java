package org.sunbrought.线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 测试周期性线程池ScheduledThread-scheduleAtFixedRate方法
 * initialDelay  表示首次延迟2秒执行
 * period        表示周期执行的时间为6秒，即表示会重复执行，重复执行的间隔时间为6秒
 * scheduleAtFixedRate ，是以上一个任务开始的时间计时，period时间过去后，检测上一个任务是否执行完毕，
 * 如果上一个任务执行完毕，则当前任务立即执行，如果上一个任务没有执行完毕，则需要等上一个任务执行完毕后立即执行。
 */
public class ScheduledThreadTest {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间="+sdf.format(new Date()));
        // 延迟2秒执行下一个任务
        for (int i = 0 ; i < 2 ; i++) {
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + ":begin=" + sdf.format(new Date()));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if ("pool-1-thread-1".equals(Thread.currentThread().getName())) {
                        int a = 1/0;
                    }

                    System.out.println(Thread.currentThread().getName() + ":end=" + sdf.format(new Date()));
                }
            }, 2, 4, TimeUnit.SECONDS);
        }
    }
}
