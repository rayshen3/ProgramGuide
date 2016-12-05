#!/usr/bin/env python
# coding:utf-8
#socket client

import socket

def main(port,ipaddr):
	clientsock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	clientsock.connect((ipaddr,port))
	value = raw_input("Input your question[You only have 50s]:")
	clientsock.send(str(value))
	print clientsock.recv(1024)
	clientsock.close()

if(__name__ == "__main__"):
	main(2000,"192.168.45.70")
