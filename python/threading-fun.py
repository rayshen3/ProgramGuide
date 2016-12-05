#!/usr/bin/env /python
#threading e.g
#
#
import time

import threading
sleep = time.sleep


def  takumi(name,lab):
	sum = 0
	for i in xrange(lab+1):
		sum += i
		sleep(1)
	print name+": [1] ---  ["+str(lab)+"]     Sum: %s"   %(sum)



if(__name__ == '__main__'):
	mt1 = threading.Thread(target=takumi,args=('mt1',2,))
	mt2 = threading.Thread(target=takumi,args=('mt2',2,))
	mt3 = threading.Thread(target=takumi,args=('mt3',2,))
	mt1.start()
	mt2.start()
	mt3.start()
	mt1.join()
	mt2.join()
	mt3.join()
