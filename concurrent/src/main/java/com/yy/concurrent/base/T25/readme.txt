总结：
1：对于map/set的选择使用
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
ArrayList
LinkedList
Collections.synchronizedXXX
CopyOnWriteList
Queue
	CocurrentLinkedQueue //concurrentArrayQueue
	BlockingQueue
		LinkedBQ
		ArrayBQ
		TransferQueue
		SynchronusQueue
	DelayQueue执行定时任务
		
	