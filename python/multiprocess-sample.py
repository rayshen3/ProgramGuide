#!/usr/bin/env python
from multiprocessing import Process, Manager, Lock, Value
import os
import time
import sys
import socket

#lock = Lock()
#manager = Manager()
#sum = manager.Value('tmp', 0)

sum = Value('i', 0)
#sum = 1

def testFunc(lock, sum, i):
    with lock:
    #lock.acquire()
        print 'pid:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
        sum.value += i
        time.sleep(2)
        sum.value += i
    #lock.release()
    #time.sleep(3)

def testFunc2(lock, i):
    with lock:
        print 'pid:'+str(os.getpid()) + ' now count %s + %s: ' %(str(sum.value), str(i))
        sum.value += i

def stats():
    host, port = '127.0.0.1', 1111
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    s.bind((host, port))
    s.listen(3)
    print 'Serving HTTP on port %d ...' % port
    while True:
        conn, addr = s.accept()
        request = conn.recv(1024)
        #print request
        #print type(request)
        response = 'http_ok:'+str(sum.value)+'\nhttp_err:'+str(sum.value)+'\n'
        conn.sendall(response)
        conn.close()



if __name__ == '__main__':
    lock = Lock()

    plist = []

    #counter worker
    for i in range(5):
        p_t = Process(target=testFunc, args=(lock, sum,1))
        #p = Process(target=testFunc2, args=(lock,1))
        p_t.start()
        plist.append(p_t)

    #http worker
    p_s = Process(target=stats)
    p_s.start()
    plist.append(p_s)

    for i in plist:
        i.join()
