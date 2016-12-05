#couding:utf-8
#!/usr/bin/env python
#2013-05-15
#
#multithread test
from time import sleep
import time
import thread
count = 1


def testone(sec,name,locks):
	global count
	print "%s is start at %s" %(name,time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
	for i in xrange(sec):
		print "The %s: %d times" %(name,i+1)
		sleep(1)
		count +=1
	print "%s is end at %s" %(name,time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
	locks.release()

	for u in xx:
		testone(xxxxxx)


def main():
	threadnum = 2
	#form a lock lists
	alllock = []
	for i in xrange(threadnum):
		lock = thread.allocate()
		#lock = thread.allocate_lock() is same to thread.allocate()
		lock.acquire()
		alllock.append(lock)

	print "==============Process start at %s =============\n" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
	thread.start_new_thread(testone,(3,"one",alllock[0]))
	thread.start_new_thread(testone,(3,"two",alllock[1]))

	for i in xrange(threadnum):
		while alllock[i].locked():
			pass

	print "\n==============Process end at %s ==============" %(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))
	print count
if(__name__ == '__main__'):
	main()
