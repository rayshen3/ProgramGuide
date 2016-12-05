#!/usr/bin/env python
#coding:utf8
import threading
from random import randint
from time import sleep,ctime
from Queue import Queue


class MyThread(threading.Thread):


	def __init__(self,func,args,name=''):
		threading.Thread.__init__(self)
		self.name = name
		self.func = func
		self.args = args
	def run(self):
		print'starting', self.name, 'at:', ctime()
		self.res = apply(self.func, self.args)
		print self.name, 'finished at:', ctime()



def writequeue(queue):
	queue.put('something',1)
	print "Producing Queue. Size now", queue.qsize()

def readqueue(queue):
	res = queue.get(1)
	print 'Consumed  Queue. Size now', queue.qsize()

def produce(queue, loops):
    for i in range(loops):
        writequeue(queue)
        sleep(randint(1,3))

def consume(queue, loops):
    for i in range(loops):
        readqueue(queue)
        sleep(randint(2,5))

def main():
    funcs = [produce, consume]
    nfuncs = range(len(funcs))
    nloops = randint(2, 5)
    queue = Queue(32)
    threads = []
    for i in nfuncs:
        t = MyThread(funcs[i], (queue, nloops),funcs[i].__name__)


        threads.append(t)


    for i in nfuncs:
        threads[i].start(

    for i in nfuncs:
        threads[i].join()
    print 'All Done!!'


if __name__ == '__main__':
    main()
