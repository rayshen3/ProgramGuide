#!/usr/bin/env python
from multiprocessing import Process, Lock, Value, Pool
import os
import time
import sys


def test_lock(i):
    with lock:
        print 'Run task:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
        sum.value += i

def test_nolock(i):
    print 'Run task:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
    sum.value += i

if __name__ == '__main__':
    '''
    Lock objects should only be shared between processes through inheritance
    Synchronized objects should only be shared between processes through inheritance
    '''
    sum = Value('i', 1)
    lock = Lock()

    p = Pool(3)

    for i in range(5):
        #p.apply_async(test_nolock, (1,))                       #ok
        p.apply_async(test_lock, (1,))                         #ok
        #p.apply(test_nolock, (1,))                             #ok

        #p.apply_async(test_nolock, (sum, 1))                   #err
        #p.apply_async(test, (lock,1))                          #err
        #p.apply_async(test, (lock, sum, 1))                    #err

        #p = Process(target=testFunc2, args=(lock,sum,1))       #ok
        #p = Process(target=testFunc2, args=(lock,1))           #ok

    p.close()
    p.join()
    print sum.value

