#!/usr/bin/env /python
#threading e.g
#
#
import time

import threading

def  takumi(name,lab):
	sum = 0
	for i in xrange(lab+1):
		sum += i
#		sleep(1)
	print name+": [1] ---  ["+str(lab)+"]     Sum: %s"   %(sum)

class ProjectD():
	def __init__(self,func,args):
		self.func=func
		self.args=args
	def __call__(self):
		apply(self.func, self.args)


#asra = Projectd(takumi,("test01",3,))
#asra()


if(__name__ == '__main__'):
	mt = threading.Thread(target=ProjectD(takumi,("testobj",100,)))
	mt.start()
	#mt.join()


