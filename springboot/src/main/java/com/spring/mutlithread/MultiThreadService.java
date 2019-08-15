package com.spring.mutlithread;

import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-08-15 11:46
 */
@Service
public class MultiThreadService {
    private Object obj;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    public String get(){
        lock.readLock().lock();
        try{
            System.out.println("读数据开始" + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("读数据结束" + Thread.currentThread().getName());
        } catch (Exception e){
            System.out.println("read error");
        } finally {
            lock.readLock().unlock();
        }
        return null;
    }

    public void put(Object obj){
        lock.writeLock().lock();
        try{
            System.out.println("写数据开始" + Thread.currentThread().getName());
            Thread.sleep(new Random().nextInt(1000));
            this.obj = obj;
            System.out.println("写数据结束" + Thread.currentThread().getName());
        } catch (Exception e){
            System.out.println("write error");
        } finally {
            lock.writeLock().unlock();
        }
    }
}
