#couding:utf-8
#!/usr/bin/env python
#2013-07-02
#
#multithread test
from time import sleep
import time
import thread
import sys


def print_status(a_lock):
	if a_lock.locked():
		print "locked"
	else:
		print "not locked"

a_lock = thread.allocate_lock()
print_status(a_lock)

a_lock.acquire()
print_status(a_lock)

a_lock.release()
print_status(a_lock)
##############################################################################################################
#exit(0)
##############################################################################################################
def hello():
	for i in range(5):
		h_ok.acquire()
		print "hello"
		w_ok.release()
def world():
	for i in range(5):
		w_ok.acquire()
		print "world"
		h_ok.release()

# main thread
print "use two threads to print hello&world"
h_ok = thread.allocate_lock()
w_ok = thread.allocate_lock()

w_ok.acquire()
thread.start_new_thread(hello,())
thread.start_new_thread(world,())
while(h_ok.locked() or w_ok.locked()):
	pass
 # !!it is necessary,in case main thread exit too early
