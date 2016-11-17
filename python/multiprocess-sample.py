#!/usr/bin/env python
from multiprocessing import Process, Manager, Lock, Value
import os
import time
import sys

#lock = Lock()
#manager = Manager()
#sum = manager.Value('tmp', 0)

sum = Value('i', 1)
#sum = 1

def testFunc(lock, sum, i):
    with lock:
    #lock.acquire()
        print 'pid:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
        sum.value += i
    #lock.release()
    #time.sleep(3)

def testFunc2(lock, i):
    with lock:
        print 'pid:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
        sum.value += i

if __name__ == '__main__':
    lock = Lock()

    plist = []
    for i in range(5):
        p = Process(target=testFunc, args=(lock, sum,1))
        #p = Process(target=testFunc2, args=(lock,1))
        p.start()
        plist.append(p)

    for p in plist:
        p.join()

    print sum.value
