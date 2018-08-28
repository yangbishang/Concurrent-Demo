总结：
1：对于map/set的选择使用
不加锁
HashMap
TreeMap
LinkedHashMap

并发性不高的情况下：
Hashtable
Collections.sychronizedXXX

并发性高的情况下：
ConcurrentHashMap
ConcurrentSkipListMap       //高并发且排序

2：队列
不加锁：
ArrayList
LinkedList

加锁小并发
Collections.synchronizedXXX
CopyOnWriteList

高并发情况下的Queue
	CocurrentLinkedQueue //concurrentArrayQueue（非阻塞）
	BlockingQueue（阻塞）
		LinkedBlockingQueue
		ArrayBlockingQueue
		TransferQueue
		SynchronusQueue
	DelayQueue执行定时任务
		
	